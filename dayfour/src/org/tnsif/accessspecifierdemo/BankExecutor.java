package org.tnsif.accessspecifierdemo;
import org.tnsif.accessspecifiers.Bank;
public class BankExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b =new Bank();
		b.bankname="SBI";
		b.display();
		/*pinno and displayp() method are private so we cannot access into another class and 
		 * another package we can access private members only inside the same class*/
		
		//b.pinno:
		//b,displayp();
		
		//b.accontNo;
		//displayd();
		/*accountNo and display() are default members hence we cannot acces them in another 
		 * package . 
		 * we can access them only within the same package
		 */

	}

}
