package com.hbm.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import com.hbm.data.HbmData;

public class HbmDao {
	
	static StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
	static Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();
	
	static SessionFactory factory=meta.getSessionFactoryBuilder().build();
	static Session session=factory.openSession();
	static Transaction t=session.beginTransaction();
	

	
	public static int register(HbmData data) {
	int i=0;
	
	session.save(data);
	i++;
try {		
	t.commit();
	System.out.println("Data Saved.");
	session.close();
}catch (Exception e) {
t.rollback();
}
	return i;
}
}
