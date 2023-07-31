package org.tnsif.heirarchicalinheritance;

//child class1
public class Tiramisu extends Android{
	private int version;

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return "Tiramisu [version=" + version + ", toString()=" + super.toString() + "]";
	}

	public Tiramisu(String brandname,String slot ,int version) {
		super(brandname,slot);
		this.version = version;
	}

	
	
	
	
}
