package pojo;

public class GoalKeeper extends Player implements GoalsSaved {
	
	private Boolean hasGlowes;
	private Integer saves;
	private Integer  matchesPlayed;
	

	public Integer getSaves() {
		return saves;
	}

	public void setSaves(Integer saves) {
		this.saves = saves;
	}
	
	public Boolean getHasGlowes() {
		return hasGlowes;
	}

	public void setHasGlowes(Boolean hasGlowes) {
		this.hasGlowes = hasGlowes;
	}

	public Integer getMatchesPlayed() {
		return matchesPlayed;
	}

	public void setMatchesPlayed(Integer matchesPlayed) {
		this.matchesPlayed = matchesPlayed;
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
	
	@Override
	public void calculateMatchesPlayed()
	{
		System.out.println("no of matches played");
	}

	@Override
	public void getgoalsSaved() {
		// TODO Auto-generated method stub
		System.out.println("GK name "+this.name +" Matches Played "+this.matchesPlayed+" Saves Made "+this.saves);
	}

	@Override
	public void setGoalsSaved(String name, Integer matchesPlayed, Integer saves) {
		// TODO Auto-generated method stub
		this.name=name;
		this.matchesPlayed=matchesPlayed;
		this.saves=saves;
	}



}
