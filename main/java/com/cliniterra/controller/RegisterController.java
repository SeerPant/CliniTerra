package com.cliniterra.controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * @author Seer Pant 23047511
 */

@WebServlet(asyncSupported = true, urlPatterns = "/register")

public class RegisterController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//redirect to JSP page using methods below:
		// sendRedirect== accepts string & requestDispatcher 
		//response.sendRedirect("WEB-INF/pages/home.jsp"); this is jot do not use
		request.getRequestDispatcher("WEB-INF/pages/registration.jsp").forward(request, response);
		
	}

}
