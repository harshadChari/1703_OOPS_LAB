import java.util.Scanner;

public class Factorial_main {

	static Scanner in;
	public static void main(String[] args) {
		int number;
		int factorial = 1;
		in = new Scanner(System.in);
		
		System.out.println("Enter Number:");
		number = in.nextInt();
		
		int i;
		for(i=1;i<=number;i++)
		{
			factorial*=i;
		}
		
		System.out.println(number + "! = " + factorial);

	}

}
