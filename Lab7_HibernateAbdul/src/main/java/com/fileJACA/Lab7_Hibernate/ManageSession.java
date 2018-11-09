

package com.fileJACA.Lab7_Hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;


public class ManageSession{
	private static SessionFactory sFctory;
    private static ServiceRegistry sRegistry;
    
    public static void createSessionFactory() {
	    Configuration configuration = new Configuration();
	    configuration.configure();
	    sRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
	    sFctory = configuration.addPackage("com.fileJACA.Lab7_HibernateAbdul").addAnnotatedClass(Person.class).buildSessionFactory(sRegistry);

    }

    public static ServiceRegistry getServiceRegistry(){
    	return sRegistry;
    }
    
    public static SessionFactory getSessionFactory(){
    	return sFctory;
    }

}
