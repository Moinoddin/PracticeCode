 class SuperClass
{

	public void overrideMethod()
	{
		System.out.println("I am in SuperClass");
	}


}



public class Finall extends SuperClass {

   static  int i=100;
	public static void main(String[] args) {
		
		i=200;
		SuperClass sc = new SuperClass();
		sc.overrideMethod();

	}

	public void overrideMethod()
	{
		System.out.println("I am in SuperClass Final Key Example Class");
	}
	
}
