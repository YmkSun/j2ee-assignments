<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert Music CD</title>
</head>
<body>

<center>
<h2>Welcome to Online Music Collections System</h2>
<hr color="#0000FF">

<h4>New Music CD Creation</h4>
<s:form action="mscinsert" method="post" theme="simple">
<table>
<tr><td align="right"><s:text name="label.mtitle" /></td><td><s:textfield name="mucd.title" /></td><td></td></tr>
<tr><td align="right"><s:text name="label.mtype" /></td><td><s:radio name="mtype" list="{'Classical','Rock','Pop','Hiphop'}" value="%{'Classical'}" /></td><td></td></tr>
<tr><td align="right"><s:text name="label.trno" /></td><td><s:textfield name="mucd.mdetail.no_tracks" /></td><td></td></tr>
<tr><td align="right"><s:text name="label.price" /></td><td><s:textfield name="mucd.mdetail.price" /></td><td></td></tr>
<tr><td align="right"><s:text name="label.msname" /></td><td><s:textfield name="mucd.mdetail.musicianName" /></td><td></td></tr>
<tr><td align="right"><s:text name="label.email" /></td><td><s:textfield name="mucd.mdetail.email" /></td><td></td></tr>
<tr><td align="right"><s:text name="Label.sname" /></td><td><s:select name="stname" list="stlist" /></td><td></td></tr>
<tr><td></td><td align="right"><s:submit key="label.cremuc"/></td><td></td></tr>
</table>
</s:form>
</center>

</body>
</html>