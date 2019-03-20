package com.hbm.redirecter;

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


@WebServlet("/com.hbm.redirecter.RedirecterForOldDataDeletion_Pair")
public class RedirecterForOldDataDeletion_Pair extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter pw=response.getWriter();
        String name=request.getParameter("sel");
        int i=0,status=0;
        
        Session session=DataConnector.getConnect();
        Transaction t=session.beginTransaction();
        
        
        Query q=session.createQuery("delete from CoupleData data where partner1=:name");
        q.setParameter("name", name);
        status=q.executeUpdate();
        i++;
        
        if(i>0&&status>0) {
       	 System.out.println("Data Deleted.");
		 System.out.println("Deletion Status: "+status+" "+i);
		 pw.println("<script type=\"text/javascript\">");
		 pw.println("alert('Data Successfully Deleted.');");
		 pw.println("location='manage';");
		 pw.println("</script>");
           
	     session.close();
	
        }
        else {
         System.out.println("Data is not Deleted.");
   		 System.out.println("Deletion Status: "+status+" "+i);
   		 pw.println("<script type=\"text/javascript\">");
   		 pw.println("alert('Some error happened data is not successfully deleted.');");
   		 pw.println("location='manage';");
   		 pw.println("</script>");
              
   	     session.close();
   		
        }
	}

}
