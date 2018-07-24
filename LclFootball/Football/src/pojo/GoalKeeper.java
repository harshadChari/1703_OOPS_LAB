package pojo;

public class GoalKeeper extends Player{
	
	public GoalKeeper()
	{
		super();
	}
	
	public GoalKeeper(String name)
	{
		super(name);
	}
	
	@Override
	public void run() 
	{
		System.out.println("Goalkeeper " + this.getName() + " is running");
	}
	
	public void passed()
	{
		System.out.println(this.getName() + " passed the ball ");
	}
	
	public void passed(Player other)
	{
		System.out.println(this.getName() + " passed the ball to " + other.getName());
	}

}
