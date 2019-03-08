package com.hbm.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.hbm.data.EmailData;

public class EmailDao {
public static int register(EmailData data) {
	int i=0;
	StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure().build();
	Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();
	
	
	SessionFactory factory=meta.getSessionFactoryBuilder().build();
	Session session=factory.openSession();
	Transaction t=session.beginTransaction();
	
	
	session.save(data);
	t.commit();
	System.out.println("Data Saved.");
	session.close();
	i++;
	
	return i;
}
}
