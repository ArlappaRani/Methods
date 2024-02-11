package methodtypes;

public class Method2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5;//taking input1
		int b=4;//taking input2
		int c=a+b;//Adding two inputs and storing result in C variable
		Add(c);//Method calling and passing the value to another method
		
	}
	public static void Add(int num)//takes the arguments but it will not return a value
	{
		System.out.println(num);//printing  a result
	}
	
	

}
