
public class NonTeachingStaff extends Staff{
	private Integer noOfAdmin;

	public Integer getNoOfAdmin() {
		return noOfAdmin;
	}

	
	public void setNoOfAdmin(Integer noOfAdmin) {
		this.noOfAdmin = noOfAdmin;
	}
	
	public NonTeachingStaff(Integer noOfAdmin) {
		super();
		this.noOfAdmin = noOfAdmin;
	}
	
	public NonTeachingStaff() {
		noOfAdmin=0;
	}

	@Override
	public void calculateSalary() {
		// TODO Auto-generated method stub
		System.out.println("non teaching salary");
	}
	
}
