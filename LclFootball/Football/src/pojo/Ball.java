package pojo;

public class Ball {
	private Integer size;
	
	public Ball() {
		
		this.size = 15;
		System.out.println("creating Ball .....");
	}
	
	

	public Ball(Integer size) {
		this.size = size;
	}



	//function moves ball
	public void get_moved()
	{
		System.out.println("Ball is in motion");
	}
	
	//getters & setters-----------------
	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}
	
	
	
}
