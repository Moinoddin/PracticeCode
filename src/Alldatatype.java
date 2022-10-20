
public class Alldatatype {

	public static void main(String[] args) {
		
		boolean b = true;
		char c = 'M';
		
		byte k = 12;
		short s = 100;
		int i = 5000;
		long l = 789089;
		
		float f = 5.78f;
		double d = 78.90908090;
		
		System.out.println(b +" "+ c +" "+ k +" "+ s +" "+ i +" "+ l +" "+ f +" "+ d );
		
		int m[][] = {{1,2,4,5,6},{7,8,9,1,1}};
		
		
		for(int j=0; j<2; j++)
		{
			for(int v=0; v<5; v++)
			{
			
				System.out.print(m[j][v]+" ");
			}
			System.out.println(" ");
		}
		
		
	}

}
