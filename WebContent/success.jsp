<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib uri="http://java.sun.com/jstl/core" prefix ="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>上传文件跳转页面</title>
</head>
<body>
	<%@page isELIgnored="false"%>
	uploaded success
	${doc}
	<br/>
	${docFileName}
	<br/>
	${docContentType}
	<br/>
</body>
</html>