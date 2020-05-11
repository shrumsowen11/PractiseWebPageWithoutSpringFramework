<!DOCTYPE html>
<html>
<head>
<title>Logout</title>
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
	<br />
	<div class="container mb-3 mt-3">
		<img src="Images/beatifulScene.jfif" style="height: 180px"> <br />

		<!--****Make the connection to the preferred DataBase and Start Xamppp****  -->
		<span style="color: blue; font-size: 18px;">You have
			successfully logout from the application!!!!!!!!!!!!</span>


<%
response.setHeader("Cache-Control", "no-cache");

//Forces caches to obtain a new copy of the page from the origin server
response.setHeader("Cache-Control", "no-store");

//Directs caches not to store the page under any circumstance
response.setDateHeader("Expires", 0);

//Causes the proxy cache to see the page as "stale"
response.setHeader("Pragma", "no-cache");
//HTTP 1.0 backward enter code here

String userName = (String) session.getAttribute("plno");
if (null == userName) {
  //request.setAttribute("Error", "Session has ended.  Please logenter code herein.");
  RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
  rd.include(request, response);
  out.println("Session has ended.  Please login.");
}
%>


		<hr />

		<div class="form-group" style="width: 50%">

<!-- <a href = "index.jsp">
				<button type="submit" class="btn btn-success">Click here to Log In</button>
</a> -->

			 
				<%-- <%request.setAttribute("message" , "You have successfully logged out..");  %> 
					This is done if you want to process something in a seperate .jsp and then go(FORWARD) into an existing page --%>
				<%request.setAttribute("message" , "You have successfully logged out..");  %>
				<jsp:forward page="index.jsp" />
				
				
				<button type="submit" class="btn btn-primary">Click here to	Log In 
				
				</button>

			
		</div>
	</div>


</body>
</html>