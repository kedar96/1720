package application;

import pojo.Player;
import pojo.Ground;
import pojo.Manager;
import pojo.Team;
import pojo.GoalKeeper;

public class FootballGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ground ground=new Ground();
	//	Player captain=new Player();
		Player p1=new GoalKeeper();
		Manager manager=new Manager();
		Team team=new Team();
		GoalKeeper player1=new GoalKeeper("De gea",27,1);
		GoalKeeper gk1=new GoalKeeper();
//		captain.setAge(33);
//		captain.setName("Ronaldo");
//		captain.setJerseyNo(7);
//		Player goalkeeper=new Player("Manuel Neuer",30,1);
//		System.out.println("captain name="+ captain.getName());
		player1.catchBall();
	//	p1.calculateMatchesPlayed();
		gk1.setGoalsSaved("Buffon", 423, 1178);
		gk1.getgoalsSaved();
	}

}
