<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Accept Student Form</title>
</head>
<body>
<center>
<h3><s:text name="label.acceptTitle" /></h3>
<font color="red"><s:actionerror/></font>
<table>
<s:form action="accept" theme="simple">
<tr>
<td><s:text name="label.rollno" /></td>
<td><s:textfield name="student.rollNo"></s:textfield></td>
<td><font color="red"><s:fielderror fieldName="student.rollNo" /></font></td>
</tr>
<tr>
<td><s:text name="label.fname" /></td>
<td><s:textfield name="student.fullName"></s:textfield></td>
<td><font color="red"><s:fielderror fieldName="student.fullName" /></font></td>
</tr>
<tr>
<td><s:text name="label.email" /></td>
<td><s:textfield name="student.emailID"></s:textfield></td>
<td><font color="red"><s:fielderror fieldName="student.emailID" /></font></td>
</tr>
<tr>
<td><s:text name="label.contac" /></td>
<td><s:textfield name="student.contactNo"></s:textfield></td>
<td><font color="red"><s:fielderror fieldName="student.contactNo" /></font></td>
</tr>
<tr>
<td></td>
<td><s:submit key="label.accept" /><s:reset key="label.reset" /></td>
<td></td>
</tr>
</s:form>
</table>
</center>
</body>
</html>