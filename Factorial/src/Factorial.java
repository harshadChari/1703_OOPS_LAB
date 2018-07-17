
public class Factorial {
	public Factorial() {
		super();
		System.out.println("creating object ...");
	}



	private int value;	
	private static int svalue;
	
	public static int getSvalue() {
		return svalue;
	}

	public static void setSvalue(int svalue) {
		Factorial.svalue = svalue;
	}



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
	
	public static void calcStaticFactorial(int num) {
		int i;
		svalue = 1;
		for(i=1;i<=num;i++)
		{
			svalue*=i;
		}
	}

}
