<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Voter Insert</title>
</head>
<body>
<s:head/>
<center>
<h3><s:text name="label.votertitle" /></h3>

<s:form action="vtrinsert" method="post" theme="simple">
<table>
<tr>
<td align="right"><s:text name="label.vname" /></td>
<td><s:textfield name="votr.name" /></td>
<td><s:fielderror fieldName="votr.name" /></td>
</tr>
<tr>
<td align="right"><s:text name="label.age" /></td>
<td><s:textfield name="votr.age" /></td>
<td><s:fielderror fieldName="votr.age" /></td>
</tr>
<tr>
<td align="right"><s:text name="label.gender" /></td>
<td><s:radio name="gen" list="{'Male','Female'}" value="%{'Male'}" /></td>
<td></td>
</tr>
<tr>
<td align="right"><s:text name="label.religion" /></td>
<td><s:textfield name="votr.religion" /></td>
<td><s:fielderror fieldName="votr.religion" /></td>
</tr>
<tr>
<td align="right"><s:text name="label.nrc" /></td>
<td><s:textfield name="votr.vdetail.nrc" /></td>
<td><s:fielderror fieldName="votr.vdetail.nrc" /></td>
</tr>
<tr>
<td align="right"><s:text name="label.tsh" /></td>
<td><s:textfield name="votr.vdetail.township" /></td>
<td><s:fielderror fieldName="votr.vdetail.township" /></td></tr>
<tr>
<td align="right"><s:text name="label.city" /></td>
<td><s:textfield name="votr.vdetail.city" /></td>
<td><s:fielderror fieldName="votr.vdetail.city" /></td></tr>
<tr>
<td align="right"><s:text name="label.phone" /></td>
<td><s:textfield name="votr.vdetail.phoneno" /></td>
<td><s:fielderror fieldName="votr.vdetail.phoneno" /></td></tr>
<tr>
<td align="right"><s:text name="label.pid" /></td>
<td><s:select list="%{#session.party}" name="ptyname" headerKey="0" headerValue="Select Party" /></td><td></td></tr>
<tr><td></td><td><s:submit key="label.insert" /><s:reset key="label.reset" /></td><td></td></tr>
</table>
</s:form>

</center>

</body>
</html>