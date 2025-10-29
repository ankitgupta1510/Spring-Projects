package in.test.bean;

public class Adress {
	private String city;
	private String pincode;
	private String houseNo;
	
	
	public void setCity(String city) {
		this.city = city;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}
	@Override
	public String toString() {
		return "Adress [city=" + city + ", pincode=" + pincode + ", houseNo=" + houseNo + "]";
	}
	

}
