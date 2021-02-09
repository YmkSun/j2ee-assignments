<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Pizza Order System</title>
</head>
<body>

<h3>Order your Pizza Here</h3>

<s:form action="pizzaorder" method="post" theme="simple">

<s:text name="label.name" /><s:textfield name="name"></s:textfield><br>

<s:text name="label.crust" /><s:select list="crust" headerKey="1" name="orderCrust" /><br>
<s:text name="label.topping" /><br>
<s:text name="Toppings"/><br>
<s:checkbox name="peas"/>Peas <br>
<s:checkbox name="paneer"/>Paneer<br> 
<s:checkbox name="peppers"/>Peppers<br> 
<s:checkbox name="pineapple"/>Pineapple<br> 
<s:checkbox name="onion"/>Onion<br> 
<s:checkbox name="tomato"/>Tomato<br>


<b><s:text name="label.appetizer" /></b><s:radio name="orderAppetizer" list="appetizer" /><br>
<s:text name="label.address" /><br>
<s:textarea name="address"></s:textarea><br>
<s:text name="label.card" /><br>
<s:radio name="orderCard" list="creditCard" /><br>
<s:text name="label.cnum" /><s:textfield name="creditNo" /><s:text name="label.repeat" /><s:textfield name="confirmNo" />
<br><s:submit key="label.submit"/>
</s:form>

</body>
</html>