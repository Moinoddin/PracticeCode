
public class CheckRecursive {

	public static void main(String[] args) {
		
		CheckRecursive ch = new CheckRecursive();
		ch.recursivemethod(1);

	}

	public void recursivemethod(int a)
	{
		a++;
		if(a==10)
		System.out.println(a);
		recursivemethod(a);
		
	}
	
	
	
}
