<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:if test="${not empty objNews }">
<h3>${objNews.name}</h3>
<div class="main-content">
	<p>${objNews.detail}</p>
</div>
</c:if>