<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib uri="/struts-tags" prefix ="s"%>
    <%@page isELIgnored="false" %>
 <style>
	table {
	border-collapse:collapse;
}
td {
	border:1px solid gray
}
</style>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>iteror 标签使用</title>
</head>
<body>
	<%-- <table align="center">
		<tr>
			<td>id</td>
			<td>name</td>
			<td>st.index</td>
			<td>st.count</td>
			<td>st.first</td>
			<td>st.last</td>
			<td>st.odd</td>
			<td>st.even</td>
		</tr>
		<s:iterator value="products" var="p" status="st">
			<tr>
				<td>${p.id}</td>
				<td>${p.name}</td>
				<td>${st.index}</td>
				<td>${st.count}</td>
				<td>${st.first}</td>
				<td>${st.last}</td>
				<td>${st.odd}</td>
				<td>${st.even}</td>
			</tr>
		</s:iterator>
	</table> --%>
	<s:checkboxlist value="selectedProducts" name="product.id"
    list="products" listValue="name" listKey="id" />
</body>
</html>