<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Products</title>
</head>
<body>

	<h1>
		<s:property value="pagetitle" />
	</h1>
<a href="userCart">Your Cart</a>

	<br />
	<br />

	<s:form action="/searchproducts">
		<s:textfield name="search" label="Search any Product"></s:textfield>
		<s:submit value="Search" name="submit"></s:submit>
	</s:form>
	<br />
	<br />

	<table width="1000px" border=1px>
		<tr>
			<th>prodid</th>
			<th>productname</th>
			<th>prodimage</th>
			<th>procolor</th>
			<th>price</th>
			<th>mrpprice</th>
			<th>avgrating</th>
			<th>noofratings</th>
			<th>noofreviews</th>
			<th>warrantyperiod</th>
			<th>returnperiod</th>
			<th>codpolicy</th>
			<th>quantity</th>
			<th>discount</th>
		</tr>

		<s:iterator value="pp" var="p">
			<tr>
				<td><s:property value="#p.prodid" /></td>
				<td><s:property value="#p.productname" /></td>
				<td><img src="<s:property value="#p.prodimage" />"
					style="width: 100px;" /></td>
				<td><s:property value="#p.procolor" /></td>
				<td><s:property value="#p.price" /></td>
				<td><s:property value="#p.mrpprice" /></td>
				<td><s:property value="#p.avgrating" /></td>
				<td><s:property value="#p.noofratings" /></td>
				<td><s:property value="#p.noofreviews" /></td>
				<td><s:property value="#p.warrantyperiod" /></td>
				<td><s:property value="#p.returnperiod" /></td>
				<td><s:property value="#p.codpolicy" /></td>
				<td><s:property value="#p.quantity" /></td>
				<td><s:property value="#p.discount" /></td>
				<td>
				<s:url action="addcart" var="urlTag" >
						<s:param name="prodid" value="#p.prodid"></s:param>
					</s:url>
					
					<a href="<s:property value="#urlTag" />" >Add Cart</a>
			</tr>
		</s:iterator>

	</table>

</body>
</html>