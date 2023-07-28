
/*Ask the user for their birth year encoded as 2 digit(like "62")
 * and for the current year, also encoded as 2 digit("99").Write a program to find user current age in years
 */
package org.tnsif.challenges;
import java.util.Scanner;
public class AgeCalculator {
	static void ageis(int by,int cy)
	{
		if(by>cy)
			System.out.println("age is "+((100-by)+cy));
		else
			System.out.println("age is "+ (cy-by));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the birth year and current year");
		int by=sc.nextInt();
		int cy=sc.nextInt();
		ageis(by,cy);
		
	}

}
