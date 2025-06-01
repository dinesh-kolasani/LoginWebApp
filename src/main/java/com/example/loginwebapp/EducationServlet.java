package com.example.loginwebapp;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/EducationServlet")
public class EducationServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String qualification = request.getParameter("qualification");
        String year = request.getParameter("passoutYear");
        String percentage = request.getParameter("percentage");
        
        System.out.println("qualification: " + qualification + " passoutYear: " + year + " percentage: " + percentage);
        
        //response.getWriter().write("Education details saved");
        
        response.sendRedirect("Dashboard.jsp");
	}

}
