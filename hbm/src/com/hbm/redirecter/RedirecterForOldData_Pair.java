package com.hbm.redirecter;

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

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hbm.connect.DataConnector;
import com.hbm.data.CoupleData;

@WebServlet("/com.hbm.redirecter.RedirecterForOldData_Pair")
public class RedirecterForOldData_Pair extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     response.setContentType("tet/html");
     PrintWriter pw=response.getWriter();
      
     
     String name=request.getParameter("sel");
     
     Session session=DataConnector.getConnect();
     Transaction t=session.beginTransaction();
     
     Query q=session.createQuery("from CoupleData data where partner1=:partner1");
     
     List<CoupleData> lst=new ArrayList<CoupleData>();
     
     q.setParameter("partner1", name);
     
     lst=q.list();
     
     Iterator it=lst.iterator();
     
     
     while(it.hasNext()) {
    	 Object o=(Object)it.next();
    	 CoupleData d=(CoupleData)o;
    	 System.out.println("Partner1: "+d.getPartner1());
    	 System.out.println("Partner2: "+d.getPartner2());
    	 System.out.println("Event: "+d.getEventname());
    	 System.out.println("Date: "+d.getDate());
    	   }
     
     request.setAttribute("lst", lst);
     RequestDispatcher rd=request.getRequestDispatcher("Update_pair_here");
     rd.forward(request,response);
     
	}

}
