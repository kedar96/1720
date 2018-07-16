
public class Fact {

	private int num;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int factorial(int num) {
		// TODO Auto-generated method stub
		  if (num == 0)
	          return 1;
	        return num*factorial(num-1);
	}	  
}
