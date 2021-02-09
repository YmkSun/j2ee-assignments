<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Update</title>
</head>
<body>
<center>
<h3><s:text name="label.uptitle" /></h3>

<s:form action="updatestu" mehthod="post" theme="simple">
<table>
<tr><td><s:text name="label.rno" /></td><td><s:textfield name="stad.stupk.rno" readonly="true" /></td><td></td></tr>
<tr><td><s:text name="label.sname" /></td><td><s:textfield name="stad.stupk.name" readonly="true" /></td><td></td></tr>
<tr><td><s:text name="label.age" /></td><td><s:textfield name="stad.age" ></s:textfield></td><td></td></tr>
<tr><td><s:text name="label.email" /></td><td><s:textfield name="stad.email" ></s:textfield></td><td></td></tr>
<tr><td><s:text name="label.uname" /></td><td><s:textfield name="stad.username" ></s:textfield></td><td></td></tr>
<tr><td><s:text name="label.pass" /></td><td><s:textfield name="stad.password" ></s:textfield></td><td></td></tr>
<tr><td><s:text name="label.tc" /></td><td><s:select list="%{#session.tc}" name="stad.training_center" headerKey="0" headerValue="Select Training Center" /></td><td></td></tr>
<tr><td><s:text name="label.bio" /></td><td><s:textfield name="stad.bio_summary" ></s:textfield></td><td></td></tr>
<tr><td></td><td><s:submit key="label.update" /><s:reset key="label.reset" /></td><td></td></tr>
</table>
</s:form>
</center>
</body>
</html>