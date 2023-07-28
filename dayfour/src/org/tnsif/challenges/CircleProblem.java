/*there are n people standing in a circle waiting to be executed. The counting out begins at some
 *  point in the circle and proceeds around the circle in a fixed direction . in each step a 
 *  certain number of people are skipped and the next person is executed. the elimination proceeds 
 *  around the circle( which is becoming smaller and smaller as the executed people are removing),
 *   until only the last person remains , who is given freedom.
 *   Given the total number of person n and a number k which indicates that k-1 person are
 *   skipped and the k'th person is killed in the circle
 *   The task is to choose the person in the initial circle that survives
 *   
 *   let k=2 n=7 hence k-1=2-1=1 person is skilled and very second person is killed
 */
package org.tnsif.challenges;
import java.util.Scanner;

public class CircleProblem {
	static int survive(int n,int k)
	{
		if(n==1)
			return 1;
		else
			return(survive(n-1,k)+k-1)%n+1;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		 int k=sc.nextInt();
		 System.out.println(survive(n,k));
		
		
		
	}
}
