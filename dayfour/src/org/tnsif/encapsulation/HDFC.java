//program to demonstrate on encapsulation
//encapsulation achives data hiding using access specifiers
package org.tnsif.encapsulation;

public class HDFC {
	@Override
	public String toString() {
		return "HDFC [accountNo=" + accountNo + ", cvvno=" + cvvno + ", pinno=" + pinno + ", acctype=" + acctype + "]";
	}
	//private data members
	private long accountNo;
	private int cvvno,pinno;
	private String acctype;
	
	//this is getters and setters
	public long getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}
	public int getCvvno() {
		return cvvno;
	}
	public void setCvvno(int cvvno) {
		this.cvvno = cvvno;
	}
	public int getPinno() {
		return pinno;
	}
	public void setPinno(int pinno) {
		this.pinno = pinno;
	}
	public String getAcctype() {
		return acctype;
	}
	public void setAcctype(String acctype) {
		this.acctype = acctype;
	}

}
