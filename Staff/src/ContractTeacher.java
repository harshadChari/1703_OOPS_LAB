import java.util.Date;

public class ContractTeacher extends TeachingStaff implements DailyWages{

	private Integer no_of_lectures_per_week;
	private Date contract_begin;
	
	public ContractTeacher(String name)
	{
		super(name);
		System.out.println(".....creating contract teacher.....");
	}
	
	public ContractTeacher(String name, Date dob, char gender, Integer salary, String subject, Integer no_of_classses,
			Integer no_of_lectures_per_week, Date contract_begin) {
		super(name, dob, gender, salary, subject, no_of_classses);
		
		this.no_of_lectures_per_week = no_of_lectures_per_week;
		this.contract_begin = contract_begin;
		
		System.out.println(".....creating contract teacher.....");
	}

	@Override
	public void calcSalary() {
		// TODO Auto-generated method stub
		System.out.println("Calculating Salary " + this.getName());
		
	}

	@Override
	public void calcDailyWage() {
		// TODO Auto-generated method stub
		System.out.println("Calculating Wages " + this.getName());
		
	}
	
	
	
	
}
