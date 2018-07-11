package pojo;

public class Ball {

	private String color;
	private int weight;
	private int size;
	
	public Ball() {
		super();
		color=" ";
		weight=0;
		size=0;
	}
	
	public Ball(String color, int weight, int size) {
		super();
		this.color = color;
		this.weight = weight;
		this.size = size;
	}

	
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}

	public void plays()
	{
		System.out.println("team plays with another team");
	}
}
