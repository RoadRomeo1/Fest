package com.hbm.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hbm.connect.DataConnector;
import com.hbm.data.HbmData;

public class HbmDao {
	
	

	
	public static int register(HbmData data) {
	int i=0;
	 Session session=DataConnector.getConnect();
	 Transaction t=session.beginTransaction();
	
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
