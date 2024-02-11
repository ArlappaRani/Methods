package MethodOverloading;
import java.util.Scanner;
public class CalculateArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		//Calculating squareArea
		System.out.println("Enter the side value");//displaying user input
		int Side=scan.nextInt();//storing user input in Side variable
		int SquareArea=CalcArea(Side);//Storing result in Square variable
		System.out.println(SquareArea);
		//Calculating CircleArea
		System.out.println("Enter the radius Value");
		float Radius=scan.nextFloat();
		float CircleArea=CalcArea(Radius);//passing the arguments
		System.out.println(CircleArea);
		//Calculating Rectangle area
		System.out.println("Enter the length and breadth value"); 
		int Length=scan.nextInt();
		int Breadth=scan.nextInt();
		int RectangleArea=CalcArea(Length,Breadth);
		System.out.println(RectangleArea);
	}
	public static int CalcArea(int Side)//taking the parameters
	{
		return Side*Side;//returning the values
	}
	public static float  CalcArea(float Radius)
	{
		return (3.14F*Radius*Radius);
	}
	public static int CalcArea(int Length,int Breadth)
	{
		return Length*Breadth;
	}	
		
		
		
		

	}


