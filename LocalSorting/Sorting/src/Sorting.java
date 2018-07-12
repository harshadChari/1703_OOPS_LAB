import java.util.Scanner;

public class Sorting {
	private int numbers[];

	private static Scanner in;	
	public Sorting() {
		
		this.numbers = null;
	}


	public Sorting(int[] numbers) {
		
		this.numbers = numbers;
	}

	//----getters & setters------------
	public int[] getNumbers() {
		return numbers;
	}

	public void setNumbers(int[] numbers) {
		this.numbers = numbers;
	}
	
	//-----methods
	
	public void getInput()
	{
		in =  new Scanner(System.in);
		//------get inputs-------------
		System.out.println("Enter Number of Elements:");
		int length = in.nextInt();
		
		this.numbers = new int[length];
		
		for(int i=0;i<length;i++)
		{
			System.out.print("\nElement " + i + ":");
			this.numbers[i] = in.nextInt();
		}
	}
	
	public void bubbleSort()
	{
		int temp;
		//--------Bubble sort-----------------
				for(int i=0;i<numbers.length;i++)
				{
					for(int j=0;j<numbers.length - i - 1;j++)
					{
						if(numbers[j] > numbers[j + 1])
						{
							temp = numbers[j];
							numbers[j] = numbers[j + 1];
							numbers[j + 1] = temp;
						}
					}
					
				}
	}
	
	public void displayNumbers()
	{
		System.out.println("===============================");
		for(int i=0;i<numbers.length;i++)
		{
			System.out.print(numbers[i] + ", ");
		}
		System.out.println("\n===============================");
	}
	
	public static void bSort(int []data)
	{
		int temp;
		//--------Bubble sort-----------------
				for(int i=0;i<data.length;i++)
				{
					for(int j=0;j<data.length - i - 1;j++)
					{
						if(data[j] > data[j + 1])
						{
							temp = data[j];
							data[j] = data[j + 1];
							data[j + 1] = temp;
						}
					}
					
				}
				
				System.out.println("===============================");
				for(int i=0;i<data.length;i++)
				{
					System.out.print(data[i] + ", ");
				}
				System.out.println("\n===============================");
	}
	
}
