
public class Mobile extends Electronics {
	private String mobModel;
	private Integer qty;


	public String getMobModel() {
		return mobModel;
	}

	public void setMobModel(String mobModel) {
		this.mobModel = mobModel;
	}

	public Integer getQty() {
		return qty;
	}

	public void setQty(Integer qty) {
		this.qty = qty;
	}

	public Mobile(String mobModel, Integer qty) {
		super();
		this.mobModel = mobModel;
		this.qty = qty;
	}

	public Mobile() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void calculatePrice() {
		// TODO Auto-generated method stub
		System.out.println("The price of Mobile ");
	}




}
