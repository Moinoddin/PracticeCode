class Oops
{

	private int i;
	
	
		public void setter(int i)
		{
			this.i = i;
			
		}
		public int getter()
		{
			return this.i;
		}
		
}



public class Encapsul extends Oops
{

	public static void main(String[] args) {
		
		int i = 5;
		Oops obj = new Oops();
		
		obj.setter(i);
		
		System.out.println(obj.getter());
		
		
		
		

	}

}
