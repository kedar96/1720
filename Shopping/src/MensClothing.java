
public class MensClothing extends Clothes{
	
	private Integer size;
	private Integer sleeveLength;
	
	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

	public Integer getSleeveLength() {
		return sleeveLength;
	}

	public void setSleeveLength(Integer sleeveLength) {
		this.sleeveLength = sleeveLength;
	}


	@Override
	public void calculatePrice() {
		// TODO Auto-generated method stub
		System.out.println("the price ");
	}
}
