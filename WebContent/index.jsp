<!DOCTYPE html>
<%@page import="dataBase.dao.entity.EmployeeEntity"%>
<%@page import="dataBase.EmployeeDaoImpl"%>
<%@page import="dataBase.EmployeeDao"%>
<html>
<head>
<title>SampleLogIn</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
</head>
<body>

	<header style="height: 30px; background-color: #B70C1B;"></header>

	<div class="container mb-3 mt-3">
		 <img src="Images/beatifulScene.jfif"
			style="height: 180px">
				<!--****Make the connection to the preferred DataBase and Start Xamppp****  -->
 
	

		<span style ="font-size: 18px; color: red;">${message}</span>
		<!-- span for making the "passed message" beautiful -->
		
		<hr/>
		
		<div class="form-group" style="width: 50%">

			<form action="loginServlet" method="post">
			<!-- when you do not write this "method", then automatically, it calls the doGet() method and this get method will show all the data(password also) in the browser title. -->
			<!--methods are "post(secured), put, delete, patch, get(default and not secure)"  -->
				<!-- whenever the submit button is clicked, then this page is called -->

				<label for="email"> Email Address: </label> 
				<input type="email"
					class="form-control" name="temail" placeholder="Enter your Email">
				<br /> 
				
				<label for="password"> Password: </label> 
				<input
					type="password" class="form-control" name="password"
					placeholder="Enter your password"> 
				<br />
				
				
				
				
				
				
				
				<!-- For Checking if the login credentials are correct through the .jsp, but this is not in good practice. We use Servlet instead. -->
				<!-- Why? Because the website area will be shown to the users and then they will now all the credentials. -->
				
				
				<!-- ***************So I have made this below code commented for future study reference**************** -->
			
				<%--
				 
				<%
				boolean match =false;
				try{
				EmployeeDao employeeDao = new EmployeeDaoImpl();
				EmployeeEntity employeeEntity =  employeeDao.employeeByEmail(request.getParameter("temail"));
				if(employeeEntity == null){
					request.setAttribute("message","Please register/sign up first.");
				}
				if(employeeEntity.getPassword() ==  request.getParameter("password")){
					match = true;
				}
				}catch(Exception e){
					e.printStackTrace();
				}
				
				if(match){%>
				<button type="submit" class="btn btn-primary">Log In</button>
				<%} else{%>
					<a href="index.jsp">
					<%request.setAttribute("message","Incorrect Email or password.");%>
					<button type="button" class="btn btn-primary">Log In</button>
					</a>
				<% }%>
				 
				--%>  
			
				<!-- ***************So I have made this above code commented for future study reference**************** -->
				
				
				
				
				
				
				
				<button type="submit" class="btn btn-primary">Log In</button>
				<a href="register.jsp">
					<button type="button" class="btn btn-success">Register/Sign Up</button>
				</a>
				<button type="reset" class="btn btn-danger">Clear</button>
				<br/>
				
				<br/>
				
				
				<a href="forgotPassword.jsp"> <font  color = "red"><u>Forgot Password?</u></font></a>
				
			</form>

		</div>

	</div>
</body>
</html>