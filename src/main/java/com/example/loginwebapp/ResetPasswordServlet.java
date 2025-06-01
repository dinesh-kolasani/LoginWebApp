package com.example.loginwebapp;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ResetPasswordServlet")
public class ResetPasswordServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		HttpSession session = request.getSession();
        String email = (String) session.getAttribute("resetEmail");
	
        String newPassword = request.getParameter("newPassword");
        String confirmPassword = request.getParameter("confirmPassword");
        
        System.out.println("Reset Passwor email: " + email);
        
        if (newPassword == null || newPassword.isBlank()) {
        	
        	response.getWriter().write("fill new password");
        } else if (confirmPassword == null || confirmPassword.isBlank()) {
        	
        	response.getWriter().write("fill confirm password");
        } else if (!newPassword.equals(confirmPassword)) {
        	
        	
        	response.getWriter().write("Passwords not match");
        	
        } else { 
        	
        	System.out.println("Password updated");
        	
        	UserData.updateNewPassword(email, newPassword);
        	request.getSession().removeAttribute("resetEmail");
        	
        	
        	response.setContentType("text/html");
            response.getWriter().println("<h3>Passwords updated Successful!</h3>");
        	response.getWriter().println(UserData.getUser(email).getName() + ", Please <a href='Login.html'>Login</a> again.");
            
        	//response.sendRedirect("Login.html");
        	
        }
	}

}
