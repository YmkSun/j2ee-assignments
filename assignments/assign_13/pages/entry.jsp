<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Profile Entry</title>
</head>
<body>
<center>
<h3><s:text name="label.etitle" /></h3>
<s:head/>
<table>

<s:form action="entry" method="post" theme="simple">

<tr>
<td align="right"><s:text name="label.fname" /><font color="red">*</font>:</td>
<td><s:textfield name="profile.firstname" ></s:textfield></td>
<td><s:fielderror fieldName="profile.firstname" /></td>
</tr>

<tr>
<td align="right"><s:text name="label.sname" /><font color="red">*</font>:</td>
<td><s:textfield name="profile.surname" ></s:textfield></td>
<td><s:fielderror fieldName="profile.surname" /></td>
</tr>
<tr>
<td align="right"><s:text name="label.age" /><font color="red">*</font>:</td>
<td><s:textfield name="profile.age" ></s:textfield></td>
<td><s:fielderror fieldName="profile.age" /></td>
</tr>
<tr>
<td align="right"><s:text name="label.mail" /><font color="red">*</font>:</td>
<td><s:textfield name="profile.email" ></s:textfield></td>
<td><s:fielderror fieldName="profile.email" /></td>
</tr>
<tr>
<td align="right"><s:text name="label.mobile" /><font color="red">*</font>:</td>
<td><s:textfield name="profile.mobile" ></s:textfield></td>
<td><s:fielderror fieldName="profile.mobile" /></td>
</tr>
<tr>
<td align="right"><s:text name="label.dob" /><font color="red">*</font>:</td>
<td><s:textfield name="profile.dateOfBirth" ></s:textfield></td>
<td><s:fielderror fieldName="profile.dateOfBirth" /></td>
</tr>
<tr>
<td align="right"><s:text name="label.pass" /><font color="red">*</font>:</td>
<td><s:password name="profile.password" ></s:password></td>
<td><s:fielderror fieldName="profile.password" /></td>
</tr>
<tr>
<td align="right"><s:text name="label.cpass" /><font color="red">*</font>:</td>
<td><s:password name="profile.confirmPassword" ></s:password></td>
<td><s:fielderror fieldName="profile.confirmPassword" /></td>
</tr>

<tr>
<td align="right"><s:text name="label.country" /><font color="red">*</font>:</td>
<td><s:textfield name="profile.country" ></s:textfield></td>
<td><s:fielderror fieldName="profile.country" /></td>
</tr>

<tr>
<td></td>
<td><s:actionerror /></td>
<td></td>
</tr>

<tr>
<td></td>
<td><s:submit key="label.save" /><s:reset key="label.reset" /></td>
<td></td>
</tr>

</s:form>

</table>
</center>
</body>
</html>