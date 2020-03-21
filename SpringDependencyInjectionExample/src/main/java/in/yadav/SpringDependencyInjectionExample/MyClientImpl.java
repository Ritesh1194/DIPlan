package in.yadav.SpringDependencyInjectionExample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("client1")
public class MyClientImpl implements MyClient {

	@Autowired
	private MyService service;

	public void doSomething() {
		String info = service.getInfo();
		System.out.println(info);
	}

}
