<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
<s:head/>
</head>
<body>

<h1>Sign up</h1>

<br/>
<s:form action="registerAction">
<s:textfield name="name" label="name"></s:textfield>
<s:textfield name="age" label="Age"></s:textfield>
<s:radio name="gender" list="{'Male','Female'}" label="Gender"></s:radio>
<s:textfield name="email" label="email"></s:textfield>
<s:password name ="pass" label="pass"></s:password>
<s:textarea name="address" rows="7" cols="20" label="Address"></s:textarea>
<s:select list="colours" name="color" label="Fav Color" headerKey="None" headerValue="Select a color"></s:select>

<s:reset value="Clean"></s:reset>
<s:submit value="Submit"></s:submit>
</s:form>


</body>
</html>