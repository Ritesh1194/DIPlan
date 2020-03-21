package in.yadav.SpringDependencyInjectionExample;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext();
		appContext.scan("in.yadav.SpringDependencyInjectionExample");
		appContext.refresh();

		MyClient client = (MyClient) appContext.getBean("client1");
		client.doSomething();
	}

}
