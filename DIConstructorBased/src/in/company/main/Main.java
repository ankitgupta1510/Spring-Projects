package in.company.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		String path = "/in/company/resources/applicationContext.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(path);
		System.out.println(ac.getBean("stdId"));
	}

}
