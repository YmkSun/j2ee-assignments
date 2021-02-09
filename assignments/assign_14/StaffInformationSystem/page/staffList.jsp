<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Staff List</title>
</head>
<body>

<center>
<h3><s:text name="label.listTitle" /></h3>

<table border="1">
<tr bgcolor="grey"><td align="center"><b><s:text name="label.stid" /></b></td><td align="center"><b><s:text name="label.name" /></b></td><td align="center"><b><s:text name="label.rank" /></b></td><td align="center"><b><s:text name="label.dept" /></b></td></tr>
<s:iterator value="#session.staffList">
	<s:if test="%{department=='CICTT'}">
	<tr bgcolor="#FFFFCC"><td><s:property value="staffID" /></td><td><s:property value="staffName" /></td><td><s:property value="rank" /></td><td><s:property value="department" /></td></tr>
	</s:if>
</s:iterator>

<s:iterator value="#session.staffList">
	<s:if test="%{department=='IMCEITS'}">
	<tr bgcolor="#CCFFFF" ><td><s:property value="staffID" /></td><td><s:property value="staffName" /></td><td><s:property value="rank" /></td><td><s:property value="department" /></td></tr>
	</s:if>
</s:iterator>

<s:iterator value="#session.staffList">
	<s:if test="%{department=='ICTTI'}">
	<tr bgcolor="#FFCCFF"><td><s:property value="staffID" /></td><td><s:property value="staffName" /></td><td><s:property value="rank" /></td><td><s:property value="department" /></td></tr>
	</s:if>
</s:iterator>
</table>
<br>
<s:url action="staffBack" var="StaffBackLink"></s:url>
<s:a href="%{StaffBackLink}"> Back to Staff Entry </s:a>

</center>

</body>
</html>