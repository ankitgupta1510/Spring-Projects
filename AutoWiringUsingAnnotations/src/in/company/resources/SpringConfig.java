package in.company.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.company.bean.Address;
import in.company.bean.Student;

@Configuration

public class SpringConfig {
	
	@Bean
	public Address createAddressObj() {
		Address ad = new Address();
		ad.setCity("delhi");
		ad.setPinCode(555665);
		return ad;	
	}
	
	@Bean
	public Student createStudObj() {
		Student std= new Student();
//		std.setAddress(createAddressObj());
		std.setName("Ankit");
		std.setRoll(55);
		return std;
	}

}
