//program to demonstrate on default and parameterized constructor

package tnsif.org.classandobjects;

public class Citizen {
	String citizentype;
	long adharno;
	String gender,city;
	
	
	public Citizen() {
		System.out.println("demonstration on default constructor");
		// TODO Auto-generated constructor stub
	}


	public Citizen(String citizentype, long adharno, String gender, String city) {
		super();
		this.citizentype = citizentype;
		this.adharno = adharno;
		this.gender = gender;
		this.city = city;
	}


	@Override
	public String toString() {
		return "Citizen [citizentype=" + citizentype + ", adharno=" + adharno + ", gender=" + gender + ", city=" + city
				+ "]";
	}
	
	
	//this is default constructor

}
