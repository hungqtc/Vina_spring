<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Tách giao diện</title>
</head>
<body>
	<tiles:insertAttribute name="header" />
	
	<div id="content" style="background:#57a706; color:#FFF; height:200px; margin:20px 0px">
		<tiles:insertAttribute name="content" />
	</div>
	
	<tiles:insertAttribute name="footer" />
</body>
</html>