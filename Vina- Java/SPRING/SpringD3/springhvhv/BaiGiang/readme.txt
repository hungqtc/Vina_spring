–servlet.xml:
<bean id="tilesConfigurer" class="org.springframework.web.servlet.view.tiles3.TilesConfigurer">
	<property name="definitions">
		<list>
			<value>/WEB-INF/template.xml</value>
		</list>
	</property>
</bean>
<bean id="viewResolver" class="org.springframework.web.servlet.view.UrlBasedViewResolver">
	<property name="viewClass" value="org.springframework.web.servlet.view.tiles3.TilesView"/>
</bean>
---------------------------------

template.xml:
<?xml version="1.0" encoding="ISO-8859-1" ?>
<!DOCTYPE tiles-definitions PUBLIC
       "-//Apache Software Foundation//DTD Tiles Configuration 3.0//EN"
       "http://tiles.apache.org/dtds/tiles-config_3_0.dtd">
       
<tiles-definitions>
  <definition name="public.template" template="/WEB-INF/templates/basic/index.jsp">
    <put-attribute name="header" value="/WEB-INF/templates/basic/header.jsp" />
    <put-attribute name="body" value="" />
    <put-attribute name="footer" value="/WEB-INF/templates/basic/footer.jsp" />
  </definition>
  
  <definition name="public.demo.index" extends="public.template">
    <put-attribute name="body" value="/WEB-INF/jsp/basic/index.jsp" />
  </definition>
</tiles-definitions>

---------------------------------
Thêm vào file web.xml:
<servlet-mapping>
	<servlet-name>default</servlet-name>
	<url-pattern>*.js</url-pattern>
	<url-pattern>*.css</url-pattern>
	<url-pattern>*.png</url-pattern>
	<url-pattern>*.gif</url-pattern>
	<url-pattern>*.jpg</url-pattern>
	<url-pattern>*.jpeg</url-pattern>
	<url-pattern>*.eot</url-pattern>
	<url-pattern>*.svg</url-pattern>
	<url-pattern>*.ttf</url-pattern>
	<url-pattern>*.woff</url-pattern>
</servlet-mapping>
---------------------------------

Cấu hình multipartResolver:
<bean id="multipartResolver" class="org.springframework.web.multipart.commons.CommonsMultipartResolver">
	<property name="maxUploadSize" value="1000000"/>
</bean>

