//program to demonstrate on access specifiers
package org.tnsif.accessspecifiers;

public class Bank {
	
	//different access specifiers
	public String bankname;
	private int pinno;
	long accountNo=123456789;
	
	 public void display()
	 {
		 System.out.println("bank name is : "+ bankname);
	 }
	  //private method 
	 private void displayp()
	 {
		 System.out.println("pin no is : "+ pinno);
	 }
	 
	 // 
	 void displayd() {
		 System.out.println("Account number is :"+ accountNo);
	 }
}
