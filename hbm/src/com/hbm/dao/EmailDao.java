package com.hbm.dao;

import java.util.Iterator;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hbm.connect.DataConnector;
import com.hbm.data.EmailData;import sun.launcher.resources.launcher;

public class EmailDao {
public static int register(EmailData data) {
	int i=0,count=0;
	
	Session session=DataConnector.getConnect();
	Transaction t=session.beginTransaction();
	 String email=data.getEmail();  

	List list=session.createQuery("from EmailData data").list();
	Iterator it=list.iterator();
	
	
	
	while(it.hasNext()) {
		Object o=(Object)it.next();
		EmailData d=(EmailData)o;
		System.out.println("Email: "+d.getEmail());
		if(email.equals(d.getEmail())) {
			count++;
			break;
		}
	}
     	
	
	
	if(count>0) {
		i=2;	
		System.out.println("Already Subsribers.");
	}else if(count<=0) {
		i=1;
		session.save(data);
		t.commit();
		System.out.println("Data Saved.");
		session.close();
	    }
	return i;
}
}
