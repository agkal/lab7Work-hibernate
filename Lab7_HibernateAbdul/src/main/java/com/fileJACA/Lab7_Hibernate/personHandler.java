
package com.fileJACA.Lab7_Hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;

public class personHandler {
	private Session thisSess = null;
	private SessionFactory factory_obj = null;
	
	//Initialize session factory
	public personHandler() {
		ManageSession.createSessionFactory();
		factory_obj = ManageSession.getSessionFactory();
	}
	
	//Close connection
	public void close() {
		factory_obj.close();
		ManageSession.getServiceRegistry().close();
	}
	
	//Add person to database
	public void addRecord(Person person) {
		thisSess = factory_obj.openSession();
		Transaction trans = thisSess.beginTransaction();
		thisSess.save(person);
		trans.commit();
		
		thisSess.close();
	}
	
	//Update person
	public void updatePerson(Person person) {
		thisSess = factory_obj.openSession();
		Transaction trans = thisSess.beginTransaction();
		thisSess.update(person);
		trans.commit();

		thisSess.close();
	}
	
	//Delete person
	public void deletePerson(int id) {
		thisSess = factory_obj.openSession();
		Transaction trans = thisSess.beginTransaction();
		Person person = (Person)thisSess.get(Person.class, id); 
        thisSess.delete(person); 
        trans.commit();

		thisSess.close();
	}
	
	//display person
	public void getPerson(int id) {
		thisSess = factory_obj.openSession();
		Transaction trans = thisSess.beginTransaction();
		Person person = (Person)thisSess.get(Person.class, id); 
		
		System.out.println("person ID: " + person.getId());
        System.out.println("Name: " + person.getName());
        System.out.println("FatherName: " + person.getFathername());
        System.out.println("Organization: " + person.getOrganization());
        System.out.println("Mobile: " + person.getMobile());
        trans.commit();

		thisSess.close();
	}
	
}
