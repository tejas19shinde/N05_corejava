//program to demonstrate on encapsulation
//encapsulation achives data hiding using access specifiers

package org.tnsif.encapsulation;

public class EncapsulationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HDFC h=new HDFC();
		h.setAccountNo(123456789);
		h.setAcctype("savings account ");
		h.setCvvno(122);
		h.setPinno(9876);
		
		System.out.println(h.getAccountNo());
		System.out.println(h.getAcctype());
		System.out.println(h.getCvvno());
		System.out.println(h.getPinno());
		
		System.out.println(h);
		

	}

}
