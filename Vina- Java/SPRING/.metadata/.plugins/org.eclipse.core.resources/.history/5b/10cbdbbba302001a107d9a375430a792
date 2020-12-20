<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@include file="/WEB-INF/templates/taglibs.jsp"%> 
 <div class="col-md-10">
				<form:errors path="user.*"></form:errors>
	  			<div class="row">
	  				<div class="col-md-12 panel-info">
			  			<div class="content-box-header panel-heading">
		  					<div class="panel-title ">Sửa người dùng</div>
			  			</div>
			  			<div class="content-box-large box-with-header">
				  			<div>
								<div class="row mb-10"></div>
								<form action="${pageContext.request.contextPath}/admin/user/edit/${oldUser.id}" method="post">
								<div class="row">
									<div class="col-sm-6">
										<div class="form-group">
											<label for="name">Username</label>
											<input type="text" class="form-control" name="username" value="${oldUser.username}" readonly="readonly">
										</div>

									</div>
									</div>
									<div class="row">
									<div class="col-sm-6">
										<div class="form-group">
											<label for="name">Fullname</label>
											<input type="text" class="form-control" name="fullname" value="${oldUser.fullname}" >
										</div>

									</div>
									</div>
									<div class="row">
									<div class="col-sm-6">
										<div class="form-group">
											<label for="name">Password</label>
											<input type="text" class="form-control" name="password" >
										</div>

									</div>

									
								</div>
								
								<hr>

								<div class="row">
									<div class="col-sm-12">
										<input type="submit" value="Sửa" class="btn btn-success" />
										<input type="reset" value="Nhập lại" class="btn btn-default" />
									</div>
								</div>
							 </form>
							</div>
						</div>
			  		</div>
	  			</div><!-- /.row col-size -->
	  		
		  </div><!-- /.col-md-10 -->