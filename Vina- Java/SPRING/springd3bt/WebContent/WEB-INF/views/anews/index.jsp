<%@page import="edu.vinaenter.utils.SlugUtil"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<h3>Tin tức</h3>
<div class="main-content items-new">
	<ul>
	<c:if test="${not empty listNews }">
	<c:forEach items="${listNews }" var="objNews">
		<li>
			<h2>
				<a href="${pageContext.request.contextPath }/anews/detail/${SlugUtil.makeSlug(objNews.name)}-${objNews.id}.html" title="">
				${objNews.name}</a>
			</h2>
			<div class="item">
				<p>${objNews.description}</p>
				<div class="clr"></div>
			</div>
		</li>
		</c:forEach>
		</c:if>
	</ul>
</div>