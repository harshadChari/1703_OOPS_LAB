import java.util.Date;

public class TeachingStaff extends Staff{
	
	private String subject;
	private Integer no_of_classses;
	
	public TeachingStaff(String name)
	{
		super(name);
		System.out.println(".....creating teacher.....");
	}
	public TeachingStaff(String name, Date dob, char gender, Integer salary, String subject, Integer no_of_classses) {
		super(name, dob, gender, salary);
		this.subject = subject;
		this.no_of_classses = no_of_classses;
		
		System.out.println(".....creating teacher.....");
	}



	

}
