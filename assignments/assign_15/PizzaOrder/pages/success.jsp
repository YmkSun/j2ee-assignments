<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Pizza Order List</title>
</head>
<body>
<h3>Pizza Order List</h3>
<table>
<s:form action="pizzaback" theme="simple">
<tr><td>Name:</td><td><s:property value="name" /></td></tr>
<tr><td>Crust:</td><td><s:property value="orderCrust" /></td></tr>
<tr><td>Toppings:</td><td>
<s:if test="%{peas}">Peas</s:if>
<s:if test="%{paneer}">paneer</s:if>
<s:if test="%{peppers}">peppers</s:if>
<s:if test="%{pineapple}">pineapple</s:if>
<s:if test="%{onion}">onion</s:if>
<s:if test="%{tomato}">tomato</s:if>
</td></tr>
<tr><td>Appetizer:</td><td><s:property value="orderAppetizer" /></td></tr>
<tr><td>Address:</td><td><s:property value="address" /></td></tr>
<tr><td>Credit Card:</td><td><s:property value="orderCard" /></td></tr>
<tr><td>Credit Card Number:</td><td><s:property value="creditNo" /></td></tr>
</s:form>

</table>

</body>
</html>