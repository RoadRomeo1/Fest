package com.hbm.display;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hbm.connect.DataConnector;
import com.hbm.data.CoupleData;

@WebServlet("/com.hbm.display.del_pair_Show")
public class del_pair_Show extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 response.setContentType("text/html");
	 PrintWriter pw=response.getWriter();
	 
	 Session session=DataConnector.getConnect();
	 Transaction t=session.beginTransaction();
	 
	 List list=session.createQuery("from CoupleData data").list();
	 Iterator it=list.iterator();
	 
	 List<CoupleData> record=new ArrayList<CoupleData>();
	 
	 while(it.hasNext()) {
		 Object o=(Object)it.next();
		 CoupleData d=(CoupleData)o;
		 System.out.println("Partner1: "+d.getPartner1()+" "+"partner2: "+d.getPartner2());
		 record.add(d);
	 }
	 
	 request.setAttribute("record", record);
	 RequestDispatcher rd=request.getRequestDispatcher("delete_pair_here");
	 rd.forward(request, response);
	 
	}

}
