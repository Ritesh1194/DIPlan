package in.yadav.springcollections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringCollectionsApplication {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		SpringCollectionsProperties employee = (SpringCollectionsProperties) context.getBean("springCollectiosBean");

		System.out.println("List: " + employee.getList());

		System.out.println("Set : " + employee.getSet());

		System.out.println("Map : " + employee.getMap());

		System.out.println("Props : " + employee.getProps());

	}
}