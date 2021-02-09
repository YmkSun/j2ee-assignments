<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Index</title>
</head>
<body>

<center>
<h3>Student Index Form</h3>

<s:url action="create" var="stuInsert"></s:url>
<s:a href="%{stuInsert}"> Insert Student </s:a>
<br>
<s:url action="search" var="stuSearch"></s:url>
<s:a href="%{stuSearch}"> Search Student </s:a>
<br>
<s:url action="edit" var="stuEdit"></s:url>
<s:a href="%{stuEdit}"> Edit Student </s:a>
<br>
<s:url action="delete" var="stuDelete"></s:url>
<s:a href="%{stuDelete}"> Delete Student </s:a>
</center>

</body>
</html>