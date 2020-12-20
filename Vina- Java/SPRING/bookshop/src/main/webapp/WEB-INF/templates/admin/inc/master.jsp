<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/templates/taglibs.jsp" %>
<!DOCTYPE html>
<html>
  <head>
    <title><tiles:insertAttribute name="title" /></title>
      <meta charset="utf-8">
      <meta http-equiv="X-UA-Compatible" content="IE=edge">
      <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
      <meta name="description" content="">
      <meta name="author" content="">
      <title>SB Admin - Blank Page</title>
      <!-- Custom fonts for this template-->
      <link href="${pageContext.request.contextPath}/admin/vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
      <!-- Page level plugin CSS-->
      <link href="${pageContext.request.contextPath}/admin/vendor/datatables/dataTables.bootstrap4.css" rel="stylesheet">
      <!-- Custom styles for this template-->
      <link href="${pageContext.request.contextPath}/admin/css/sb-admin.css" rel="stylesheet">
    <tiles:insertAttribute name="stylesheets" />
  </head>
  <body id="page-top">
  	<tiles:insertAttribute name="header" />
  	
  	<div id="wrapper">
  		<tiles:insertAttribute name="sidebar" />
  		<div id="content-wrapper">
  			<tiles:insertAttribute name="content" />
  			<tiles:insertAttribute name="footer" />
  		</div>
  		
  	</div>
  
   <script src="${pageContext.request.contextPath}/admin/vendor/jquery/jquery.min.js"></script>
   <script src="${pageContext.request.contextPath}/admin/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
   <script src="${pageContext.request.contextPath}/admin/vendor/jquery-easing/jquery.easing.min.js"></script>
   <script src="${pageContext.request.contextPath}/admin/js/sb-admin.min.js"></script>
    
    <tiles:insertAttribute name="js" />
  </body>
</html>