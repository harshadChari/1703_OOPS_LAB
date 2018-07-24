package application;

import pojo.Ball;
import pojo.GoalKeeper;
import pojo.Player;
import pojo.Stadium;

public class FootballGame {

	public static void main(String[] args) {
		System.out.println("Initializing . . . . .");
		Stadium panajiStadium = new Stadium();
		
		GoalKeeper goalKeeper = new GoalKeeper("Omkar");
		Player striker1 = new Player("Dattesh");
		Player striker2 = new Player("Pratik");
		
		
		
		Ball ball = new Ball();
		
		System.out.println("\n------------------------------------------\n");
		System.out.println("Team Details:");
		System.out.println("Striker 1:" + striker1.getName());
		System.out.println("Striker 2:" + striker2.getName());
		System.out.println("GoalKeeper: " + goalKeeper.getName());
		System.out.println("\n------------------------------------------\n");
		striker1.kick();
		ball.get_moved();
		striker2.run();
		striker2.kick();
		
		goalKeeper.run();
		goalKeeper.passed();
		goalKeeper.passed(striker1);
		
		
		
	}

}
