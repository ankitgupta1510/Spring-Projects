package in.company.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("/in/company/resources/applicationContext.xml");
//		ac.getBean("stdId");
		System.out.println(ac.getBean("stdId"));
		
		
	}

}
