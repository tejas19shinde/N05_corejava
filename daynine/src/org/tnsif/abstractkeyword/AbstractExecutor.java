package org.tnsif.abstractkeyword;
//to provide implementation of any abstract method use child class
public class AbstractExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//we cannot create object for abstract class
		// Operator o=new Operator();
		Addition a=new Addition();
		a.print(3,4);
		a.operation();
		a.multi();
		
		
	}

}
