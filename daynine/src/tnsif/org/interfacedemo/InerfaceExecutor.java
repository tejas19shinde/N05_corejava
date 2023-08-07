package tnsif.org.interfacedemo;
//driver class
//program to demonstrate on an interface
public class InerfaceExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SBIcard s=new SBIcard();
		s.displaycard();
		/*we can call the default method of interface by using obj of implementable class*/
		s.display();
		DebitCard.print();  //print() is  A STATIC method inside an interface to call we have use the interface
		
		CheesePopcorn c=new CheesePopcorn();
		c.displayReciepe();
		
		
		
		Person p=new Person();
		p.showdrinkname();
		
			
	}

}
