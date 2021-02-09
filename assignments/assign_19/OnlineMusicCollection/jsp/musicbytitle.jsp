<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<h2>Welcome to Online Music Collections System</h2>
<hr color="#0000FF">

<h4>Choose Studio Name and Music Title</h4>
<s:form action="mviewtitle" method="post" theme="simple">
<table>
<tr><td><s:text name="label.sname"/></td><td><s:select name="stname" list="stlist" /></td></tr>
<tr><td><s:text name="label.mtitle"/></td><td><s:textfield name="mtype" /></td></tr>
<tr><td></td><td align="right"><s:submit key="label.chkmuc" /></td></tr>
</table>
</s:form>
</center>
</body>
</html>