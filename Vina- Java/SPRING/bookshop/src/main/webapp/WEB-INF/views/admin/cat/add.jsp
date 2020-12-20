<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/templates/taglibs.jsp" %>    

<div class="container-fluid">
    <!-- Breadcrumbs-->
    <h2>Thêm danh mục</h2>
    <ol class="breadcrumb">
        <li class="breadcrumb-item">
            <a href="${pageContext.request.contextPath}/admin/index">Trang chủ</a>
        </li>
        <li class="breadcrumb-item">
            <a href="${pageContext.request.contextPath}/admin/cat/index">Danh mục</a>
        </li>
        <li class="breadcrumb-item active">Thêm mới</li>
    </ol>
    <!-- Page Content -->
    
    
    <form action="${pageContext.request.contextPath}/admin/cat/add" method="post">
	    <div class="form-group" >
	        <label > Tên danh mục</label>
	        <c:if test="${not empty msg}"></c:if>
	        <input type="text" class="form-control" placeholder="Nhập tên danh mục" name="name" value="${name}">
	    	<form:errors path="cat.*" style="color:red;display:block"></form:errors>
	    	${msg}
	    	
	    </div>
	    <button type="submit" class="btn btn-primary">Thêm</button>
	</form>
   </div> 
   
   




            
            
                
    
