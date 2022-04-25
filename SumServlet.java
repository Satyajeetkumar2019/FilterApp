package com.nt.Servlet;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class SumServlet extends HttpServlet {
	public  void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	//create variable 
		PrintWriter pw=null;
		int val1=0;
		int val2=0;
		int sum=0;
		//General seting 
		pw=res.getWriter();
		res.setContentType("text/html");
		//read data from form 1
		val1=Integer.parseInt(req.getParameter("val1"));
		val1=Integer.parseInt(req.getParameter("val1"));
		//write b.logic
		sum= sum+val1+val2;
		//write Response object 
		pw.println("<h1> Sum of the two Digit is = "+sum+"</h1>");
		//close stream 
		pw.close();	
	}//end of the method
	public  void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doGet(req, res);
	}//end of the method 

}//end of the class
