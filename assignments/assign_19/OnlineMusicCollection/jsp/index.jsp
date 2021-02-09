<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Music Studio Index</title>
</head>
<body>

<center>
<h2>Welcome to Online Music Collections System</h2>
<hr color="#0000FF">
<table>
<tr><td>
<s:url action="insertstudio" var="studioInsert"></s:url>
<s:a href="%{studioInsert}"> Create Music Studio </s:a>
</td></tr><tr><td>
<s:url action="insertmusic" var="musicInsert"></s:url>
<s:a href="%{musicInsert}"> Insert Music CD </s:a>
</td></tr><tr><td>
<s:url action="viewbyname" var="musicByName"></s:url>
<s:a href="%{musicByName}"> View Music CD by Music Studio name </s:a>
</td></tr><tr><td>
<s:url action="viewbytitle" var="musicByTitle"></s:url>
<s:a href="%{musicByTitle}"> View Music CD by Music Studio name and title </s:a>
</td></tr><tr><td>
<s:url action="viewbytype" var="musicByType"></s:url>
<s:a href="%{musicByType}"> View Music CD by Music Type </s:a>
</td></tr>
</table>
</center>


</body>
</html>