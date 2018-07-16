package pojo;

public class GoalKeeper extends Player {
	
	private Boolean hasGlowes;
	public Boolean getHasGlowes() {
		return hasGlowes;
	}

	public void setHasGlowes(Boolean hasGlowes) {
		this.hasGlowes = hasGlowes;
	}

	public GoalKeeper(String name,Integer age,Integer jerseyNo)
	{
		super(name,age,jerseyNo);
		hasGlowes=true;
	}
	
	public GoalKeeper()
	{
		super();
	}
	
	public void catchBall()
	{
		System.out.println("Goalkeeper catches the football");
	}
}
