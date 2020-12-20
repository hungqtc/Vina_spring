<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/templates/taglibs.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" lang="en">
	<head>
		<title>CLand | VinaEnter Edu</title>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<!--Oswald Font -->
		<link href='http://fonts.googleapis.com/css?family=Oswald:400,300,700' rel='stylesheet' type='text/css'>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/cland/css/tooltipster.css" />
		<!-- home slider-->
		<link href="${pageContext.request.contextPath}/cland/css/pgwslider.css" rel="stylesheet">
		<!-- Font Awesome -->
		<link rel="stylesheet" href="${pageContext.request.contextPath}/cland/css/font-awesome.min.css">
		<link href="${pageContext.request.contextPath}/cland/css/style.css" rel="stylesheet" media="screen">	
		<link href="${pageContext.request.contextPath}/cland/css/responsive.css" rel="stylesheet" media="screen">		
	</head>

	<body>
	
	<section id="header_area">
			<tiles:insertAttribute name="header" />
		</section>
		<section id="content_area">
			<div class="clearfix wrapper main_content_area">
						<tiles:insertAttribute name="content" />
						
				<div class="clearfix sidebar_container floatright">
					<div class="clearfix sidebar">
						<tiles:insertAttribute name="left_bar" />
					</div>
				</div>
				</div>
			</div>
		</section>
		<section id="footer_bottom_area">
			<tiles:insertAttribute name="footer" />
		</section>
		
		
		<script type="text/javascript" src="http://code.jquery.com/jquery-1.7.0.min.js"></script>	
		<script type="text/javascript" src="${pageContext.request.contextPath}/cland/js/jquery.tooltipster.min.js"></script>		
		<script type="text/javascript">
			$(document).ready(function() {
				$('.tooltip').tooltipster();
			});
		</script>
		 <script type="text/javascript" src="${pageContext.request.contextPath}/cland/js/selectnav.min.js"></script>
		<script type="text/javascript">
			selectnav('nav', {
			  label: '-Navigation-',
			  nested: true,
			  indent: '-'
			});
		</script>		
		<script src="${pageContext.request.contextPath}/cland/js/pgwslider.js"></script>
		<script type="text/javascript">
			$(document).ready(function() {
				$('.pgwSlider').pgwSlider({
					
					intervalDuration: 5000
				
				});
			});
		</script>
		<script type="text/javascript">
					$(function() {
						var input = document.createElement("input");
						if(('placeholder' in input)==false) { 
							$('[placeholder]').focus(function() {
								var i = $(this);
								if(i.val() == i.attr('placeholder')) {
									i.val('').removeClass('placeholder');
									if(i.hasClass('password')) {
										i.removeClass('password');
										this.type='password';
									}			
								}
							}).blur(function() {
								var i = $(this);	
								if(i.val() == '' || i.val() == i.attr('placeholder')) {
									if(this.type=='password') {
										i.addClass('password');
										this.type='text';
									}
									i.addClass('placeholder').val(i.attr('placeholder'));
								}
							}).blur().parents('form').submit(function() {
								$(this).find('[placeholder]').each(function() {
									var i = $(this);
									if(i.val() == i.attr('placeholder'))
										i.val('');
								})
							});
						}
					}); 
				</script>
	</body>
</html>

		
