package com.cliniterra.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Seer Pant 23047511
 */
@WebServlet(asyncSupported = true, urlPatterns= {"/home","/"})
public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public HomeController() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//redirect to JSP page using methods below:
		// sendRedirect== accepts string & requestDispatcher 
		//response.sendRedirect("WEB-INF/pages/home.jsp"); this is jot do not use
		request.getRequestDispatcher("WEB-INF/pages/home.jsp").forward(request, response);
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
