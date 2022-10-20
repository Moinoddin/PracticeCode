
public class StringbutlastNumberSame {

	public static void main(String[] args) {
		
		String str = "my name is Mainuddin 786";
		
		int n = str.length()-1;
		
	//	System.out.println(n);
		for(int i=20; i<=n ; i++)
		{
			System.out.print(str.charAt(i));
		}
		for(int i=20; i>=0 ; i--)
		{
			System.out.print(str.charAt(i));
		}

	}

}
