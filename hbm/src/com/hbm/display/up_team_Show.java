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
import com.hbm.data.TeamData;

@WebServlet("/com.hbm.display.up_team_Show")
public class up_team_Show extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      response.setContentType("text/html");
      PrintWriter pw=response.getWriter();
      
      String name=request.getParameter("sel");
      
      Session session=DataConnector.getConnect();
      Transaction t=session.beginTransaction();
      
      
      List list=session.createQuery("from TeamData data").list();
      Iterator it=list.iterator();
      
      List<TeamData> record=new ArrayList<TeamData>();
      
      while(it.hasNext()){
    	  Object o=(Object)it.next();
    	  TeamData td=(TeamData)o;
    	  System.out.println("Captain: "+td.getPartner1());
    	  record.add(td);
      }
      
      request.setAttribute("record", record);
      RequestDispatcher rd=request.getRequestDispatcher("update_team");
      rd.forward(request,response);

	}
}
