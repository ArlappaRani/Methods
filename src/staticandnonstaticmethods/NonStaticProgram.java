package staticandnonstaticmethods;

public class NonStaticProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*In this Program we calling the non static method in the same 
		 class So we creating object using class name with reference 
		 variable
		 */
         int a=10;
         NonStaticProgram pr=new NonStaticProgram();
         pr.Display(a);
	}


public void Display(int x)
{
	System.out.println("Display"+x);
}
}
