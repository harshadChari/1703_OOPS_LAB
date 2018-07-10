package pojo;

import java.util.Date;

public class Player {
	private Date dob;
	private String name;
	private char gender;
	
public Player() {
		
		this.name = "";
	}
	
	public Player(String name) {
		
		this.name = name;
	}

	public void run() 
	{
		System.out.println(this.getName() + "is running");
	}

	public void kick()
	{
		System.out.println(this.getName() + "kicked the ball");
	}
	
	
	//-------getters & setters--------------
	public char getGender() {
		return gender;
	}


	public void setGender(char gender) {
		this.gender = gender;
	}

	
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	
}
