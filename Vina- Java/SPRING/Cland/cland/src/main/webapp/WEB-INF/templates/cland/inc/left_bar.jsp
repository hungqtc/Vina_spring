<%@page import="edu.vinaenter.utils.SlugUtil"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/templates/taglibs.jsp"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div class="clearfix single_sidebar category_items">
	<h2>Danh mục bất động sản</h2>
	<ul>
		<c:if test="${not empty listCat }">
			<c:forEach var="cat" items="${listCat }">
				<li class="cat-item"><a
					href="${pageContext.request.contextPath}/cat/${SlugUtil.makeSlug(cat.name)}-${cat.id}">${cat.name }</a>(${cat.countLand })</li>
			</c:forEach>
		</c:if>
	</ul>
</div>

<div class="clearfix single_sidebar">
	<div class="popular_post">
		<div class="sidebar_title">
			<h2>Xem nhiều</h2>
		</div>
		<ul>
			<c:if test="${not empty listLandHot }">
				<c:forEach var="land" items="${listLandHot }">
					<li><a
						href="${pageContext.request.contextPath}/detail/${SlugUtil.makeSlug(land.landName)}-${land.id}">
							${land.landName }</a></li>
				</c:forEach>
			</c:if>
		</ul>
	</div>
</div>

<%-- <div class="clearfix single_sidebar">
	<h2>Danh mục hot</h2>
	<ul>
		<c:if test="${not empty listCatHot }">
			<c:forEach var="cat" items="${listCatHot }">
				<li><a href="${pageContext.request.contextPath}/cland/cat/${SlugUtil.makeSlug(cat.name)}-${cat.id}">${cat.name } <span>(${cat.countLand })</span></a></li>
			</c:forEach>
		</c:if>
	</ul>
</div> --%>
