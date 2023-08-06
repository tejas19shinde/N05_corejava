package org.tnsif.superkeyword;

class Nationality
{
	String nationname="Germany";

	public Nationality(String nationname) {
		//super();
		this.nationname = nationname;
		System.out.println(nationname);
	}
	
}

class Person extends Nationality
{
	String language;

	public Person(String nationname,String language) {
		super(nationname);//calling to parent class constructor
		this.language =language;
		// TODO Auto-generated constructor stub
	System.out.println(language);
	}
	
	
}
public class SuperKeywordWithConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p=new Person("german","germany");
		

	}

}
