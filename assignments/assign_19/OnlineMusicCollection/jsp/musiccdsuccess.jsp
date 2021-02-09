<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Music CD Insert Success</title>
</head>
<body>
<center>
<h2>Welcome to Online Music Collections System</h2>
<hr color="#0000FF">

<br>
<s:url action="backtohome" var="bktohm"></s:url>
<s:a href="%{bktohm}"> Home </s:a>
&emsp;
<s:url action="insertmusic" var="cremcd"></s:url>
<s:a href="%{cremcd}"> Create Music CD Again </s:a>

<h4>New Music CD is successfully created!</h4>
</center>
</body>
</html>