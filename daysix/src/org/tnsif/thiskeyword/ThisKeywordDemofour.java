package org.tnsif.thiskeyword;

public class ThisKeywordDemofour {
	int a;
	
	ThisKeywordDemofour ()
	{
		this(10);  // calling to the parameterized constructor
		System.out.println("inside default constructor");
		
		
	}
	ThisKeywordDemofour(int a)
	{
		this.a=a;
		System.out.println("inside parameterized constructor "+a);
	}

	public static void main(String[] args) { 
		// TODO Auto-generated method stub
		ThisKeywordDemofour t=new ThisKeywordDemofour();
		
		

	}

}
