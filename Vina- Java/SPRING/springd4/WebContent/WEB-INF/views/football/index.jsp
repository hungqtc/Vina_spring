<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Quản lý Bóng đá</title>
</head>
<body style="margin:0 auto; width:1024px">
	<h1>Quản lý Bóng đá</h1>
	<p><a href="${pageContext.request.contextPath}/football/add" title="Thực hiện thêm">Thêm</a></p>
	<p></p>
	
	<table width="80%" border="1" cellpadding="1" cellspacing="1">
		<tr>
			<th width="10%">ID</th>
			<th width="50%">Tên đội</th>
			<th width="20%">Ngày thành lập</th>
			<th>Chức năng</th>
		</tr>
		<c:if test="${not empty listFootball}">
		<c:forEach items="${listFootball }" var="objFootball">
		<fmt:formatDate value="${objFootball.dateCreate}" pattern="dd-MM" var="dateFmt"/>
		<tr>
			<td>${objFootball.id}</td>
			<td>${objFootball.name}</td>
			<td>${dateFmt}</td>
			<td>
				<a href="${pageContext.request.contextPath}/bong-da/edit/1" title="Thực hiện sửa">Sửa</a> ||
				<a href="" title="Thực hiện xóa">Xóa</a>
			</td>
		</tr>
		</c:forEach>
		</c:if>
	</table>
	
</body>
</html>