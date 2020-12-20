<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title> <tiles:insertAttribute name="title" /></title>
	<meta name="description" content="VinaENTER EDU đào tạo lập trình viên chuyên nghiệp - Đã học là làm được">
	<meta name="keywords" content="dao tao chuyên sâu lap trinh php, java">
	<link href="${pageContext.request.contextPath }/resources/css/style.css" rel="stylesheet" type="text/css">
</head>
<body>
	<div class="wrapper">
		<!-- begin header -->
		<tiles:insertAttribute name="header"/>
		<!-- end header -->
		
		<!-- begin menu -->
		<tiles:insertAttribute name="menu"/>
		<!-- end menu -->
		
		<!-- end content -->
		<div id="content">
			<div class="content-left fl">
				<tiles:insertAttribute name="leftbar" />
			</div>
			<div class="content-right fr">
				<tiles:insertAttribute name="content"/>
			</div>
			<div class="clr"></div>
		</div>
		<!-- end content -->
		
		<tiles:insertAttribute name="footer"/>
	</div>
</body>
</html>