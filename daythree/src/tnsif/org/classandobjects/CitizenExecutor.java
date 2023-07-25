//driver class
package tnsif.org.classandobjects;

public class CitizenExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Citizen c=new Citizen();
		
		/*c.adharno=123456789012L;
		c.gender="male";
		c.citizentype="young";
		c.city="nashik";
		*/
		
		
		Citizen c1=new Citizen("young",123456789012L, "male", "nashik");
		System.out.println(c1);
	}

}
