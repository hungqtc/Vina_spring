<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@include file="/WEB-INF/templates/taglibs.jsp"%> 
 <div class="col-md-10">
				<form:errors path="land.*"></form:errors>
	  			<div class="row">
	  				<div class="col-md-12 panel-info">
			  			<div class="content-box-header panel-heading">
		  					<div class="panel-title ">Thêm tin tức</div>
			  			</div>
			  			${msg }
			  			<div class="content-box-large box-with-header">
				  			<div>
								<div class="row mb-10"></div>
								<form action="${pageContext.request.contextPath}/admin/land/add" method="post" enctype="multipart/form-data">
								<div class="row">
									<div class="col-sm-6">
										<div class="form-group">
											<label for="name">Tên tin tức</label>
											<input type="text" class="form-control" name="landName" placeholder="Nhập tên">
										</div>
										
										<div class="form-group">
											<label>Danh mục tin</label>
											<c:if test="${not empty listCat }">
												
													<select class="form-control" name="cid">
													<c:forEach items="${listCat }" var="cat">
													   <option value="${cat.id}">${cat.name}</option>
													   </c:forEach>
													</select>
												
											</c:if>
										</div>
										
										<div class="form-group">
											<label for="name">Địa chỉ</label>
											<input type="text" class="form-control" name="address" placeholder="Nhập địa chỉ">
										</div>
										
										<div class="form-group">
											<label for="name">Diện tích</label>
											<input type="text" class="form-control" name="area" placeholder="Nhập diện tích">
										</div>
										
										<div class="form-group">
											<label>Thêm hình ảnh</label>
											<input type="file" class="btn btn-default" id="exampleInputFile1" name="file" >
											<p class="help-block"><em>Định dạng: jpg, png, jpeg,...</em></p>
										</div>
										
										<div class="form-group">
										   <label>Mô tả</label>
										   <textarea class="form-control" rows="3" name="description"></textarea>
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
							 </form>
							</div>
						</div>
			  		</div>
	  			</div><!-- /.row col-size -->
	  		
		  </div><!-- /.col-md-10 -->