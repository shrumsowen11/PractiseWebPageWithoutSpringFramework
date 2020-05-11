<!DOCTYPE html>
<%@page import="java.util.Optional"%>
<%@page import="dataBase.dao.entity.EmployeeEntity"%>
<%@page import="dataBase.EmployeeDaoImpl"%>
<%@page import="dataBase.EmployeeDao"%>
<html>
<head>
<title>Creating new Password Page</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">


<!-- For Awesome Fonts Library -->
<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.12.1/css/all.css"
	crossorigin="anonymous">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">


<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>

<style>
.btn {
	background-color: DodgerBlue;
	border: none;
	color: white;
	padding: 12px 16px;
	font-size: 16px;
	cursor: pointer;
}
</style>

</head>
<body>

	<header style="height: 30px; background-color: #B70C1B;"></header>

	<div class="container mb-3 mt-3">
		<img src="Images/beatifulScene.jfif" style="height: 180px">

		<!--****Make the connection to the preferred DataBase and Start Xamppp****  -->

		<span style="font-size: 18px; color: red;">${message}</span>
		<hr />

		<div class="form-group" style="width: 50%">

			<form action="updateNewPassword" method = "post">
				<%String email = (String) request.getParameter("temail");%>
				<label for="password"> Enter a new password: </label> 
				<input type="password" class="form-control" name="password1"
					placeholder="Enter your new password.."> <br /> 
					
					<label for="password"> Re-enter a new password: </label> 
					<input type="password" class="form-control" name="password2"
					placeholder="Enter your new password again.."> <br />
					
					<!-- this might be done in servlet -->
					
					
					<%
					if(request.getParameter("password1") == null || request.getParameter("password2") == null){%>
						<a href="getNewPasswords.jsp">
						<%request.setAttribute("message", "Passwords not entered.");%>
						<button type="button" class="btn btn-primary">Submit</button>
						</a>
					<%} else if(request.getParameter("password1").equals(request.getParameter("password2"))){%>
						<button type="submit" class="btn btn-primary">Submit</button>
					<%}else{%>
					<a href="getNewPasswords.jsp">
						<%request.setAttribute("message", "Passwords do not match.");%>
						<button type="button" class="btn btn-primary">Submit</button>
						</a>
					<%}%>
					
				
			</form>
		</div>
	</div>
</body>
</html>