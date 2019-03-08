package com.hbm.control;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hbm.dao.CoupleDao;
import com.hbm.data.CoupleData;

@WebServlet("/com.hbm.control.couple")
public class couple extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      response.setContentType("text/html");
      PrintWriter pw=response.getWriter();
      String partner1=request.getParameter("partner1");
      String partner2=request.getParameter("partner2");
      String eventname=request.getParameter("event");
      String date=request.getParameter("date");
      String month=request.getParameter("month");
      String year=request.getParameter("year");
      String othervent;	  
      
      if(eventname.equals("Other")) {
    	  othervent=request.getParameter("otherevent");
    	  System.out.println(othervent);
    	  CoupleData data=new CoupleData();
    	  data.setPartner1(partner1);
    	  data.setPartner2(partner2);
    	  data.setEventname(othervent);
    	  data.setDate(date+"-"+month+"-"+year);
    	 
    	  int i=CoupleDao.register(data);
    	  try{
    		  if(i>0) {
    			  System.out.println("Registered");
   				pw.println("<script type=\"text/javascript\">");
   				pw.println("alert('Data Successfully Registered.');");
   				pw.println("location='double.jsp';");
   				pw.println("</script>");

    		  }
    	  }catch (Exception e) {
		pw.println("Error: "+e.getMessage());
    	  }
      }
      else {
    	  CoupleData data=new CoupleData();
    	  data.setPartner1(partner1);
    	  data.setPartner2(partner2);
    	  data.setEventname(eventname);
    	  data.setDate(date+"-"+month+"-"+year);
    	 
    	  int i=CoupleDao.register(data);
    	  try{
    		  if(i>0) {
    			  System.out.println("Registered");
   				pw.println("<script type=\"text/javascript\">");
   				pw.println("alert('Data Successfully Registered.');");
   				pw.println("location='double.jsp';");
   				pw.println("</script>");

    		  }
    	  }catch (Exception e) {
		pw.println("Error: "+e.getMessage());
    	  }
    	  
      }
      
      
      
	}

}
