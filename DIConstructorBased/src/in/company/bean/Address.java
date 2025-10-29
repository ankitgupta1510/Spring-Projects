package in.company.bean;

public class Address {
	private String city;
	private String pinCode;
	
	public Address(String city,String pinCode) {
		this.city = city;
		this.pinCode = pinCode;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", pinCode=" + pinCode + "]";
	}
	

}
