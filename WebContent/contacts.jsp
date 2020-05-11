<!DOCTYPE html>
<%@page import="java.util.ArrayList"%>
<%@page import="dataBase.dao.entity.EmployeeEntity"%>
<%@page import="java.util.List"%>
<%@page import="dataBase.EmployeeDaoImpl"%>
<%@page import="dataBase.EmployeeDao"%>
<html>
<head>
<title>Show All Data</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">


<!-- For DataTables -->
<link rel="stylesheet"
	href="https://cdn.datatables.net/1.10.20/css/dataTables.bootstrap4.min.css">
<script
	src="https://cdn.datatables.net/1.10.20/css/jquery.dataTables.min.css">
	
</script>

<script src="https://kryogenix.org/code/browser/sorttable/sorttable.js">
	
</script>

<script>
	src = "https://cdn.datatables.net/1.10.20/js/dataTables.bootstrap4.min.js" >
</script>
<!-- For DataTables -->

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>

<!-- My Table name included in the <table> in ID section -->
<script>
	$('#myTable').DataTable();
</script>
</head>
<body>

	<header style="height: 30px; background-color: #B70C1B;"></header>
	<br />
	<div class="container mb-3 mt-3">
		<!--  margin bottom and margin top == 3-->
		<a href="showAllData.jsp"> <img src="Images/beatifulScene.jfif"
			style="height: 180px">
		</a>
		<hr />
		
		<!--****Make the connection to the preferred DataBase and Start Xamppp****  -->

	 <table id="myTable"
			class="table table-striped table-bordered sortable" cellspacing="0"
			width="100%">

			<thead>
				<tr>
					<th>Eid</th>
					<th>UserId</th>
					<th>Name</th>
					<th>Email</th>					
					<th>Mobile Number</th>
					
				</tr>
			</thead>
			<%
			EmployeeDao employeeDao = new EmployeeDaoImpl();
			List<EmployeeEntity> employeeList = new ArrayList<EmployeeEntity>();
			employeeList = employeeDao.findAll();

			for (EmployeeEntity employees : employeeList) {
			%>
			<tbody>
				<tr>
					<td><%=employees.geteID()%></td>
					<td><%=employees.getUserId()%></td>
					<td><%=employees.getName()%></td>
					<td><%=employees.getEmail()%></td>
					<td><%=employees.getMobile()%></td>
				</tr>
				<%
					}
				%>
			</tbody>
		</table> 
	
	</div>

	<footer style="position: fixed; left: 0; bottom: 0; width: 100%; background-color: #00fff3;"></footer>


</body>
</html>
