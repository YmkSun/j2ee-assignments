<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Insert</title>
</head>
<body>
<center>
<h3><s:text name="label.intitle" /></h3>

<s:form action="insertstu" mehthod="post" theme="simple">
<table>
<tr><td><s:text name="label.rno" /></td><td><s:textfield name="sad.stupk.rno" ></s:textfield></td><td></td></tr>
<tr><td><s:text name="label.sname" /></td><td><s:textfield name="sad.stupk.name" ></s:textfield></td><td></td></tr>
<tr><td><s:text name="label.age" /></td><td><s:textfield name="sad.age" ></s:textfield></td><td></td></tr>
<tr><td><s:text name="label.email" /></td><td><s:textfield name="sad.email" ></s:textfield></td><td></td></tr>
<tr><td><s:text name="label.uname" /></td><td><s:textfield name="sad.username" ></s:textfield></td><td></td></tr>
<tr><td><s:text name="label.pass" /></td><td><s:password name="sad.password" ></s:password></td><td></td></tr>
<tr><td><s:text name="label.tc" /></td><td><s:select list="%{#session.tc}" name="traincenter" headerKey="0" headerValue="Select Training Center" /></td><td></td></tr>
<tr><td><s:text name="label.bio" /></td><td><s:textfield name="sad.bio_summary" ></s:textfield></td><td></td></tr>
<tr><td></td><td><s:submit key="label.create" /><s:reset key="label.reset" /></td><td></td></tr>
</table>
</s:form>
</center>
</body>
</html>