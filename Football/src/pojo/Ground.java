package pojo;
import pojo.Goalpost;

public class Ground {
	private Integer length;
	private Integer width;
	
	private Goalpost goalPostLeft;
	private Goalpost goalPostRight;	
	
	
	//----------getters & setters--------------
	public Integer getLength() {
		return length;
	}
	public void setLength(Integer length) {
		this.length = length;
	}
	public Integer getWidth() {
		return width;
	}
	public void setWidth(Integer width) {
		this.width = width;
	}
	public Goalpost getGoalPostLeft() {
		return goalPostLeft;
	}
	public void setGoalPostLeft(Goalpost goalPostLeft) {
		this.goalPostLeft = goalPostLeft;
	}
	public Goalpost getGoalPostRight() {
		return goalPostRight;
	}
	public void setGoalPostRight(Goalpost goalPostRight) {
		this.goalPostRight = goalPostRight;
	}
	
}
