<%@ page import="entity.Employee" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>EmpInsert</title>
</head>
<body>
<center>
<h2>Welcome to Employee Administration System</h2>
<hr color="#0000FF">

<%
String name=request.getParameter("ename");
String dept=request.getParameter("edept");
String addr=request.getParameter("eaddr");
String rank=request.getParameter("erank");

if(name!=null && !(name.equals("")) && dept!=null && !(dept.equals("")) && addr!=null && !(addr.equals("")) && rank!=null && !(rank.equals(""))){
	Employee e=new Employee();
	e.setEmpname(name);
	e.setDepartment(dept);
	e.setAddress(addr);
	e.setRank(rank);
	session.setAttribute("emp", e);
	response.sendRedirect("./create");
}

%>
<form action="empinsert.jsp" method="get">
<table>
<tr><td align="right"><b>Employee Name:</b></td><td><input type="text" name="ename" size="20"></td></tr>
<tr><td align="right"><b>Employee Department:</b></td><td><input type="text" name="edept" size="20"></td></tr>
<tr><td align="right"><b>Employee Address:</b></td><td><input type="text" name="eaddr" size="20"></td></tr>
<tr><td align="right"><b>Employee Rank:</b></td><td><input type="text" name="erank" size="20"></td></tr>
<tr><td></td><td><input type="submit" name="submit" value="Save">&emsp;<input type="reset" name="reset" value="Reset"></td></tr>
</table>
</form>
</center>
</body>
</html>