package com.example.loginwebapp;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/ForgotPasswordServlet")
public class ForgotPasswordServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String email = request.getParameter("email");
		
		if (UserData.emailExists(email)) {
			
			request.getSession().setAttribute("resetEmail", email);
			
			response.sendRedirect("ResetPassword.jsp");
	        
		} else {
			
			response.setContentType("text/html");
            response.getWriter().println("<h3>Email not registered yet.</h3>");
        	response.getWriter().println("Please <a href='Register.html'>Register here</a>.");
			
        	//response.getWriter().write("Email not registered");
		}
	}

}
