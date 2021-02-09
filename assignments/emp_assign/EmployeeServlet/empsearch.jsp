<%@ page errorPage="error.jsp" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search Employee</title>
</head>
<body>

<center>
<h2>Welcome to Employee Administration System</h2>
<hr color="#0000FF">
<%
String id=request.getParameter("eid");

if(id!=null && !(id.equals(""))){
	int eid=Integer.parseInt(id);
	session.setAttribute("empid", eid);
	response.sendRedirect("./search");
}

%>

<form action="empsearch.jsp" method="get">
<table>
<tr><td>Enter Employee ID here:</td><td><input type="text" name="eid" size="20" /></td></tr>
<tr><td></td><td align="right"><input type="submit" name="submit" value="Search"/></td></tr>
</table>
</form>
</center>

</body>
</html>