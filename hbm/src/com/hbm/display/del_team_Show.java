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

/**
 * Servlet implementation class del_team_Show
 */
@WebServlet("/com.hbm.display.del_team_Show")
public class del_team_Show extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       response.setContentType("text/html");
       PrintWriter pw=response.getWriter();
        
	   
       Session session=DataConnector.getConnect();
       Transaction t=session.beginTransaction();
       
       List list=session.createQuery("from TeamData data").list();
       Iterator it=list.iterator();
       
       List<TeamData> record=new ArrayList<TeamData>();
       
       while(it.hasNext()) {
    	   Object o=(Object)it.next();
    	   TeamData d=(TeamData)o;
    	   System.out.println("Captain: "+d.getPartner1());
           record.add(d);
       }
    
       request.setAttribute("record", record);
       RequestDispatcher rd=request.getRequestDispatcher("delete_team_here");
       rd.forward(request, response);
       
	}
	}
