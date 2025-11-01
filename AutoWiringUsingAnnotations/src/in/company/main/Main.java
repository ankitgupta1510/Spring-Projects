package in.company.main;  

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.company.bean.Student;
import in.company.resources.SpringConfig;

public class Main {
	public static void main(String[] args) {
		
		ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfig.class);
		System.out.print(ac.getBean(Student.class));
	}

}
