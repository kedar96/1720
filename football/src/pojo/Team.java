package pojo;

public class Team {
	
	private String teamName;
	private int noPlayers;
	
	
	public Team()
	{
		super();
		teamName = " ";
		noPlayers = 0;
	}

	public Team(String teamName, int noPlayers) {
		super();
		this.teamName = teamName;
		this.noPlayers = noPlayers;
	}

	public String getTeamName() {
		return teamName;
	}
	
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	
	public int getNoPlayers() {
		return noPlayers;
	}
	
	public void setNoPlayers(int noPlayers) {
		this.noPlayers = noPlayers;
	}
	
	
}
