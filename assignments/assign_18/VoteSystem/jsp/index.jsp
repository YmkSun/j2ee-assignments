<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Vote index</title>
</head>
<body>

<center>
<h3>Voting Index Form</h3>

<s:url action="insertvtr" var="vtrInsert"></s:url>
<s:a href="%{vtrInsert}"> Insert Voter </s:a>
<br>
<s:url action="insertpty" var="ptyInsert"></s:url>
<s:a href="%{ptyInsert}"> Insert Party </s:a>
<br>
<s:url action="checkvtr" var="vtrCheck"></s:url>
<s:a href="%{vtrCheck}"> Check Voter </s:a>
<br>
<s:url action="searchvtr" var="vtrSearch"></s:url>
<s:a href="%{vtrSearch}"> Voter Search </s:a>
</center>

</body>
</html>