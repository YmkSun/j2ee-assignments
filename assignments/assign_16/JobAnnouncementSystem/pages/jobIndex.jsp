<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Job Index</title>
</head>
<body>
<center>
<h3>Job Announcement System Index</h3>

<s:url action="jobInsert" var="JobInsert"></s:url>
<s:a href="%{JobInsert}"> Job Insert </s:a>
<br>
<s:url action="jobSearch" var="JobSearch"></s:url>
<s:a href="%{JobSearch}"> Job Search </s:a>

</center>
</body>
</html>