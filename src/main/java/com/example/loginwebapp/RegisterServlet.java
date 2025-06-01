package com.example.loginwebapp;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
response.setContentType("text");
		
		String firstName = request.getParameter("fname");
		String lastName = request.getParameter("lname");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String gender = request.getParameter("gender");
		
		System.out.println("firstName: " + firstName + " lastName: " + lastName + " email: " + email + " password: " + password + " gender: "+ gender);
	
		String errMsg = "";
		
		if (firstName == null || firstName.isBlank()) {
			
			errMsg = "fill first name";
		} else if (lastName == null || lastName.isBlank()) {
			
			errMsg = "fill last name";
		} else if (email == null || email.isBlank()) {
			
			errMsg = "fill email";
		} else if (UserData.emailExists(email)) {
			
			System.out.println("user name from user data is : " + UserData.getUser(email).getName());
			
			errMsg = "user exists";
		} else if (password == null || password.isBlank()) {
			
			errMsg = "fill password";
		} else if (gender == null || gender.isBlank()) {
			
			errMsg = "choose gender";
		} else {
			
			UserModel user = new UserModel(firstName, lastName, email, password, gender);
			UserData.registerNewUser(user);
			
			request.getSession().setAttribute("email", email);
			request.getSession().setAttribute("userName",  user.getName());
			
			response.sendRedirect("Dashboard.jsp");
		}
		
		response.getWriter().println(errMsg);
	}
	

}
