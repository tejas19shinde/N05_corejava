package tnsif.org.interfacedemo;
//child class
//program to demonstrate on multiple inheritance
public class Person implements Colddrink,Alcohol{

	@Override
	public void showdrinkname() {
		// TODO Auto-generated method stub
		System.out.println(brand +" "+ alcoholname +" "+name);
	}

}
