package pojo;

public class Player {
	
	private String name;
	private char lastName[];
	private Integer age;
	private int jerseyNo;
	
	public void kicks()
	{
		System.out.println("player kicks the football");
	}
	
	public Player()
	{
		name=" ";
		age=0;
		jerseyNo=0;
	}
	
	public Player(String name,int age,int jerseyNo)
	{
		this.name=name;
		this.age=age;
		this.jerseyNo=jerseyNo;
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getJerseyNo() {
		return jerseyNo;
	}

	public void setJerseyNo(int jerseyNo) {
		this.jerseyNo = jerseyNo;
	}

	
	
	
}
