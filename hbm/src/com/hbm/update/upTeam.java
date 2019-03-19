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


@WebServlet("/com.hbm.update.upTeam")
public class upTeam extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		
		Session session=DataConnector.getConnect();
		
		String partner1=request.getParameter("partner1");
		String Opartner1=request.getParameter("Opartner1");
		String partner2=request.getParameter("partner2");
		String Opartner2=request.getParameter("Opartner2");
		String partner3=request.getParameter("partner3");
		String Opartner3=request.getParameter("Opartner3");
		String partner4=request.getParameter("partner4");
		String Opartner4=request.getParameter("Opartner4");
		String partner5=request.getParameter("partner5");
		String Opartner5=request.getParameter("Opartner5");
		String partner6=request.getParameter("partner6");
		String Opartner6=request.getParameter("Opartner6");
		String partner7=request.getParameter("partner7");
		String Opartner7=request.getParameter("Opartner7");
		String partner8=request.getParameter("partner8");
		String Opartner8=request.getParameter("Opartner8");
		String partner9=request.getParameter("partner9");
		String Opartner9=request.getParameter("Opartner9");
		String partner10=request.getParameter("partner10");
		String Opartner10=request.getParameter("Opartner10");
		String partner11=request.getParameter("partner11");
		String Opartner11=request.getParameter("Opartner11");
		String partner12=request.getParameter("partner12");
		String Opartner12=request.getParameter("Opartner12");
		String partner13=request.getParameter("partner13");
		String Opartner13=request.getParameter("Opartner13");
		String partner14=request.getParameter("partner14");
		String Opartner14=request.getParameter("Opartner14");
		String partner15=request.getParameter("partner15");
		String Opartner15=request.getParameter("Opartner15");
		String eventname=request.getParameter("event");
		String date=request.getParameter("date");
		String month=request.getParameter("month");
		String year=request.getParameter("year");
		
		
		int status=0;
		int status1=0;
		int i=0;
		
        Transaction t=session.beginTransaction();
		
		Query q=session.createQuery("update TeamData data set partner1=:name1,partner2=:name2,partner3=:name3,partner4=:name4,partner5=:name5,partner6=:name6,partner7=:name7,partner8=:name8,partner9=:name9,partner10=:name10,partner11=:name11,partner12=:name12,partner13=:name13,partner14=:name14,partner15=:name15,eventname=:eventname,date=:date where partner1=:Oname1");
        q.setParameter("Oname1", Opartner1);
		q.setParameter("name1", partner1);
        q.setParameter("name2", partner2);
        q.setParameter("name3", partner3);
        q.setParameter("name4", partner4);
        q.setParameter("name5", partner5);
        q.setParameter("name6", partner6);
        q.setParameter("name7", partner7);
        q.setParameter("name8", partner8);
        q.setParameter("name9", partner9);
        q.setParameter("name10", partner10);
        q.setParameter("name11", partner11);
        q.setParameter("name12", partner12);
        q.setParameter("name13", partner13);
        q.setParameter("name14", partner14);
        q.setParameter("name15", partner15);
        q.setParameter("eventname", eventname);
        q.setParameter("date", date+"-"+month+"-"+year);
		
		status=q.executeUpdate();
		t.commit();
		System.out.println(status);
		i++;
		
        Transaction t1=session.beginTransaction();
		
		Query q1=session.createQuery("update TeamData data set partner1=:name1,partner2=:name2,partner3=:name3,partner4=:name4,partner5=:name5,partner6=:name6,partner7=:name7,partner8=:name8,partner9=:name9,partne10=:name10,partner11=:name11,partner12=:name12,partner13=:name13,partner14=:name14,partner15=:name15,eventname=:eventname,date=:date where partner1=:name1");
        q1.setParameter("name1", partner1);
        q1.setParameter("name2", partner2);
        q1.setParameter("name3", partner3);
        q1.setParameter("name4", partner4);
        q1.setParameter("name5", partner5);
        q1.setParameter("name6", partner6);
        q1.setParameter("name7", partner7);
        q1.setParameter("name8", partner8);
        q1.setParameter("name9", partner9);
        q1.setParameter("name10", partner10);
        q1.setParameter("name11", partner11);
        q1.setParameter("name12", partner12);
        q1.setParameter("name13", partner13);
        q1.setParameter("name14", partner14);
        q1.setParameter("name15", partner15);
        q1.setParameter("eventname", eventname);
        q1.setParameter("date", date+"-"+month+"-"+year);
		
		status=q.executeUpdate();
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
