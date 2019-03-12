package com.hbm.mail;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.hbm.dao.EmailDao;
import com.hbm.data.EmailData;

@WebServlet("/com.hbm.mail.SaveEmail")
public class SaveEmail extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            response.setContentType("text/html");
            PrintWriter pw=response.getWriter();
            
            String email=request.getParameter("email");

             EmailData data=new EmailData();
	         data.setEmail(email);
	         int i=EmailDao.register(data);
	         try {
	         if(i>0) {
	        	 if(i==1) {
	        	System.out.println("New Subscriber");
	        	System.out.println(email);
   				pw.println("<script type=\"text/javascript\">");	
   				pw.println("alert('Congratulation!!! you are now Subscriber.');");
   				pw.println("location='Welcome';");
   				pw.println("</script>");
	        	 }
	        	 else if(i==2) {
	        		    pw.println("<script type=\"text/javascript\">");	
	    				pw.println("alert('You are already a subscriber.');");
	    				pw.println("location='Welcome';");
	    				pw.println("</script>");
	 	        		 
	        	 }
	         }
	         }catch (Exception e) {
                pw.println("Error: "+e.getMessage());
            }
	         
	         
	         
	        		 
	}

}
