package in.test.bean;

public class Student {
	private String name;
	private int rollNo;
	
	private Adress adress;
	
	

	public void setName(String name) {
		this.name = name;
	}



	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}



	public void setAdress(Adress adress) {
		this.adress = adress;
	}



	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + ", adress=" + adress + "]";
	}
	
	

}
