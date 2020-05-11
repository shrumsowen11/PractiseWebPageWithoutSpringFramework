

<%@page import="dataBase.EmployeeDaoImpl"%>
<%@page import="dataBase.EmployeeDao"%>
<%@page import="dataBase.dao.entity.EmployeeEntity"%>
<%-- <%@page import="java.util.Date"%> --%>
<%@page import="java.util.Date"%>
<%@page import="dataBase.utils.DateUtils"%>


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>


<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Process</title>
</head>
<body>

	<%
		boolean empty = false;

	String userid = request.getParameter("userid");
	if (userid == null) {
		empty = true;
	}

	String password = request.getParameter("password");
	if (password == null) {
		empty = true;
	}

	String name = request.getParameter("name");
	if (name == null) {
		empty = true;
	}

	String email = request.getParameter("email");
	if (email == null) {
		empty = true;
	}

	String dob = request.getParameter("dob");
	Date dateFromStringAgain = DateUtils.dateFromString(dob);
	if (dob == null) {
		empty = true;
	}

	String mobile = request.getParameter("mobile");
	long mob = 0;
	if (mobile == null) {
		empty = true;
	} else {
		mob = Long.parseLong(mobile);
	}

	String salary = request.getParameter("salary");
	double sal = 0;
	if (salary == null) {
		empty = true;
	} else {
		sal = Double.parseDouble(salary);
	}

	String ssn = request.getParameter("ssn");
	long sssn = 0;
	if (ssn == null) {
		empty = true;
	} else {
		sssn = Long.parseLong(ssn);
	}

	//Setting the message inside the request scope
	if (empty == true) { //if "empty equals true"
		request.setAttribute("message", "Field with * cannot be empty.");
	%>
	<jsp:forward page="register.jsp" />
	<%
		} else {
		EmployeeDao employeeDao = new EmployeeDaoImpl();
		EmployeeEntity entity = new EmployeeEntity(0, userid, password, name, email, dateFromStringAgain, mob, sal, sssn,
		null, null);
		employeeDao.save(entity);

		request.setAttribute("message", "You have succcessfully registered..");
	%>
	<jsp:forward page="register.jsp" />
	<%
		}
	%>


</body>
</html>