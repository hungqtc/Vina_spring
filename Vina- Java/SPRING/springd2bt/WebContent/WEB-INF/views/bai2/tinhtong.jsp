<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Bài tập 2</title>
		<link href="${pageContext.request.contextPath }/bai1/style.css" type="text/css" rel="stylesheet">
	</head>
	<body>
		<div class="wrapper">
			<h2>Tính tổng</h2>
			<form action="" method="post">	
				
			<label>Dãy số</label>
			<input type="text" value="" name="name" /> <br/>
			<label>Tổng</label><br>
			<input type="text" value="${tong }" name="tong" /> <br/>
			<input type="submit" value="Tổng"  /> 
		</form>
		</div>
		
	</body>
</html>