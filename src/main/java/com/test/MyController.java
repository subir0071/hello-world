package com.test;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		String value = request.getParameter("intValue");
		int intValue = 0;
		if (!value.isEmpty()){
			intValue = Integer.parseInt(value);
		}
		System.out.println(intValue);
	}

}
