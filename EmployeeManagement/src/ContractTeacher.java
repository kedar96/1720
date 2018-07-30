
public class ContractTeacher extends TeachingStaff implements Pay {
	
	@Override
	public void calculateSalary() 
	{
	//	System.out.println("teaching salary");
		calculatePay();
	}

	@Override
	public void calculatePay() {
		// TODO Auto-generated method stub
		System.out.println("calculating contract teacher pay");
	}
	
	

	
}
