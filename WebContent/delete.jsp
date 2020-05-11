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

	<%
    EmployeeDao employeeDao = new EmployeeDaoImpl();
    rowCountMain = employeeDao.deleteById(eid);

	
	
	
	
	%>
		
		
			</div>
			</body>
			</html>
			