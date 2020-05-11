<!DOCTYPE html>
<%@page import="java.util.Optional"%>
<%@page import="dataBase.dao.entity.EmployeeEntity"%>
<%@page import="dataBase.EmployeeDaoImpl"%>
<%@page import="dataBase.EmployeeDao"%>
<html>
<head>
<title>Forgot Password</title>
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

			<form action="validateEmailServlet" method="post">

			<!-- when you do not write this "method", then automatically, it calls the doGet() method and this get method will show all the data(password also) in the browser title. -->
			<!--methods are "post(secured), put, delete, patch, get(default and not secure)"  -->
			<!-- whenever the submit button is clicked, then this page is called -->

			<label for="email"> Email Address: </label> <input type="email"
				class="form-control" name="temail" placeholder="Enter your Email">
			<br />
			

			
 		
		

				<button class="btn btn-info">
					<!--  FA icons -->
					<i class="fa fa-search-alt fa-sm"></i>Search

				</button>
			</form>
			</div>
		</div>
</body>
</html>