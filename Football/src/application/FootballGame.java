package application;

import pojo.Player;

public class FootballGame {

	public static void main(String[] args) {
		Player goalKeeper = new Player();
		Player striker = new Player("Omkar");
		
		System.out.println("Striker: " + striker.getName());
		
		goalKeeper.setName("Adinath");
		
		System.out.println("Goalkeeper: " + goalKeeper.getName());
	}

}
