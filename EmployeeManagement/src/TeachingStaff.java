
public class TeachingStaff extends Staff {
	
	private Integer numberOfTeachingHours;

	public void calculateTeachingHours()
	{
		System.out.println("teaching hours");
	}
	
	public TeachingStaff()
	{
		super();
		numberOfTeachingHours=0;;
	}

	public Integer getNumberOfTeachingHours() {
		return numberOfTeachingHours;
	}
	
	public void setNumberOfTeachingHours(Integer numberOfTeachingHours) {
		this.numberOfTeachingHours = numberOfTeachingHours;
	}
	
	@Override
	public void calculateSalary() 
	{
		System.out.println("teaching salary");
	}
	
}
