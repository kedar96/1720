
public class Tv extends Electronics{
	private String tvModel;

	public String getTvModel() {
		return tvModel;
	}

	public void setTvModel(String tvModel) {
		this.tvModel = tvModel;
	}
	@Override
	public void calculatePrice() {
		// TODO Auto-generated method stub
		System.out.println("The price of TV ");
	}
}
