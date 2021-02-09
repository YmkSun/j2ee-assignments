<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Select Music Type</title>
</head>
<body>
<center>
<h2>Welcome to Online Music Collections System</h2>
<hr color="#0000FF">

<h4>Choose Music Type</h4>
<s:form action="mviewtype" method="post" theme="simple">
<table>
<tr><td align="right"><s:text name="label.mtype" /></td>
<td><s:radio name="mtype" list="{'Classical','Rock','Pop','Hiphop'}" value="%{'Classical'}" /></td></tr>
<tr><td></td><td align="right"><s:submit key="label.chkmuc"/></td></tr>
</table>
</s:form>
</center>
</body>
</html>