<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page import="student.Student" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Search Result</title>
</head>
<body>
<center>
<h3>Student Information</h3>

<table>
<tr><td><s:text name="label.rollno" /></td><td><s:property value="student.rollNo" /></td></tr>
<tr><td><s:text name="label.fname" /></td><td><s:property value="student.fullName" /></td></tr>
<tr><td><s:text name="label.email" /></td><td><s:property value="student.emailID" /></td></tr>
<tr><td><s:text name="label.contac" /></td><td><s:property value="student.contactNo" /></td></tr>
</table>

<s:form action="nback"><s:submit key="label.back"/></s:form>
</center>
</body>
</html>
