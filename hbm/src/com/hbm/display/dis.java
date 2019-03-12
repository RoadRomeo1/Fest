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
import com.hbm.data.HbmData;


@WebServlet("/com.hbm.display.dis")

public class dis extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       
	   response.setContentType("text/html");
       PrintWriter pw=response.getWriter();
       Session session=DataConnector.getConnect();
       Transaction t=session.beginTransaction();
       
       List<HbmData> list=session.createQuery("from HbmData data").list();
   	   Iterator it=list.iterator();
   	
       List<HbmData> record=new ArrayList<HbmData>();
   	

   	while(it.hasNext()) {
   		Object o=(Object)it.next();
   		HbmData d=(HbmData)o;
   		System.out.println("Name: "+d.getName());
           record.add(d);		
   		  
   	}
     request.setAttribute("record",record);  
     RequestDispatcher rd=request.getRequestDispatcher("display");
     rd.forward(request, response);
     
	}

}
