package com.example.loginwebapp;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/AddressServlet")
public class AddressServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String city = request.getParameter("city");
        String state = request.getParameter("state");
        String country = request.getParameter("country");
        
        String errMsg = "";
        
        if (city == null || city.isBlank()) {
        	
        	errMsg = "Enter your City name";
        } else if (state == null || state.isBlank()) {
        	
        	errMsg = "Enter your State name";
        } else if (country == null || country.isBlank()) {
        	
        	errMsg = "Enter your Country name";
        } else {
        	
        	String email = (String) request.getSession().getAttribute("email");
        	System.out.println("Address get Attribute email: " + email );
        	
        	AddressModel address = new AddressModel(city, state, country);
        	UserData.saveAddress(email, address);
        	
        	request.getSession().setAttribute("userAddress", UserData.getAddress(email).getFullAddress());
        	response.sendRedirect("Dashboard.jsp");
        	
        }
        
        System.out.println("city: " + city + " state: " + state + " country: " + country);
		
        response.getWriter().println(errMsg);
	}

}
