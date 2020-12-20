<%@page import="edu.vinaenter.utils.SlugUtil"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<h3>Danh mục tin</h3>
<ul>
	<c:if test="${not empty listCat }">
	<c:forEach items="${listCat }" var="objCat">
	<li>
	<a href="${pageContext.request.contextPath }/anews/cat/${SlugUtil.makeSlug(objCat.name)}-${objCat.id}.html" title="">
	${objCat.name}</a></li>
	</c:forEach>
	</c:if>
</ul>