package org.tnsif.heirarchicalinheritance;

public class SnowCone extends Android{
	private int version;

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return "snowCone [version=" + version + ", toString()=" + super.toString() + "]";
	}

	public SnowCone(String brandname, String slot,int version) {
		super(brandname,slot);
		this.version = version;
	}
	
	
}
