package pojo;
import pojo.Ground;
import pojo.Stand;

public class Stadium {
	private Stand stands;
	private Ground ground;
	
	public Stadium()
	{
		stands = new Stand();
		ground = new Ground();
		System.out.println("creating Stadium . . . ");
		
	}
	
	//gettrs & setters
	public Stand getStands() {
		return stands;
	}
	public void setStands(Stand stands) {
		this.stands = stands;
	}
	public Ground getGround() {
		return ground;
	}
	public void setGround(Ground ground) {
		this.ground = ground;
	}
	
	
	
}
