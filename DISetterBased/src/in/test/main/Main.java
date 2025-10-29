package in.test.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.test.bean.Student;

public class Main {
	public static void main(String[] args) {
		String config_path = "/in/test/resources/applicationContext.xml";
		ApplicationContext applicationContext = new  ClassPathXmlApplicationContext(config_path);
		Student std = (Student) applicationContext.getBean("stdId");
		String k = std.toString();
		System.out.println(k);
		
	}

}
