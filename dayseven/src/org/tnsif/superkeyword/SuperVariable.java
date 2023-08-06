//
package org.tnsif.superkeyword;
//parent class
class State
{
	String statename="punjab";
	
}

class Capital extends State
{
	String statename="haryana";
	String capital="Chandigarh";
	
	public void display()
	{
		/*super keyword with variable is used to call parent class variable if and only if parent and child 
		 * class variable are same */
		System.out.println(super.statename);
		System.out.println(statename);
	}
}
public class SuperVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Capital c=new Capital();
			//	System.out.println(c.capital);
	c.display();
	}
	

}
