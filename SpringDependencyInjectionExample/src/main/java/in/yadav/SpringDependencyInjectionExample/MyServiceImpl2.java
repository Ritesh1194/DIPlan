package in.yadav.SpringDependencyInjectionExample;

import org.springframework.stereotype.Component;

@Component("service")
public class MyServiceImpl2 implements MyService {

	public String getInfo() {
		return "Service 2's Info";
	}

}
