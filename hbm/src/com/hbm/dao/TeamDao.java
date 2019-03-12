package com.hbm.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hbm.connect.DataConnector;
import com.hbm.data.TeamData;

public class TeamDao {
public static int register(TeamData data) {
	int i=0;
	Session session=DataConnector.getConnect();
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
