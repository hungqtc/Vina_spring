<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@include file="/WEB-INF/templates/taglibs.jsp" %>
 <div class="col-md-10">

	  			<div class="row">
	  				<div class="col-md-12 panel-info">
			  			<div class="content-box-header panel-heading">
		  					<div class="panel-title ">Sửa tin tức</div>
			  			</div>
			  			<form action="${pageContext.request.contextPath }/admin/land/edit/${land.id}" method="post" enctype="multipart/form-data">
			  			<div class="content-box-large box-with-header">
				  			<div>
								<div class="row mb-10"></div>
								
								<div class="row">
									<div class="col-sm-6">
										<div class="form-group">
											<label for="landName">Tên tin</label>
											<input type="text" class="form-control" name="landName" value="${land.landName }" placeholder="Nhập tên tin">
										</div>
										
										<div class="form-group">
											<label>Danh mục tin</label>
											
											<select class="form-control" name="cid">
											<c:forEach items="${listCat}" var="cat">
											   <c:choose>
												   <c:when test="${cat.id ==land.cid }">
												   	<c:set var="act" value="selected = 'selected'" /> 
												   </c:when>
												   <c:otherwise>
												   	<c:set var="act" value="" /> 
												   </c:otherwise>
											   </c:choose>
											   
											   <option ${act} value="${cat.id }">${cat.name } </option> 
											   </c:forEach>
											</select>
											
										</div>

										<div class="form-group">
											<label>Sửa hình ảnh</label>
											<input type="file" class="btn btn-default" value="${land.picture }" name="file" id="exampleInputFile1">
											<p class="help-block"><em>Định dạng: jpg, png, jpeg,...</em></p>
										</div>
										<div class="form-group">
											<label for="area">diện tích
											</label>
											<input type="text" class="form-control" name="area" value="${land.area }" placeholder="Nhập tên tin">
										</div>
										<div class="form-group">
										   <label for="address">địa chỉ</label>
										   <textarea class="form-control" name="address"   rows="3">${land.address }</textarea>
										</div>
									</div>

									<div class="col-sm-6"></div>

									<div class="col-sm-12">
										<div class="form-group">
										   <label for="description">Chi tiết</label>
										   <textarea class="form-control" name="description" rows="7">${land.description }</textarea>
										</div>
									</div>
								</div>

								<hr>

								<div class="row">
									<div class="col-sm-12">
										<input type="submit" value="Thêm" class="btn btn-success" />
										<input type="reset" value="Nhập lại" class="btn btn-default" />
									</div>
								</div>

							</div>
						</div>
						</form>
			  		</div>
	  			</div><!-- /.row col-size -->
	  		
		  </div><!-- /.col-md-10 -->