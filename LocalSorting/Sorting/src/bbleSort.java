import java.util.Scanner;

public class bbleSort {

	public static void main(String[] args) {
		
		int numbers[];
		Scanner in =  new Scanner(System.in);
		
		System.out.println("-----------BUBBLE SORT---------------");
		
		//------get inputs-------------
		System.out.println("Enter Number of Elements:");
		int length = in.nextInt();
		
		numbers = new int[length];
		for(int i=0;i<length;i++)
		{
			System.out.print("\nElement " + i + ":");
			numbers[i] = in.nextInt();
		}
		
		
		Sorting.bSort(numbers);
	}

}
