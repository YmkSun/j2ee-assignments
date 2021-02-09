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
<table>
<tr><td align="right"><b><s:text name="label.sname"/>:</b>&nbsp;</td><td><s:property value="musto.name"/></td></tr>
<tr><td align="right"><b><s:text name="label.mtitle"/>:</b>&nbsp;</td><td><s:property value="mucd.title"/></td></tr>
</table>

<table border="1">
<tr bgcolor="red">
	<td align="center"><b><s:text name="label.mtitle" /></b></td>
	<td align="center"><b><s:text name="label.mtype" /></b></td>
	<td align="center"><b><s:text name="label.trno" /></b></td>
	<td align="center"><b><s:text name="label.price" /></b></td>
	<td align="center"><b><s:text name="label.email" /></b></td>
	<td align="center"><b><s:text name="label.msname" /></b></td>
</tr>
<tr>
	<td><s:property value="mucd.title" /></td>
	<td><s:property value="mucd.mdetail.musictype" /></td>
	<td><s:property value="mucd.mdetail.no_tracks" /></td>
	<td><s:property value="mucd.mdetail.price" /></td>
	<td><s:property value="mucd.mdetail.email" /></td>
	<td><s:property value="mucd.mdetail.musicianName" /></td>
</tr>
</table>
</center>
<br><br>
<s:url action="backtohome" var="bktohm"></s:url>
<s:a href="%{bktohm}"> Back to Home </s:a>
</body>
</html>