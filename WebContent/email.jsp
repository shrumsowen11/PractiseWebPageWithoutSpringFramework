<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head><title>Email</title>

<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
  
  
  <!-- Self Made CSS file library import  -->

	<link rel="stylesheet"
	href="css/style.css"> 
	<!-- Self Made CSS file library import  -->
	
</head>
 <body
	style="background-image: url(Images/chinaTemple.jpg); background-size: cover">
<header class = "header"></header>
<br/>
<br/>
	<div class="container mb-3 mt-3">
	<font face = "Showcard Gothic" size = "5" style="color: #00ffaca6; ">WARLIONS</font>
	<a href="index.jsp">
					<button type="button" class="btn btn-success">Go Back</button>
				</a>
				<br />
				<br />
		<img src = "Images/beatifulScene.jfif" style = "height: 180px">
		<hr/>
		<%
			String s = request.getParameter("temail");
			String pp = request.getParameter("password");
			
			s=s.toUpperCase();
			StringBuilder stringBuilder = new StringBuilder(s);
			String reversed= stringBuilder.reverse().toString();
			boolean flag = false;
			String displayMessage = "";
			

			
		%>
		<h4> Your reversed String is  = <%= reversed %></h4>
		<hr/>
		<h4>
		<%	
			if(pp.length() < 8){
				displayMessage = "The password do not have 8 characters...!!";
			}
			else{
				displayMessage = "Congratulations. Login Successful!!!";
				flag = true;
			}
		%>
		</h4>
		<% if(flag){%>
		<img src = "Images/Congratulations.jfif" style = "height: 100px">
		<%}
		else{%>
		<img src = "Images/sorry.jfif" style = "height: 100px">
		<%} %>
		
		<%= displayMessage %>
		<br />
		<a href="index.jsp">
					<button type="button" class="btn btn-success">Go Back</button>
				</a>
		
</div>
<br/>
    <br/>
<footer class = "footer">@Copyright Banepali 2020</footer>
</body>
</html>