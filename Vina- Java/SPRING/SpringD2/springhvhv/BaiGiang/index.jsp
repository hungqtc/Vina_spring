<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Quản lý Bóng đá</title>
</head>
<body style="margin:0 auto; width:1024px">
	<h1>Quản lý Bóng đá</h1>
	<p><a href="${pageContext.request.contextPath}/bong-da/add" title="Thực hiện thêm">Thêm</a></p>
	<p></p>
	
	<table width="80%" border="1" cellpadding="1" cellspacing="1">
		<tr>
			<th width="10%">ID</th>
			<th width="50%">Tên đội</th>
			<th width="20%">Ngày thành lập</th>
			<th>Chức năng</th>
		</tr>
		
		<tr>
			<td>1</td>
			<td>Pháp-Tây Ban Nha</td>
			<td>1-2</td>
			<td>
				<a href="${pageContext.request.contextPath}/bong-da/edit/1" title="Thực hiện sửa">Sửa</a> ||
				<a href="" title="Thực hiện xóa">Xóa</a>
			</td>
		</tr>
		
		<tr>
			<td>2</td>
			<td>Bồ Đào Nha-Úc</td>
			<td>2-1</td>
			<td>
				<a href="" title="Thực hiện sửa">Sửa</a> ||
				<a href="" title="Thực hiện xóa">Xóa</a>
			</td>
		</tr>
		
		<tr>
			<td>4</td>
			<td>Italia-Ý</td>
			<td>2-2</td>
			<td>
				<a href="" title="Thực hiện sửa">Sửa</a> ||
				<a href="" title="Thực hiện xóa">Xóa</a>
			</td>
		</tr>
		
		<tr>
			<td>5</td>
			<td>Hà Nội TT-SHB ĐN</td>
			<td>10-4</td>
			<td>
				<a href="" title="Thực hiện sửa">Sửa</a> ||
				<a href="" title="Thực hiện xóa">Xóa</a>
			</td>
		</tr>
		
	</table>
	
</body>
</html>