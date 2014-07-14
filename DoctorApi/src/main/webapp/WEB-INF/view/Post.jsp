<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<body>
	<form:form method="post" action="post/add" enctype="multipart/form-data">
	
	username<input type="text" name="username">
	
	post<input type="text" name="post">
	
	post_type<input type="text" name="post_type">
	
	
	image<input type="file" name="image">
	whom<input type="text" name="whom">
	<input type="submit" value="submit" />
			</form:form>
</body>
</body>
</html>