<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/templates/taglibs.jsp"%>
<div class="col-md-10">

	<div class="content-box-large">
		<div class="row">
			<div class="panel-heading">
				<div class="panel-title ">Quản lý tin</div>
				${msg }
			</div>
		</div>
		<hr>
		<div class="row">
			<div class="col-md-8">
				<a href="add.html" class="btn btn-success"><span
					class="glyphicon glyphicon-plus" aria-hidden="true"></span>&nbsp;Thêm</a>

			</div>
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
							<th>Tên</th>
							<th>Danh mục</th>
							<th>Lượt xem</th>
							<th>Hình ảnh</th>
							<th>Chức năng</th>
							

						</tr>
					</thead>
					<tbody>
						<c:forEach items="${listLand }" var="land">
							<c:set var="urlEdit"
								value="${pageContext.request.contextPath}/admin/land/edit/${land.id }">
							</c:set>
							<c:set var="urlDel"
								value="${pageContext.request.contextPath}/admin/land/del/${land.id }">
							</c:set>
							<tr class="odd gradeX">
								<td>${land.id }</td>
								<td>${land.landName }</td>
								<td>${land.catName }</td>
								<td class="center">${land.countViews }</td>
								<td class="center text-center"><c:choose>
										<c:when test="${not empty land.picture }">
											<img
												src="${pageContext.request.contextPath}/uploads/${land.picture }" />
										</c:when>
										<c:otherwise>
												Khong co hinh anh
										</c:otherwise>
									</c:choose></td>

								<td class="center text-center"><a href="${urlEdit }" title=""
									class="btn btn-primary"><span
										class="glyphicon glyphicon-pencil "></span> Sửa</a> 
										<a href="${urlDel }"
									title="" class="btn btn-danger"><span
										class="glyphicon glyphicon-trash"></span> Xóa</a></td>
							</tr>
						</c:forEach>


					</tbody>
				</table>

				<!-- Pagination -->
				<c:if test="${not empty totalPage}">
					<nav class="text-center" aria-label="...">
						<ul class="pagination">

							<c:forEach begin="1" end="${totalPage}" var="i">
								<li <c:if test="${i == page}">class='active'</c:if>><a
									href="${pageContext.request.contextPath}/admin/land/index/${i}">${i}</a></li>
							</c:forEach>

						</ul>
					</nav>
				</c:if>
				<!-- /.pagination -->

			</div>
		</div>
		<!-- /.row -->
	</div>
	<!-- /.content-box-large -->



</div>