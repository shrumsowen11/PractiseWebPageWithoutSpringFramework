<!DOCTYPE html>
<html>
<head>
<title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
</head>
<body>

	<header style ="height: 30px; background-color: #B70C1B;"></header>
	 	
	<div class="container mb-3 mt-3">
	<a href = "showAllData.jsp">
		<img src = "Images/beatifulScene.jfif" style = "height: 180px">
		</a>
			<!-- Simple Button -->
			<!-- <button>Show Employees</button> -->
		
		
		<hr/>
		
		<h3>Person Registration Page</h3>
		
		<span style ="font-size: 18px; color: red;">${message}</span>
		<hr/>
		
		<div class ="form-group" style = "width: 50%">
		
		<form action = "process.jsp">   <!-- whenever the submit button is clicked, then this page is called -->
			
 			<label for = "userid"> UserId*: </label>
			<input type = "text" class = "form-control" name = "userid" placeholder = "Enter your UserID">
			<br/>
			<label for = "password"> Password*: </label>
			<input type = "password" class = "form-control" name = "password" placeholder = "Enter strong password">
			<br/>
			
			<label for = "name"> Name*: </label>
			<input type = "text" class = "form-control" name = "name" placeholder = "Enter your name">
			<br/>
			
			<label for = "email"> Email*: </label>
			<input type = "email" class = "form-control" name = "email" placeholder = "Enter your email">
			<br/>
			
			<label for = "dob"> Date of Birth*: </label>
			<input type = "date" class = "form-control" name = "dob" placeholder = "Enter your date of birth">
			<br/>
			
			<label for = "mobile"> Mobile: </label>
			<input type = "tel" class = "form-control" name = "mobile" placeholder = "Enter your mobile number">
			<br/>
			
			<label for = "salary"> Salary Range: </label>
			<select class = "form-control" name = "salary" >
						<option>0</option>
						<option>500</option>
						<option>1500</option>
						<option>2000</option>
						<option>2500</option>
						<option>3000</option>
						<option>3500</option> <!-- for less than -> &lt; and greater than -> &gt;  -->
						
						<!-- In order to make the form "Require" this value follow this link, the third implementation
						https://www.w3docs.com/snippets/css/how-to-create-a-placeholder-for-an-html5-select-box-by-using-only-html-and-css.html
						-->
			</select>
			<br/>
			
			<label for = "ssn"> SSN*: </label>
			<input type = "number" class = "form-control" name = "ssn" placeholder = "Enter your ssn">
			<br/>
			
			<a href = "index.jsp">	
				<button type="button" class="btn btn-primary">Log In</button>
				 </a>
				<button type="submit" class="btn btn-success">Register/Sign Up</button>
				 <!-- We want to put all these inputed data into the DataBase when you press Register/Sign Up -> "process.jsp" -->
   				<button type="reset" class="btn btn-danger">Clear</button>
   					
   				
   		</form>

		</div>
		
	</div>
</body>
</html>