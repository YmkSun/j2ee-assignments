<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update Success</title>
</head>
<body>

<center>
<h3><s:text name="label.uptitle" /></h3>
<br>
<s:label label="Student Insert Successful as" />
<s:property value="stad.stupk.name"/>
<br>
<s:form action="updateToIndex" mehthod="post" theme="simple">
<table>
<tr><td><s:text name="label.rno" /></td><td><s:property value="stad.stupk.rno" /></td><td></td></tr>
<tr><td><s:text name="label.sname" /></td><td><s:property value="stad.stupk.name" /></td><td></td></tr>
<tr><td><s:text name="label.age" /></td><td><s:property value="stad.age" /></td><td></td></tr>
<tr><td><s:text name="label.email" /></td><td><s:property value="stad.email" /></td><td></td></tr>
<tr><td><s:text name="label.uname" /></td><td><s:property value="stad.username" /></td><td></td></tr>
<tr><td><s:text name="label.pass" /></td><td><s:property value="stad.password" /></td><td></td></tr>
<tr><td><s:text name="label.train" /></td><td><s:property value="stad.training_center" /></td><td></td></tr>
<tr><td><s:text name="label.bio" /></td><td><s:property value="stad.bio_summary" /></td><td></td></tr>
<tr><td></td><td><s:submit key="label.back" /></td><td></td></tr>
</table>
</s:form>
</center>
</body>
</html>