<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Bài tập 1</title>
		<link href="${pageContext.request.contextPath }/bai1/style.css" type="text/css" rel="stylesheet">
	</head>
	<body>
		<div class="wrapper">
			<h2>In câu chào</h2>
			<form action="" method="post">	
				
			<label>Nhập tên</label>
			<input type="text" value="${name }" name="name" /> <br/>
			<label>Câu chào: <c:if test="${not empty name}">Chào bạn ${name }</c:if></label><br>
			<input type="submit" value="In câu chào"  /> 
		</form>
		</div>
		
	</body>
</html>