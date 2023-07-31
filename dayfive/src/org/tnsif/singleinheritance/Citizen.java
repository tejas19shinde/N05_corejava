package org.tnsif.singleinheritance;
//this is base class
public class Citizen {
	private String city;
	private int pincode;
	private long aadharno;
	private long contact;
	
	
	//default constructor
	public Citizen() {
		System.out.println(" default constructors");
		// TODO Auto-generated constructor stub
	}
	
	//parameterized
	public Citizen(String city, int pincode, long aadharno, long contact) {
		super();
		this.city = city;
		this.pincode = pincode;
		this.aadharno = aadharno;
		this.contact = contact;
		System.out.println("paramaterized constructor");
	}
	//getters and setters
	public String getCity() {
		return city;
	}
	@Override
	
	//
	public String toString() {
		return "Citizen [city=" + city + ", pincode=" + pincode + ", aadharno=" + aadharno + ", contact=" + contact
				+ "]";
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public long getAadharno() {
		return aadharno;
	}
	public void setAadharno(long aadharno) {
		this.aadharno = aadharno;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}

}
