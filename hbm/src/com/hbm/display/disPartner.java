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

@WebServlet("/com.hbm.display.disPartner")
public class disPartner extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
      
		 Session session=DataConnector.getConnect();
		 Transaction t=session.beginTransaction();
		 
		 List list=session.createQuery("from CoupleData cdata").list();
		 Iterator it=list.iterator();
		 
         List<CoupleData> record=new ArrayList<CoupleData>();  		 
         
         while(it.hasNext()) {
        	 Object o=(Object)it.next();
        	 CoupleData cd=(CoupleData)o;
        	 System.out.println("Partner1: "+cd.getPartner1()+" Partner2: "+cd.getPartner2());
        	 record.add(cd);
         }
          
	     request.setAttribute("record", record);
	     RequestDispatcher rd=request.getRequestDispatcher("display_partner");
	     rd.forward(request, response);
	     
	}

}
