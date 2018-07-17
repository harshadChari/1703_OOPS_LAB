
public class Factorial {
	public Factorial() {
		super();
		System.out.println("creating object ...");
	}



	private int value;	
	
	public int getValue() {
		return value;
	}



	public void setValue(int value) {
		this.value = value;
	}

	



	public void calcFactorial(int num) {
		int i;
		value = 1;
		for(i=1;i<=num;i++)
		{
			value*=i;
		}
	}

}
