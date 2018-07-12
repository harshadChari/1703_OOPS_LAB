import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		
		int numbers[];
		int i,j,length,temp;
		Scanner in =  new Scanner(System.in);
		
		System.out.println("-----------BUBBLE SORT---------------");
		
		//------get inputs-------------
		System.out.println("Enter Number of Elements:");
		length = in.nextInt();
		
		numbers = new int[length];
		for(i=0;i<length;i++)
		{
			System.out.print("\nElement " + i + ":");
			numbers[i] = in.nextInt();
		}
		
		
		//--------Bubble sort-----------------
		for(i=0;i<length;i++)
		{
			for(j=0;j<length - i - 1;j++)
			{
				if(numbers[j] > numbers[j + 1])
				{
					temp = numbers[j];
					numbers[j] = numbers[j + 1];
					numbers[j + 1] = temp;
				}
			}
			
		}
		
		
		//------------print output----------------------
		System.out.println("===============Sorted Array=================");
		for(i=0;i<length;i++)
		{
			System.out.println(numbers[i]);
		}

	}

}
