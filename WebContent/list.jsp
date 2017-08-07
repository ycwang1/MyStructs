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
	<%-- <s:checkboxlist value="selectedProducts" name="product.id"
    list="products" listValue="name" listKey="id" />
    <br>
    <s:radio list="products" listValue="name" listKey="id"
    name="product.id" value="2"></s:radio>
    <br>
    <s:select list="products" listValue="name" listKey="id" name="product.id"
    multiple="true" size="1" value="selectedProducts" theme="simple"></s:select> --%>
    ${date}
    <table border="1" cellspacing="0">
    	<tr>
    		<td>id</td>
    		<td>name</td>
    		<td>products</td>
    	</tr>
    	<s:iterator value="categories" var="c">
    		<tr>
    			<td>${c.id}</td>
    			<td>${c.name}</td>
    			<td>
    				<s:iterator value="#c.products" var="p">
    					${p.name}<br>
    				</s:iterator>
    			</td>
    		</tr>
    	</s:iterator>
    </table>
    <s:debug/>
</body>
</html>