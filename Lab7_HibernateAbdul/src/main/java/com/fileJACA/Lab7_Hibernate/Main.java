
package com.fileJACA.Lab7_Hibernate;

public class Main {
	public static void main(String[]args) {
		Person p_obj1 = new Person(11,"aaa","fdffdfd","Nust", "12312321");
		Person p_obj2 = new Person(22,"race","cond","desko", "12332");
		Person p_obj3 = new Person(33,"beg","rara","you", "123424");
		Person p_obj4 = new Person(44,"adg","lala","lega", "123424");
		Person p_obj5 = new Person(55,"bgr","xyz","lab7", "123424");
		
		
		personHandler object_count = new personHandler();
		
		object_count.addRecord(p_obj1);
		object_count.addRecord(p_obj2);
		object_count.addRecord(p_obj3);
		object_count.addRecord(p_obj4);
		object_count.addRecord(p_obj5);
		
		Person updated_person5 = new Person(33,"abdul","ghaffar","kalhoro", "0302xxx");
		
		object_count.updatePerson(updated_person5);
		
		object_count.getPerson(44);


		object_count.deletePerson(44);
		
		object_count.close();	

	}
}
