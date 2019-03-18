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
import com.hbm.data.HbmData;


@WebServlet("/com.hbm.redirecter.RedirecterForOldData")
public class RedirecterForOldData extends HttpServlet {
	private static final long serialVersionUID = 1L;
    	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	       response.setContentType("text/html");
	       PrintWriter pw=response.getWriter();
	      
	        String name=request.getParameter("sel");
	      	
	    	Session session=DataConnector.getConnect();
	    	Transaction t=session.beginTransaction();
	    	
	        String query="from HbmData data where name=:name";
	    	
	    	List<HbmData> lst=new ArrayList<HbmData>();
	    	
	    	Query q=session.createQuery(query);
	    	
	    	q.setParameter("name", name);
	    	lst=q.list();
	    	
	    	
	        Iterator it=lst.iterator();
	        
	        
	        while(it.hasNext()) {
	        	Object o=(Object)it.next();
	        	HbmData d=(HbmData)o;
	        	System.out.println("Name: "+d.getName());
	        }
	      request.setAttribute("lst", lst);
	      RequestDispatcher rd=request.getRequestDispatcher("Update_here");
	      rd.forward(request, response);
    	}

}
