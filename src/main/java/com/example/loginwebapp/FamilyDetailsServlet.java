package com.example.loginwebapp;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/FamilyDetailsServlet")
public class FamilyDetailsServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String mother = request.getParameter("motherName");
		String father = request.getParameter("fatherName");
		String siblings = request.getParameter("siblings");
		System.out.println("mother Name: " + mother + " fatherName: " + father + " siblings: " + siblings);
		
		//response.getWriter().write("Family details saved");
		response.sendRedirect("Dashboard.jsp");
	}

}
