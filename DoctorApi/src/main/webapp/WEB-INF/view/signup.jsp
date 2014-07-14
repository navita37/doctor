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
<form:form method="post" action="doctorSignup" enctype="multipart/form-data">
	
	email<input type="text" name="email">
	username<input type="text" name="username">
	name<input type="text" name="name">
	password<input type="text" name="password">
	phnno<input type="text" name="phnno">
	location<input type="text" name="location">
	city<input type="text" name="city">
	qualification<input type="text" name="qualification">
	experience<input type="text" name="experience">
	image<input type="file" name="image">
	speciality<input type="text" name="speciality">
	user_type<input type="text" name="user_type">
			 <input type="submit" value="View" />
			</form:form>
</body>
</html>