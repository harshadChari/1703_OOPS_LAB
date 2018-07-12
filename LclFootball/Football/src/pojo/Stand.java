package pojo;

public class Stand {
	private Integer noOfSeats;

	public Stand() {
		this.noOfSeats = 500;
		System.out.println("creating Stands with 500 seats . . .");
	}
	public Stand(Integer noOfSeats) {
		
		this.noOfSeats = noOfSeats;
		System.out.println("creating Stands");
	}
	//--------getters & setters-------------
	
	
	

	public Integer getNoOfSeats() {
		return noOfSeats;
	}

	public void setNoOfSeats(Integer noOfSeats) {
		this.noOfSeats = noOfSeats;
	}
	
	
	
}
