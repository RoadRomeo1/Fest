package com.hbm.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hbm.connect.DataConnector;
import com.hbm.data.CoupleData;

public class CoupleDao {
public static int register(CoupleData data) {
	int i=0;
   Session session=DataConnector.getConnect();
   Transaction t=session.beginTransaction();
   
   session.save(data);
try {
   t.commit();
   session.close();
   i++;
   System.out.println("Data Saved.");
}catch (Exception e) {
t.rollback();
}
	return i;
}
}
