
public class Fact {

	private int num;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public void factorial() {
		// TODO Auto-generated method stub
		int fact = 1;
		  for(int i=this.num;i>0;i--)
		  {    
		      fact=fact*i;    
		  }
		  System.out.println("Factorial of "+this.num+" is: "+fact);
	}	  
}
