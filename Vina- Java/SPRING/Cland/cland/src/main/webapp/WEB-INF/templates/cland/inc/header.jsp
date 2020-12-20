<%@page import="edu.vinaenter.utils.SlugUtil"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/templates/taglibs.jsp"%>
<div class="wrapper header">
	<div class="clearfix header_top">
		<div class="clearfix logo floatleft">
			<a href="index.html"><h1>
					<span>C</span>Land
				</h1></a>
		</div>
		<div class="clearfix search floatright">
			<form action="${pageContext.request.contextPath}/search" method="get">
				<input type="text" placeholder="Search" name="name" /> <input
					type="submit" value="Tìm kiếm" />
			</form>
		</div>
	</div>
	<div class="header_bottom">
		<nav>
			<ul id="nav">
				<li><a href="${pageContext.request.contextPath}/home">Trang
						chủ</a></li>
				<li id="dropdown"><a href="${pageContext.request.contextPath}/home">Bất động sản</a>
					<ul>
						<c:if test="${not empty listCat }">
							<c:forEach var="cat" items="${listCat }">
								<li ><a
									href="${pageContext.request.contextPath}/cat/${SlugUtil.makeSlug(cat.name)}-${cat.id}">${cat.name }</a></li>
							</c:forEach>
						</c:if>
					</ul></li>
				<li><a href="${pageContext.request.contextPath}/contact">Liên
						hệ</a></li>
			</ul>
		</nav>
	</div>
</div>
