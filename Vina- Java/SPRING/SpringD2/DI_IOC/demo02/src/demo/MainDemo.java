package demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainDemo {
	public static void main(String[] args) {
		// IOC
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		BeanFactory factory = (BeanFactory) context;
		
		Office office = (Office) factory.getBean("officeBean");
		
		System.out.println(office.getDeveloper().work());
		System.out.println(office.getTester().work());
		
	}
}
