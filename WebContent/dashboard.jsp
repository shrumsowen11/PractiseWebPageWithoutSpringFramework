<!DOCTYPE html>
<html>
<head>
<title>Bootstrap Example</title>
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

	<header style="height: 30px; background-color: #B70C1B;">
	
	
	<!-- Add a welcome message we the name in it -->
	</header>

	<div class="container mb-3 mt-3">
		 <img src="Images/beatifulScene.jfif"
			style="height: 180px">
				<!--****Make the connection to the preferred DataBase and Start Xamppp****  -->
 
		<a href="showAllData.jsp"> <!-- Simple Button --> <!-- <button>Show Employees</button> -->
			<button type="button" class="btn btn-info">Employees</button>
		</a>
		
		<a href="contacts.jsp"> <!-- Simple Button --> <!-- <button>Show Employees</button> -->
			<button type="button" class="btn btn-info">Contact Us</button>
		</a>
		
		
		<!-- You can make a file like "process.jsp" as we go from 
		"register.jsp" to "process.jsp", this process file process 
		the request and sends back to the "register.jsp" page
		similarly, for logOutProcess, after the LogOut button is clicked,
		it goes to "LogOutProcess.jsp" and the processes it 
		and sends back to the "index.jsp" page. -->
		
		<a href="logout.jsp"> <!-- Simple Button --> <!-- <button>Show Employees</button> -->
			<button type="button" class="btn btn-warning">LogOut</button>
		</a>
		
		<hr />

			
		</div>

	</div>
</body>
</html>
