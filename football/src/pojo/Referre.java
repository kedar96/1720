package pojo;

public class Referre {

	private String firstName;
	private int age;
	
	public Referre() {
		super();
		firstName = " ";
		age = 0;
	}
	
	public Referre(String firstName, int age) {
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
	
	public void givesFouls()
	{
		System.out.println("referre rewards the opposition team when foul is committed");
	}
	
	public void allowsSubstitution()
	{
		System.out.println("referre allows the substitution of the players");
	}
}
