package org.tnsif.heirarchicalinheritance;

public class Android {
	private String brandname;
	private String slot;
	
	//getters and setters
	public String getBrandname() {
		return brandname;
	}
	public void setBrandname(String brandname) {
		this.brandname = brandname;
	}
	public String getSlot() {
		return slot;
	}
	public void setSlot(String slot) {
		this.slot = slot;
	}
	
	//toString method
	@Override
	public String toString() {
		return "Android [brandname=" + brandname + ", slot=" + slot + "]";
	}
	public Android() {
		System.out.println("Android");
		// TODO Auto-generated constructor stub
	}
	public Android(String brandname, String slot) {
		super();
		this.brandname = brandname;
		this.slot = slot;
	}
	

	
}
