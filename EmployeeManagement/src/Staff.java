
public abstract class Staff {
	private String name;

	public Staff(String name) {
		this.name = name;
	}
	
	public Staff() {
		name=" ";
		
		
	}

	public abstract void calculateSalary();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
		
}
