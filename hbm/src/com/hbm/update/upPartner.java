package com.hbm.update;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.hbm.connect.DataConnector;


@WebServlet("/com.hbm.update.upPartner")
public class upPartner extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		
		Session session=DataConnector.getConnect();
		int status=0;
		int status1=0;
		int i=0;
		
		String partner1=request.getParameter("p1");
		String OldPartner1=request.getParameter("Op1");
		String partner2=request.getParameter("p2");
		String OldPartner2=request.getParameter("Op2");
		String eventname=request.getParameter("event");
		String date=request.getParameter("date");
		String month=request.getParameter("month");
		String year=request.getParameter("year");
		
		Transaction t=session.beginTransaction();
		
		Query q=session.createQuery("update CoupleData data set partner1=:name1,partner2=:name2,eventname=:eventname,date=:date where partner1=:name1");
        q.setParameter("name1", partner1);
        q.setParameter("name2", partner2);
        q.setParameter("eventname", eventname);
        q.setParameter("date", date+"-"+month+"-"+year);
		
		status=q.executeUpdate();
		t.commit();
		System.out.println(status);
		i++;
		
		
        Transaction t1=session.beginTransaction();
		
		Query q1=session.createQuery("update CoupleData data set partner1=:partner1,partner2=:partner2,eventname=:eventname,date=:date where partner1=:OldPartner1");
        q1.setParameter("partner1", partner1);
        q1.setParameter("partner2", partner2);
        q1.setParameter("eventname", eventname);
        q1.setParameter("date", date+"-"+month+"-"+year);
		q1.setParameter("OldPartner1", OldPartner1);
		
		status1=q1.executeUpdate();
		t1.commit();
		System.out.println(status1);
		i++;
		
		
		if(i>0) {
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
