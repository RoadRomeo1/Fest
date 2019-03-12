package com.hbm.control;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hbm.dao.TeamDao;
import com.hbm.data.TeamData;

@WebServlet("/com.hbm.control.team")
public class team extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    response.setContentType("text/html");
	PrintWriter pw=response.getWriter();
    
	String partner1=request.getParameter("partner1");
	String partner2=request.getParameter("partner2");
	String partner3=request.getParameter("partner3");
	String partner4=request.getParameter("partner4");
	String partner5=request.getParameter("partner5");
	String partner6=request.getParameter("partner6");
	String partner7=request.getParameter("partner7");
	String partner8=request.getParameter("partner8");
	String partner9=request.getParameter("partner9");
	String partner10=request.getParameter("partner10");
	String partner11=request.getParameter("partner11");
	String partner12=request.getParameter("partner12");
	String partner13=request.getParameter("partner13");
	String partner14=request.getParameter("partner14");
	String partner15=request.getParameter("partner15");
	String eventname=request.getParameter("event");
	String date=request.getParameter("date");
	String month=request.getParameter("month");
	String year=request.getParameter("year");
	String otherevent=request.getParameter("otherevent"); 
	
	if(otherevent.equals("Other")) {
	TeamData data=new TeamData();
	data.setPartner1(partner1);
	data.setPartner2(partner2);
	data.setPartner3(partner3);
	data.setPartner4(partner4);
	data.setPartner5(partner5);
	data.setPartner6(partner6);
	data.setPartner7(partner7);
	data.setPartner8(partner8);
	data.setPartner8(partner8);
	data.setPartner9(partner9);
	data.setPartner10(partner10);
	data.setPartner11(partner11);
	data.setPartner12(partner12);
	data.setPartner13(partner13);
	data.setPartner14(partner14);
	data.setPartner15(partner15);
	data.setEventname(otherevent);
	data.setDate(date+"-"+month+"-"+year);
	
	int i=TeamDao.register(data);
	try {
		if(i>0) {
			System.out.println("Registered");
				pw.println("<script type=\"text/javascript\">");
				pw.println("alert('Data Successfully Registered.');");
				pw.println("location='Welcome';");
				pw.println("</script>");

	}}catch (Exception e) {
     pw.println("Error: "+e.getMessage());
	}
	}
	else {
		TeamData data=new TeamData();
		data.setPartner1(partner1);
		data.setPartner2(partner2);
		data.setPartner3(partner3);
		data.setPartner4(partner4);
		data.setPartner5(partner5);
		data.setPartner6(partner6);
		data.setPartner7(partner7);
		data.setPartner8(partner8);
		data.setPartner8(partner8);
		data.setPartner9(partner9);
		data.setPartner10(partner10);
		data.setPartner11(partner11);
		data.setPartner12(partner12);
		data.setPartner13(partner13);
		data.setPartner14(partner14);
		data.setPartner15(partner15);
		data.setEventname(eventname);
		data.setDate(date+"-"+month+"-"+year);
		
		int i=TeamDao.register(data);
		try {
			if(i>0) {
				System.out.println("Registered");
					pw.println("<script type=\"text/javascript\">");
					pw.println("alert('Data Successfully Registered.');");
					pw.println("location='Welcome';");
					pw.println("</script>");

		}}catch (Exception e) {
	     pw.println("Error: "+e.getMessage());
		}		
	}
	
	
	
			
	
	}

}
