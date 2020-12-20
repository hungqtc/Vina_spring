<%@page import="edu.vinaenter.utils.SlugUtil"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/templates/taglibs.jsp"%>
<div class="clearfix main_content floatleft">


	<div class="clearfix content">
		<div class="content_title">
			<h2>${cat.name }</h2>
		</div>

		<div class="clearfix single_work_container">
				<c:if test="${not empty listLand }">
					<c:forEach var="land" items="${listLand }">
					<div class="clearfix single_work">
						<img class="img_top"
							src="${pageContext.request.contextPath}/uploads/${land.picture }"
							alt="" />
						<h2>${land.landName }</h2>
						
						<a href="${pageContext.request.contextPath}/detail/${SlugUtil.makeSlug(land.landName)}-${land.id}"><p class="caption">${land.landName }</p></a>
						</div>
					</c:forEach>
				</c:if>
			

			<!-- <div class="clearfix work_pagination">
				<nav>
					<a class="newer floatleft" href=""> < -- Trang trước</a> <a
						class="older floatright" href="">Trang kế -- ></a>
				</nav>
			</div> -->

		</div>
	</div>

</div>