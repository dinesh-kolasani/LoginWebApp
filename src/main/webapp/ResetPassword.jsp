<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<title>Reset Password</title>
	<link rel="stylesheet" href="CSS/Style.css">
</head>
<body>
	<div class="container">
		<h2>Reset Password</h2>		
		<form action="ResetPasswordServlet" method="post">
			<div class="form-group">
				<label>Email</label>
				<div class="static-email">${resetEmail}</div>
				<!-- <input type="email" value="" readonly> -->
				
			</div>
			<div class="form-group">
				<label>New Password</label>
				<input type="password" name="newPassword">
			</div>
			<div class="form-group">
				<label>Confirm Password</label>
				<input type="password" name="confirmPassword">
			</div>
			<div class="form-group">
				<button type="submit" value="Reset Password" class="gradientBtn">submit</button>
			</div>
		</form>
	</div>
</body>
</html>