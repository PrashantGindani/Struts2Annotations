<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>

<h1>LOGIN</h1>

<br/>
<s:form action="testAction">
<s:textfield name="email" label="user"></s:textfield>
<s:password name="pass" label="pass"></s:password>
<s:submit value="Submit"></s:submit>
</s:form>



</body>
</html>