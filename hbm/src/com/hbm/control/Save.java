package com.hbm.control;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.hbm.dao.HbmDao;
import com.hbm.data.HbmData;

@WebServlet("/com.hbm.control.Save")
public class Save extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter pw=response.getWriter();
        String name=request.getParameter("name");
        String event=request.getParameter("event");
    	String date=request.getParameter("date");
    	String month=request.getParameter("month");
    	String year=request.getParameter("year");
    	String otherevent=request.getParameter("otherevent");
    	
    	if(event.equals("Other")) {
                 HbmData data=new HbmData();
         		 data.setName(name);
         		 data.setEventname(otherevent);
         		 data.setDate(date+"-"+month+"-"+year);
         		 	int i=HbmDao.register(data);
         	    	try {
         	    		if(i>0) {
         	    		System.out.println("Registered");
         				pw.println("<script type=\"text/javascript\">");
         				pw.println("alert('Data Successfully Registered.');");
         				pw.println("location='single.jsp';");
         				pw.println("</script>");

         	    		}
         	    	}catch (Exception e) {
         			pw.println("Error: "+e.getMessage());
         	    	}
	    }
    		 else {
    	HbmData data=new HbmData();
    	data.setName(name);
    	data.setEventname(event);
    	data.setDate(date+"-"+month+"-"+year);
    	
    	int i=HbmDao.register(data);
    	try {
    		if(i>0) {
    		System.out.println("Registered");
			pw.println("<script type=\"text/javascript\">");
			pw.println("alert('Data Successfully Registered.');");
			pw.println("location='single.jsp';");
			pw.println("</script>");

    		}
    	}catch (Exception e) {
		pw.println("Error: "+e.getMessage());
    	}
    	}
	}

}
