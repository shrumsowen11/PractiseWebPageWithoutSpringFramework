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

<!-- For Awesome Fonts Library -->
<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.12.1/css/all.css"
	crossorigin="anonymous">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">


<!-- For DataTables Library -->
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


<!-- My Table name("myTable" for this case) included inside the <table> in ID section -->
<script>
	$('#myTable').DataTable();
</script>

<!-- Styling the buttons -->
<style>
.btn {
  background-color: Red;
  border: none;
  color: white;
  padding: 12px 16px;
  font-size: 16px;
  cursor: pointer; /* Mouse pointer on hover */
}

/* the in-built class "btn" has the in-built functionality of being darker when the mouse pointer is hovered */

/* Darker background on mouse-over */
/*  .btn:hover {
  background-color: Blue;
}  */

</style>
</head>
<body>

	<header style="height: 30px; background-color: #B70C1B;"></header>
	<br />
	<div class="container mb-3 mt-3">
		<!--  margin bottom and margin top == 3-->
		<a href="showAllData.jsp"> <img src="Images/beatifulScene.jfif"
			style="height: 180px">
		</a>
		<a href="dashboard.jsp">
			<button type="button" class="btn btn-success">Go Back</button>
		</a>
		<a href="logout.jsp"> <!-- Simple Button --> <!-- <button>Show Employees</button> -->
			<button type="button" class="btn btn-warning">LogOut</button>
		</a>
		<hr />
		<!-- **************************************************************** -->
		<!-- **************************************************************** -->
		<!-- **************************************************************** -->
		<!-- **************************************************************** -->
		<!-- **************************************************************** -->

		<!-- Read This first -->

		<!--****Make the connection to the preferred DataBase and Start Xamppp****  -->

		<!-- **************************************************************** -->
		<!-- **************************************************************** -->
		<!-- **************************************************************** -->
		<!-- **************************************************************** -->
		<!-- **************************************************************** -->
<!-- <th class="draggable right column_heading pointer marker" data-column="EID" style="cursor: move;"><span><a href="sql.php?db=keubiko_db&amp;table=employee_tbl&amp;sql_query=SELECT+%2A+FROM+%60employee_tbl%60++%0AORDER+BY+%60employee_tbl%60.%60EID%60++DESC&amp;sql_signature=8a6007a1a6227a12ef258f673e77a14d5859a7c1572eae5e676cb5d0d3f64184&amp;session_max_rows=25&amp;is_browse_distinct=0" class="sortlink">EID <img src="themes/dot.gif" title="" alt="Ascending" class="icon ic_s_asc soimg" style=""> <img src="themes/dot.gif" title="" alt="Descending" class="icon ic_s_desc soimg hide" style="display: none;"> <small>1</small><input type="hidden" value="sql.php?db=keubiko_db&amp;table=employee_tbl&amp;sql_query=SELECT+%2A+FROM+%60employee_tbl%60++%0AORDER+BY+%60employee_tbl%60.%60EID%60++DESC&amp;sql_signature=8a6007a1a6227a12ef258f673e77a14d5859a7c1572eae5e676cb5d0d3f64184&amp;session_max_rows=25&amp;is_browse_distinct=0"></a></span></th>
 --><!-- For movable Tables  -->
 
		<table id="myTable"
			class="table table-striped table-bordered sortable" cellspacing="0"
			width="100%">

			<thead>
				<tr>
				
				<!-- <th class="draggable right column_heading pointer marker" data-column="EID" style="cursor: move;">
				EID</th> -->
				
					<th >Eid</th>
					<th>UserId</th>
					<th>Name</th>
					<th>Email</th>
					<th>DOB</th>
					<th>Mobile Number</th>
					<th>Delete/Edit</th>
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
					<td><%=employees.getDate()%></td>
					<td><%=employees.getMobile()%></td>
					<td>
					<a href="deletePersonServlet?email=<%=employees.getEmail()%>	">
							<!-- We are making a Servlet class named "deletePerson" and "?" -> What you want to send as 
						to that Servlet Class "email=" and value of the email, which is being sent -->

							<!--  Whenever you send hyperlink, the method doGet() is called. -->
							<button class = "btn btn-danger">
							<!--  FA icons -->
							<i class="fa fa-trash-alt fa-sm"></i>
						
						</button>
					</a>
					
					
					
					
					
					
					
					
					
						
						
					</td>

				</tr>
				<%
					}
				%>
			</tbody>
		</table>

	</div>

	<footer
		style="position: fixed; left: 0; bottom: 0; width: 100%; background-color: #00fff3;"></footer>


</body>
</html>
