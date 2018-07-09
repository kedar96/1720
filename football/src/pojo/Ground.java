package pojo;

public class Ground {
	
	private String venueName;
	private int length;
	private int breadth;
	
	public Ground() {
		super();
		venueName =" ";
		length = 0;
		breadth = 0;
	}
	
	
	
	
	public Ground(String venueName, int length, int breadth) {
		super();
		this.venueName = venueName;
		this.length = length;
		this.breadth = breadth;
	}
	
	public String getVenueName() {
		return venueName;
	}
	public void setVenueName(String venueName) {
		this.venueName = venueName;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getBreadth() {
		return breadth;
	}
	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	
}
