import java.util.Scanner;

public class Factorial_main {

	static Scanner in;
	public static void main(String[] args) {
		in = new Scanner(System.in);
		System.out.println("Choose type:");
		System.out.println("1:Simple");
		System.out.println("2: Class");
		
		int ch = in.nextInt();
		switch(ch)
		{
		case 1:
			simpleFactorial();
			break;
		case 2:
			classFactorial();
			break;	
		}

	}
	
	public static void simpleFactorial() {
		int number;
		int factorial = 1;
		
		
		System.out.println("Enter Number:");
		number = in.nextInt();
		
		int i;
		for(i=1;i<=number;i++)
		{
			factorial*=i;
		}
		
		System.out.println(number + "! = " + factorial);
	}
	
	public static void classFactorial() {
		
		System.out.println("Enter Number:");
		int number = in.nextInt();
		
		Factorial fact = new Factorial();
		fact.calcFactorial(number);
		
		System.out.println(number + "! = " + fact.getValue());
		
		
	}

}
