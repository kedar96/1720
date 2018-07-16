
public class FactorialMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total=0;
		Fact f1=new Fact();
		f1.setNum(7);
		total=f1.factorial((f1.getNum()));
		System.out.println("Factorial of "+f1.getNum()+" is: "+total);
	}
}
