package com.hbm.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.hbm.data.TeamData;

public class TeamDao {
public static int register(TeamData data) {
	int i=0;
	StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
	Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();
	
	SessionFactory factory=meta.getSessionFactoryBuilder().build();
	Session session=factory.openSession();
	Transaction t=session.beginTransaction();
	
try {	
	session.save(data);
	t.commit();
	session.close();
	System.out.println("Data Saved.");
	i++;
}
catch (Exception e) {
t.rollback();
}
	return i;
}
}
