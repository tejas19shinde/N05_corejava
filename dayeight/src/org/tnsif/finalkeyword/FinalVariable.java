//program to demonstrate on final keyword with variable
package org.tnsif.finalkeyword;

public class FinalVariable {
	final int num=18;// final variable must be initialized
	
	final float SALARY=78000.67f;
	
	public void print()
	
	{
		//we cannot change the value of final variable
		//SALARY=23009.7;
		System.out.println("Salary is : "+ SALARY);
	}

}
