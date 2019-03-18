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
import com.hbm.data.TeamData;

@WebServlet("/com.hbm.redirecter.RedirecterForOldData_Team")
public class RedirecterForOldData_Team extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    response.setContentType("text/html");
    PrintWriter pw=response.getWriter();
    
    
    String name=request.getParameter("sel");
    
    Session session=DataConnector.getConnect();
    Transaction t=session.beginTransaction();
    
    
    Query q=session.createQuery("from TeamData data where partner1=:partner1");
    q.setParameter("partner1",name);
    
    List<TeamData> lst=new ArrayList<TeamData>();
    lst=q.list();
    Iterator it=lst.iterator();
    
     while(it.hasNext()) {
    	 Object o=(Object)it.next();
    	 TeamData d=(TeamData)o;
    	 System.out.println("Captain: "+d.getPartner1());
    	 System.out.println("Event: "+d.getEventname());
    	 System.out.println("Date: "+d.getDate());
    	 
     }
         
     request.setAttribute("lst", lst);
     RequestDispatcher rd=request.getRequestDispatcher("Update_team_here");
     rd.forward(request, response);
     
     
     
	}

}
