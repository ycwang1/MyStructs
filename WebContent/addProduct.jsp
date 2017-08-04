<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>增加产品</title>
</head>
<body>
	<!-- <form action="addProduct" method="post">
		姓名<input type="text" name="product.name">
		</br>
		年龄<input type="text" name="product.age">
		</br>
		<input type="submit" value="submit">
	</form> -->
	
	<s:form action="listProduct">
		<s:textfield name="product.name" label="姓名"></s:textfield>
		<s:submit value="Submit"></s:submit>
	</s:form>
</body>
</html>