package encapsulation;

public class Encapsulation {
	
	private String str;
	private int integer;
	private double dbl;
	private float flt;
	private long lng;	
	
	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public int getInteger() {
		return integer;
	}

	public void setInteger(int integer) {
		this.integer = integer;
	}

	public double getDbl() {
		return dbl;
	}

	public void setDbl(double dbl) {
		this.dbl = dbl;
	}

	public float getFlt() {
		return flt;
	}

	public void setFlt(float flt) {
		this.flt = flt;
	}

	public long getLng() {
		return lng;
	}

	public void setLng(long lng) {
		this.lng = lng;
	}

	public Encapsulation() {
		super();
		
	}

	public Encapsulation(String str, int integer, double dbl, float flt, long lng) {
		super();
		this.str = str;
		this.integer = integer;
		this.dbl = dbl;
		this.flt = flt;
		this.lng = lng;
	}

	@Override
	public String toString() {
		return "Encapsulation [str=" + str + ", integer=" + integer + ", dbl=" + dbl + ", flt=" + flt + ", lng=" + lng
				+ "]";
	}
	
	

}
