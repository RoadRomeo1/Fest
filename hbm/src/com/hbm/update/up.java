package com.hbm.update;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.hbm.connect.DataConnector;

@WebServlet("/com.hbm.update.up")
public class up extends HttpServlet {
	private static final long serialVersionUID = 1L;
   	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
   		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		int i=0;
	    String name=request.getParameter("name");
	    String Oname=request.getParameter("Oname");
	    String eventname=request.getParameter("event");
	    String date=request.getParameter("date");
	    String month=request.getParameter("month");
	    String year=request.getParameter("year");
		
		Session session=DataConnector.getConnect();
		int status=0;
		int status1=0;
		
		Transaction t=session.beginTransaction();
 		
        Query q=session.createQuery("update HbmData data set name=:name,eventname=:eventname,date=:date where name=:Oname");
        q.setParameter("name", name);
        q.setParameter("Oname", Oname);
        q.setParameter("eventname", eventname);
        q.setParameter("date", date+"-"+month+"-"+year);
     
        status=q.executeUpdate();
        System.out.println(status);
        t.commit();
        i++;
    
     	Transaction t1=session.beginTransaction();
 		
        Query q1=session.createQuery("update HbmData data set name=:name,eventname=:eventname,date=:date where name=:Oname");
        q1.setParameter("name", name);
        q1.setParameter("Oname", Oname);
        q1.setParameter("eventname", eventname);
        q1.setParameter("date", date+"-"+month+"-"+year);
     
        status1=q1.executeUpdate();
        t1.commit();
          i++;
		
		if(i>0&&i>0) {
        	    System.out.println("Status of data updation: "+status+" "+status1);
        	    System.out.println("Data Updated.");
				pw.println("<script type=\"text/javascript\">");
				pw.println("alert('Data Successfully Updated.');");
				pw.println("location='manage';");
				pw.println("</script>");
	           
		        session.close();
		               
         }
         else {
                System.out.println("Error Happened.");
				pw.println("<script type=\"text/javascript\">");
				pw.println("alert('Data is not updated please try again.');");
				pw.println("location='manage';");
				pw.println("</script>");
				session.close();
		          
         }
         
    }

}
