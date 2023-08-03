package org.tnsif.finalkeyword;

public class Circle extends  Shape {
 final float area=34.6f;
	
	 /*void printshapetype()//cannot override the final method
	{
		System.out.println(area + "sq.cm");
	}*/
 
 public void display()
 {
	 System.out.println(area + "sq.cm");
 }
}
