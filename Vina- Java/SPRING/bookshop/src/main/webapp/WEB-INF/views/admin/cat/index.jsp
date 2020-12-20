<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/templates/taglibs.jsp" %>    

<div class="container-fluid">
    <!-- Breadcrumbs-->
    <ol class="breadcrumb">
        <li class="breadcrumb-item">
            <a href="${pageContext.request.contextPath}/admin/index">Trang chủ</a>
        </li>
        <li class="breadcrumb-item active">Danh mục</li>
    </ol>
    <!-- Page Content -->
    <h2>Danh sách danh mục
    	<a href="${pageContext.request.contextPath}/admin/cat/add" class="btn btn-success">Thêm mới</a>
    </h2>
    	${msg }
    
          <div class="card-body">
            <div class="table-responsive">
              <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                <thead>
                  <tr>
                  	<th>ID</th>
                    <th>Name</th>
                    <th>Chức năng</th>
                  </tr>
                </thead>
                <tbody>
                 <c:if test="${not empty listCat }">
                 	<c:forEach items="${listCat }" var="cat">
	                 	<c:set var="urlEdit"
							value="${pageContext.request.contextPath}/admin/cat/edit/${cat.id }">
						</c:set>
						<c:set var="urlDel"
							value="${pageContext.request.contextPath}/admin/cat/del/${cat.id }">
						</c:set>
	                  <tr>
	                  	<td>${cat.id }</td>
	                    <td>${cat.name }</td>
	                    <td>
	                    	 <a href="${urlEdit}" class="btn btn-success">Sửa</a>
	                    	 <a href="${urlDel}" class="btn btn-danger">Xóa</a>
	                    </td>
	                  </tr>
	                 </c:forEach>
                  </c:if>
                </tbody>
              </table>
           
          </div>
          <div class="pull-right" >
          	<nav aria-label="Page navigation example">
			    <ul class="pagination" style="float:right">
			        <li class="page-item"><a class="page-link" href="#">Previous</a></li>
			        <li class="page-item"><a class="page-link" href="#">1</a></li>
			        <li class="page-item"><a class="page-link" href="#">2</a></li>
			        <li class="page-item"><a class="page-link" href="#">3</a></li>
			        <li class="page-item"><a class="page-link" href="#">Next</a></li>
			    </ul>
		 	</nav>
          </div>
          
        </div>
    
</div>



            
            
                
    
