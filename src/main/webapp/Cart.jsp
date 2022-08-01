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
<a href="products">Home</a>

	<br />
	<br />

	<table width="800px" border=2px>
		<tr>
			<th>prodid</th>
			<th>productname</th>
			<th>prodimage</th>
			<th>procolor</th>
			<th>price</th>
			<th>mrpprice</th>
			<th>avgrating</th>
			<th>quantity</th>
			<th>discount</th>
		</tr>

		<s:iterator value="pp" var="p">
			<tr>
				<td><s:property value="#p.prodid" /></td>
				<td><s:property value="#p.productname" /></td>
				<td><img src="<s:property value="#p.prodimage" />"
					style="width: 200px;" /></td>
				<td><s:property value="#p.procolor" /></td>
				<td><s:property value="#p.price" /></td>
				<td><s:property value="#p.mrpprice" /></td>
				<td><s:property value="#p.avgrating" /></td>
				<td><s:property value="#p.quantity" /></td>
				<td><s:property value="#p.discount" /></td>
				<td>
				<s:url action="deletecart" var="urlTag" >
						<s:param name="prodid" value="#p.prodid"></s:param>
					</s:url>
					
					<a href="<s:property value="#urlTag" />" >Delete from Cart</a>
				
				</td>
			</tr>
		</s:iterator>

	</table>

</body>
</html>