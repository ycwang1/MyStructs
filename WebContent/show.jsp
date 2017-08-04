<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib uri= "http://java.sun.com/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>struts测试</title>
</head>
<body>
	<%@page isELIgnored="false"%>
	<p>姓名是${product.name}</p>
	<p>年龄是${product.age}</p>
	<p>session中name是${name}</p>
	
</body>
</html>