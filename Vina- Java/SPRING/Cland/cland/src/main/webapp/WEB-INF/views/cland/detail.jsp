<%@page import="edu.vinaenter.utils.SlugUtil"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/templates/taglibs.jsp" %>
<div class="clearfix main_content floatleft">
				
					
					<div class="clearfix content">
						<c:if test="${not empty land }">
						<h1>${land.landName} </h1>
						<div class="clearfix post-meta">
							<p><span><i class="fa fa-clock-o"></i> ${land.address}</span> <span><i class="fa fa-folder"></i> Diện tích: ${land.area}</span></p>
						</div>
						
						<div class="vnecontent">
							<p>${land.description}</p>
						</div>
						</c:if>
					</div>
					
						<div class="more_themes">
							<h2>Bất động sản liên quan <i class="fa fa-thumbs-o-up"></i></h2>
							<div class="more_themes_container">
								<c:forEach items="${relatedLand}" var="rland">
								<div class="single_more_themes floatleft">
									<img src="${pageContext.request.contextPath}/uploads/${rland.picture }" alt=""/>
									<a href="${pageContext.request.contextPath}/detail/${SlugUtil.makeSlug(rland.landName)}-${rland.id}"><h2>${rland.landName}</h2></a>
								</div>
								</c:forEach>
							</div>
						</div>
					
				</div>