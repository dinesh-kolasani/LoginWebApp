package com.example.loginwebapp;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		UserModel user = UserData.getUser(email);
		
		
		if (user != null && user.getPassword().equals(password)) {
			
			request.getSession().setAttribute("email", email);
			
			System.out.println("email: " + email + "password: " + password);
			
			request.getSession().setAttribute("userName",  user.getName());
			
			response.sendRedirect("Dashboard.jsp");
			
		} else {
			
			response.getWriter().println("Invalid login");
		}
		
	}
	
	

}
