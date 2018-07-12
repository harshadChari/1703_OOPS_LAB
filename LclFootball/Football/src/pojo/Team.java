package pojo;

import pojo.Player;

public class Team {
	private String name;
	private Player[] players;
	private Integer playerNum;
	
	public void play()
	{
		System.out.println("Team " + this.getName() + " playing");
	}
	
	//-----getters & setters-------------
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Player[] getPlayers() {
		return players;
	}
	public void setPlayers(Player[] players) {
		this.players = players;
	}
	public Integer getPlayerNum() {
		return playerNum;
	}
	public void setPlayerNum(Integer playerNum) {
		this.playerNum = playerNum;
	}
	


	
	

}
