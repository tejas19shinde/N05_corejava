package tnsif.org.interfacedemo;

public interface DebitCard {
	/*by default all the variables inside a interface is public static and final
	 * then we must have to initialize value for that variable*/
	 long cardno = 245350435l;
	 
	 void displaycard();
	 //we cant use concrete method inside an interface 
	 
	 
	 /*default method and static method are new  features of java8 which can be use inside the interface*/
	 default void display()
	 
	 {
		System.out.println("default method");
		
	 }
	 
	 static void print()
	 {
		 System.out.println("Static method");
	 }
	
}
