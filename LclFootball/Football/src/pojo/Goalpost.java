package pojo;

public class Goalpost {
	private Integer length;
	private Integer width;
	
	
	
	
	public Goalpost() {
		this.length = 20;
		this.width = 15;
	}
	public Goalpost(Integer height, Integer width) {
		
		this.length = height;
		this.width = width;
	}
	//------getters & setters--------------
	public Integer getHeight() {
		return length;
	}
	public void setHeight(Integer height) {
		this.length = height;
	}
	public Integer getWidth() {
		return width;
	}
	public void setWidth(Integer width) {
		this.width = width;
	}
	
	
}
