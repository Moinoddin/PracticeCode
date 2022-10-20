interface SuperInt
{

	void method1();
	void method2();
}

interface BaseInt extends SuperInt
{
	
	void method3();
	//void method4();
}

class Implant implements BaseInt
{
	
	public void method1()
	{
		System.out.println("Method1");
	}
	
	public void method2()
	{
		System.out.println("Method2");
	}
	public void method3()
	{
		System.out.println("Method3");
	}
	
	public String method4(String s)
	{
		System.out.println("Method4");
		
		return s;
	}
	
	public Implant method5(String str)
	{
		System.out.println(str);
		return new Implant();
		
	}
	
	public SuperChild intCheck(int i)
	{
		System.out.println(i);
		
		return new SuperChild();
	}
	
	
	
	
}

class SuperChild extends Implant 
{
	
	public void method6(Implant obj)
	{
		
		System.out.println("Method6");
		
		
	}	
	
	public Implant ImplantCheck(SuperChild obj)
	{
		Implant s = obj.method5("Mainuddin");
	
		return s;
	}
	
	
	
	}

public class Demo
{  
	public static void main(String args[])  
		{    
		
		Implant obj = new Implant();
		
	/*	obj.method1();
		obj.method2();
		obj.method3();
		obj.method4(); */
		
		SuperInt s = new Implant();
		
		s.method1();
		s.method2();
		
		System.out.println("--------------------------------------------------");
		
		//BaseInt b =(Implant)s;
		
		BaseInt b = new Implant();
		
		b.method1();
		b.method2();
		b.method3();
	//	b.method4();
		
		System.out.println("--------------------------------------------------");
		
		SuperChild sc = new SuperChild();
		
	    sc.method6(obj.method5("Mainuddin"));
	    
	    System.out.println("--------------------------------------------------");
	    
	   // int l = sc.intCheck(5);
	    
	    
	    sc.method6(sc.ImplantCheck(obj.intCheck(5)));
	    
	    
	    String op = new Implant().method4("created a object of class with its method");
		
		System.out.println(op);
		
		}
}  