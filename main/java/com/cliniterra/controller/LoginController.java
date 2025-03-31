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

@WebServlet(asyncSupported = true, urlPatterns="/login")

public class LoginController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//redirect to JSP page using methods below:
		// sendRedirect== accepts string & requestDispatcher 
		//response.sendRedirect("WEB-INF/pages/home.jsp"); this is jot do not use
		request.getRequestDispatcher("WEB-INF/pages/login.jsp").forward(request, response);
		
		
	}
	
	 
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws {
//		String username = req.getParameter("username");
//		String password = req.getParameter("password");
//	}

}
