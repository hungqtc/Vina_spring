<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@include file="/WEB-INF/templates/taglibs.jsp"%> 
 <div class="col-md-10">
				<form:errors path="cat.*"></form:errors>
	  			<div class="row">
	  				<div class="col-md-12 panel-info">
			  			<div class="content-box-header panel-heading">
		  					<div class="panel-title ">Đăng nhập</div>
			  			</div>
			  			<div class="content-box-large box-with-header">
				  			<div>
								<div class="row mb-10"></div>
								<c:if test="${not empty param['error'] }">
									<p>Sai tên đăng nhập hoặc mật khẩu</p>
								</c:if>
								<form action="${pageContext.request.contextPath}/auth/login" method="post">
								<div class="row">
									<div class="col-sm-6">
										<div class="form-group">
											<label for="name">Tên đăng nhập</label>
											<input type="text" class="form-control" name="username" placeholder="Nhập username">
										</div>
										<div class="form-group">
											<label for="name">Mật khẩu</label>
											<input type="text" class="form-control" name="password" placeholder="Nhập password">
										</div>

									</div>

									
								</div>
								
								<hr>

								<div class="row">
									<div class="col-sm-12">
										<input type="submit" value="Login" class="btn btn-success" />
									</div>
								</div>
							 </form>
							</div>
						</div>
			  		</div>
	  			</div><!-- /.row col-size -->
	  		
		  </div><!-- /.col-md-10 -->