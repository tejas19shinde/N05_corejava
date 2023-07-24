
package org.ynsif.operators;
import java.util.Scanner;
public class BloodDonationEligibility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int age;
float weight;
System.out.println("enter the age of donor");
age=sc.nextInt();
System.out.println("enter the weight of donor");
weight=sc.nextInt();
if((age>19)&& (weight>50))
	System.out.println("the donor can donate the blood");
else
	System.out.println("cannot donate the blood");
sc.close();
	}

}
