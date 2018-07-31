import java.util.Date;

public abstract class Staff {
	
	private String name;
	private Date dob;
	private char gender;
	private Integer salary;
	
	private Integer leaves_left;
	public Staff(String name)
	{
		this.name = name;
		System.out.println(".....creating staff.....");
	}
	public Staff(String name, Date dob, char gender, Integer salary) {
		super();
		this.name = name;
		this.dob = dob;
		this.gender = gender;
		this.salary = salary;
		System.out.println(".....creating staff.....");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public Integer getSalary() {
		return salary;
	}

	public Integer getLeaves_left() {
		return leaves_left;
	}

	
	
	
	
	
	
	
	

}
