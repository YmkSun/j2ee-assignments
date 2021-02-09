<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Error Index</title>
</head>
<body>
<center>
<h2>Welcome to Online Music Collections System</h2>
<hr color="#0000FF">

<br>
<s:url action="backtohome" var="bktohm"></s:url>
<s:a href="%{bktohm}"> Back to Home </s:a>

<h1>No Music and Studio Data Found!</h1>
</center>

</body>
</html>