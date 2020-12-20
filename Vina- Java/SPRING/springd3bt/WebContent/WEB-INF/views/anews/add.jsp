<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<h3>Thêm tin</h3>
<div class="main-content">
	
	<form action="${pageContext.request.contextPath}/anews/add" method="post"
		enctype="multipart/form-data">
		Tên tin: <input type="text" name="name" value="" /><br />
		<form:errors path="news.name"/>
		<br /> Mô tả:
		<textarea rows="3" cols="20" name="description"></textarea>
		<form:errors path="news.description"/>
		<br />
		<br /> Hình ảnh: <input type="file" name="file" value="" /><br />
		<br /> <input type="submit" name="submit" value="Thêm" /><br />
		<br />
	</form>
</div>