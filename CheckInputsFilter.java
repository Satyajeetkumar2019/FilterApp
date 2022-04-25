package com.nt.Filter;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
public class CheckInputsFilter  implements Filter{
	public void  CheckInputFilter () {

		System.out.println("CheckInputsFilter :0-param construct ");
		
	}
public void init(FilterConfig con)throws ServletException {
	System.out.println("CheckInputsFilter();");
	
	
}//end of the method 


	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("CheckInputsFilter();");
		//General seting 
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		int val1=0;
		int val2=0;
		//read from data 
		val1=Integer.parseInt(req.getParameter("val1"));
		val1=Integer.parseInt(req.getParameter("val1"));
		//Check input 
		if(val1<0||val2<0) {
		pw.println("<h4 style='color:red;'>input must be Positive</h4>");	
			
		}else {
			
			System.out.println("CheckInputsFilter :before chain doFilter:");
			chain.doFilter(req,res);
			System.out.println("CheckInputsFilter :after chain doFilter:");
		}//end else block 
	}//end of the method
	public void destroy() {
		System.out.println("CheckInputsFilter :Destroyed() method :");
		
	}
	
}