<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<meta charset="UTF-8">
<head>
    <title>Dashboard</title>
    <link rel="stylesheet" href="CSS/Style.css">
</head>

<body>
	<div class="dashboard-container">
		<div class="sidebar">
			<nav>
				<ul>
					<li><a href="Dashboard.jsp">Dashboard</a></li>
					<li><a href="Address.html">Address</a></li>
					<li><a href="Education.html">Education</a></li>
					<li><a href="Family.html">Family Details </a></li>
					<li><a href="Login.html">Logout</a></li>
				</ul>
			</nav>
		</div>
		<div class="main-content">
			<form action="DashbordServlet" method="post">
				<div class="form-group">
					<h3>Dashboard</h3>
					<p>Welcome to your dashboard</p>
					<label>Your Name: ${userName}</label>
					<label>Your Email: ${email}</label>
					<% if (session.getAttribute("userAddress") != null) { %>
   					 	<label>Address Details: <%= session.getAttribute("userAddress") %></label>
					<% } %>
				</div>
			</form>
		</div>
	</div>
</body>
</html>
