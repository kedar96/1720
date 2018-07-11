package application;

import pojo.Player;
import pojo.Ground;
import pojo.Manager;
import pojo.Team;

public class footballGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ground ground=new Ground();
		Player captain=new Player();
		Manager manager=new Manager();
		Team team=new Team();
		captain.setAge(33);
		captain.setName("Ronaldo");
		captain.setJerseyNo(7);
		Player goalkeeper=new Player("Manuel Neuer",30,1);
		System.out.println("captain name="+ captain.getName());
		System.out.println("goalkeeper name = "+goalkeeper.getName()+" age "+goalkeeper.getAge());
		
		
	}

}
