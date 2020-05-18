<!DOCTYPE html>
<html>
<head>
<title>AudiShow</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
</head>
<body>

	<header style ="height: 30px; background-color: #B70C1B;"></header>
	 	
	<div class ="container">
	
		<img src = "Images/AudiWelcome.jfif" style = "height: 100px ;width: fit-content;" align = "middle">
			<a href = "Models.jsp">	
   				   				<button type="button" class="btn btn-info">Models</button>
   				 </a>
		<hr/>
		
		<div class ="form-group" style = "width: 75%">
		
		<form action = "email.jsp">   <!-- whenever the submit button is clicked, then this page is called -->
		
			<label for = "email"> Email Address: </label>
			<input type = "email" class = "form-control" name = "temail" placeholder = "Enter your Email">
			<br/>
			
			<label for = "password"> Password: </label>
			<input type = "password" class = "form-control" name = "password" placeholder = "Enter your password">
			<br/>
			
				<button type="submit" class="btn btn-primary">Submit</button>
   				<button type="reset" class="btn btn-danger">Clear</button>
   				<a href = "register.jsp">	
   				   				<button type="button" class="btn btn-success">Register</button>
   				 </a>	
   		</form>

		</div>
		
	</div>
</body>
</html>