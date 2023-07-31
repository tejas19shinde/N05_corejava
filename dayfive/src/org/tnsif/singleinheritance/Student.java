package org.tnsif.singleinheritance;
//this is derived class
public class Student extends Citizen {
	
	private String clgname;
	private int rollno;
	
	//
	public Student() {
		super();
		System.out.println("child class default constructor");
		// TODO Auto-generated constructor stub
		
		
		}


	public Student(String city, int pincode, long aadharno, long contact,int rollno, String clgname)
	{
		super(city, pincode, aadharno, contact);
		this.rollno=rollno;
		this.clgname=clgname;
	}
		
	
	//getters and setters
	public String getClgname() {
		return clgname;
	}

	public void setClgname(String clgname) {
		this.clgname = clgname;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	
	@Override
	public String toString() {
		return "Student [clgname=" + clgname + ", rollno=" + rollno + ", toString()=" + super.toString() + "]";
	}
	
	
	
		// TODO Auto-generated constructor stub
	}

