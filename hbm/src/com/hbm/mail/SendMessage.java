package com.hbm.mail;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/com.hbm.mail.SendMessage")
public class SendMessage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
           response.setContentType("text/html");
           PrintWriter pw=response.getWriter();
           
           String msg=request.getParameter("msg");
           String email=request.getParameter("email");
           String sub="New message by user: "+email;       
	       
           int i=MailSender_1.sendMail("himanshuvyas7339@gmail.com", sub, msg);
           
           if(i>0) {
        	    System.out.println("Message Send");
  				pw.println("<script type=\"text/javascript\">");	
  				pw.println("alert('we recieved your message we come to you very soon.');");
  				pw.println("location='Welcome';");
  				pw.println("</script>");

           }else {
        	    System.out.println("Message not send.");
  				pw.println("<script type=\"text/javascript\">");	
  				pw.println("alert('Sorry we dindn't recivee anything from your side please try again.');");
  				pw.println("location='Welcome';");
  				pw.println("</script>");

           }
           
	}


}
