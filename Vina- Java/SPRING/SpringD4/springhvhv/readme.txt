Download thư viện:
https://goo.gl/TXs1bh và https://goo.gl/ekoGwh 
Cấu hình sử dụng multipartResolver
<bean id="multipartResolver" class="org.springframework.web.multipart.commons.CommonsMultipartResolver">
	<property name="maxUploadSize" value="1000000"/>
</bean>
Tại controller:
@RequestParam("picture") CommonsMultipartFile commonsMultipartFile
commonsMultipartFile.transferTo(new File(filePath));

------------------
Download thư viện: https://goo.gl/nFXPKX
Tại -servlet.xml:
     xmlns:mvc="http://www.springframework.org/schema/mvc"
	 
     xsi:schemaLocation="
     http://www.springframework.org/schema/mvc 
	http://www.springframework.org/schema/mvc/spring-mvc.xsd
     "
	 
	>

	 Thêm: <mvc:annotation-driven />
Tại entities, sử dụng Bean Validation constraints:
https://goo.gl/L4LaQF 
Tại view: 
     <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
     <form:errors path="object.property"></form:errors>
Tại Controller sử dụng @Valid và BindingResult

------------------



