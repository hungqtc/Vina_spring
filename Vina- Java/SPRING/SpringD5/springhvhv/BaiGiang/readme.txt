- Download jdbc connector java: https://dev.mysql.com/downloads/connector/j/
- https://commons.apache.org/proper/commons-dbcp/download_dbcp.cgi
- https://commons.apache.org/proper/commons-pool/download_pool.cgi

File .xml:
<listener>
<listener-class>org.springframework.web.context.ContextLoaderListener</listener-class>
</listener>
<context-param>
	<param-name>contextConfigLocation</param-name>
	<param-value> 
		/WEB-INF/jdbc.xml
	</param-value>
</context-param>

File jdbc.xml:
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
	xmlns:mvc="http://www.springframework.org/schema/mvc" 
	xmlns:context="http://www.springframework.org/schema/context"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xmlns:util="http://www.springframework.org/schema/util"
	xsi:schemaLocation="
        http://www.springframework.org/schema/beans     
        http://www.springframework.org/schema/beans/spring-beans.xsd
        http://www.springframework.org/schema/mvc 
        http://www.springframework.org/schema/mvc/spring-mvc.xsd
        http://www.springframework.org/schema/context 
        http://www.springframework.org/schema/context/spring-context.xsd
        http://www.springframework.org/schema/util 
        http://www.springframework.org/schema/util/spring-util-3.0.xsd
        ">
	<bean id="myDataSource" class="org.apache.commons.dbcp2.BasicDataSource" destroy-method="close">
       <property name="driverClassName" value="com.mysql.jdbc.Driver"/>
       <property name="url" value="jdbc:mysql://localhost:3306/cnews?characterEncoding=UTF-8"/>
       <property name="username" value="root"/>
       <property name="password" value=""/>
   </bean>
	
	 <bean id="jdbcTemplate" class="org.springframework.jdbc.core.JdbcTemplate">  
		<property name="dataSource" ref="myDataSource"></property>  
	</bean> 
</beans>
