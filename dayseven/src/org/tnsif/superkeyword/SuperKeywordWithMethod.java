package org.tnsif.superkeyword;
class Sports
{
	String sportsname="cricket";
	void display()
	{
		System.out.println("sports name is "+ sportsname);
	}
		
}

class Cricket extends Sports
{
	//int players=11;
	/*IF parent and child class methods are same and if we have to call parent class method inside child 
	 * class
	 */
	//super.display();
	int players=11;
	void display() {
		super.display();
	System.out.println("no. of PLayers is "+ players);

	
}
	
}
public class SuperKeywordWithMethod 
{
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Cricket c=new Cricket();
		
		c.display();
		
	}

}
