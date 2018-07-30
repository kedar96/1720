
public class Electronics extends Items {

	private String type;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	@Override
	public void calculatePrice() {
		// TODO Auto-generated method stub
		System.out.println("The price of electronic good ");
	}
	
}
