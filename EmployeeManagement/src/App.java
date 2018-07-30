
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Staff staff1=new TeachingStaff();
		Staff staff2=new NonTeachingStaff();
		staff1.calculateSalary();
		staff2.calculateSalary();
		Staff staff3=new Lecturer();
		Lecturer staff4=new Lecturer();
		staff3.calculateSalary();
		ContractTeacher staff5=new ContractTeacher();
		staff5.calculatePay();
	}

}
