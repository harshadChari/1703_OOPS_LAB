import java.util.Date;

public class App {

	public static void main(String[] args) {
		ContractTeacher ct1 = new ContractTeacher("Shubham");
		ContractTeacher ct2 = new ContractTeacher("Datta", new Date(12,05,1999),'m', (Integer)5000, "maths", (Integer)3, (Integer)5, new Date(12,07,2017));
		
		
		System.out.println("-------------------------------------------------------");
		ct1.calcSalary();		
		ct1.calcDailyWage();
		
		ct2.calcSalary();		
		ct2.calcDailyWage();		
		
	}

}
