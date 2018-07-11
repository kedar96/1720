package pojo;

public class Manager {

	private String firstName;
	private int age;
	
	public Manager() {
		super();
		firstName = " ";
		age = 0;
	}

	public Manager(String firstName, int age) {
		super();
		this.firstName = firstName;
		this.age = age;
	}

	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void makesSubstitution()
	{
		System.out.println("manager brings on new players");
	}
}
