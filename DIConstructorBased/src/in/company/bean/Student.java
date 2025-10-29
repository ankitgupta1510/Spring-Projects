package in.company.bean;

public class Student {
	private String name;
	private String rollNo;
	private Address adress;
	
	public Student(String name,String rollNo,Address address) {
		this.adress = address;
		this.name = name;
		this.rollNo = rollNo;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + ", adress=" + adress + "]";
	}
	

}
