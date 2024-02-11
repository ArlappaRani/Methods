package methodtypes;
import java.util.Scanner;
public class CalculatorProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//taking the user inputs
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the first number");//displaying the first number
		int num1=scan.nextInt();//storing the number in num1 variable
		System.out.println("Enter the second number");//displaying the second number
		int num2=scan.nextInt();//storing the number in num2 variable
		
		//addition operation 
		int res1 = Add(num1,num2);//arguments passing to a method/
		System.out.println("Additon result"+res1);//printing result
		//Subtraction operation
		int res2=Sub(num1,num2);
		System.out.println("subtraction result"+res2);
		//Multiplication operation
		int res3=Mul(num1,num2);
		System.out.println("Multiplication result"+res3);
		//Division operation
		int res4=Div(num1,num2);
		System.out.println("Division result"+res4);
	}
		//the methods creating for performing a specific task
		public static int Add(int x,int y)//taking inputs
		{
		return x+y;
		}
		public static int Sub(int x,int y)
		{
			return x-y;
		}
		public static int Mul(int x,int y)
		{
			return x*y;
		}
		public static int Div(int x,int y)
		{
			return x/y;
		}
		
		
		
		

	}


