class Override
{

	public final  int i = 5;
	
	public  void cantOver()
	{
		System.out.println("Override method for child");
	}
	
	public void method()
	{
		System.out.println("Super");
	}
	
}
public class Polymor extends Override
{

	public void cantOver()
	{
		super.cantOver();
		System.out.println("Im in Override child method");
	}
	public void method1()
	{
		System.out.println("Child");
	}
	
	
	public static void main(String[] args) 
	{
		
		
	 Polymor obj = new Polymor(); // Common Inheritance can access Parent and child methods
		
	 Override obj1 = new Polymor();	// UpCasting - Child to Parent object assign	
	 
	 Polymor obj2 = (Polymor)obj1; // downCasting - Parent obj to child class object assign
	 
	 
	 obj2.cantOver();
	 
	
	

	}

}
