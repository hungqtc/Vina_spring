<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/templates/taglibs.jsp"%>
<div class="col-md-10">

	<div class="content-box-large">
		<div class="row">
			<div class="panel-heading">
				<div class="panel-title ">Quản lý người dùng</div>
			</div>
		</div>
		<hr>
		<div class="row">
			<div class="col-md-8">
				<a href="add.html" class="btn btn-success"><span
					class="glyphicon glyphicon-plus" aria-hidden="true"></span>&nbsp;Thêm</a>

			</div>
			${msg }
			<form:errors path="user.*"></form:errors>
			<div class="col-md-4">
				<div class="input-group form">
					<input type="text" class="form-control" placeholder="Search...">
					<span class="input-group-btn">
						<button class="btn btn-primary" type="button">Search</button>
					</span>
				</div>
			</div>
		</div>

		<div class="row">
			<div class="panel-body">
				<table cellpadding="0" cellspacing="0" border="0"
					class="table table-striped table-bordered" id="example">
					<thead>
						<tr>

							<th>ID</th>
							<th>Username</th>
							<th>Fullname </th>
							<th>Chức năng</th>
						</tr>
					</thead>
					<tbody>
						<c:choose>
							<c:when test="${not empty listUser }">



								<c:forEach items="${listUser }" var="user">

									<c:set var="urlEdit"
										value="${pageContext.request.contextPath}/admin/user/edit/${user.id }">
									</c:set>
									<c:set var="urlDel"
										value="${pageContext.request.contextPath}/admin/user/del/${user.id }">
									</c:set>
									<tr class="odd gradeX">
										<td>${user.id }</td>
										<td>${user.username }</td>
										<td>${user.fullname }</td>
										<td class="center text-center"><a href="${urlEdit }"
											title="" class="btn btn-primary"><span
												class="glyphicon glyphicon-pencil "></span> Sửa</a> <a
											href="${urlDel }" title="" class="btn btn-danger"><span
												class="glyphicon glyphicon-trash"></span> Xóa</a></td>
									</tr>
								</c:forEach>
							</c:when>
							<c:otherwise>
								<p>Không có người dùng</p>
							</c:otherwise>
						</c:choose>
					</tbody>
				</table>
				
				<!-- Pagination -->
				<!-- <nav class="text-center" aria-label="...">
					<ul class="pagination">
						<li class="disabled"><a href="#" aria-label="Previous"><span
								aria-hidden="true">«</span></a></li>
						<li class="active"><a href="#">1 <span class="sr-only">(current)</span></a></li>
						<li><a href="#">2</a></li>
						<li><a href="#">3</a></li>
						<li><a href="#">4</a></li>
						<li><a href="#">5</a></li>
						<li><a href="#" aria-label="Next"><span
								aria-hidden="true">»</span></a></li>
					</ul>
				</nav> -->
				<!-- /.pagination -->

			</div>
		</div>
		<!-- /.row -->
	</div>
	<!-- /.content-box-large -->



</div>