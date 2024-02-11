package MethodOverloading;

public class MaggiProgram {
	public static void getMaggi()
	{
		System.out.println("For normal maggi bill is 30");
	}
	public static void getMaggi(int quantity)//taking parameters
	{
		System.out.println("For " +(quantity)+ "Normal Maggi Bill is:" +(quantity*30));
	}
	public static void getMaggi(String Type)
	{
		System.out.println("For" +(Type)+ "Maggi bill is 50rs");
	}
	public static void getMaggi(int quantity,String Type)
	{
		System.out.println("For quantity of" +(quantity)+ "of" +(Type)+ "Maggi bill is"+(quantity*50));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getMaggi();//passing the values to methods while method calling
		getMaggi(2);
		getMaggi("Masala");
		getMaggi(2,"Masala");
		
		
		

	}

}
