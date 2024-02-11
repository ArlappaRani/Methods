package methodtypes;

public class Method4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=3;//taking the inputs and storing in a variables 
		int b=4;
		int c=a*b;
		Multiply(c);//Method calling and passing arguments to method multiply

	}
	public static int Multiply(int num)//taking the parameters
	{
		System.out.println("The multiplication result is"+num);//result printing
		return num;//returning a value
	}

}
