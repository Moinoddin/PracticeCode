import java.util.HashSet;

public class HashsetDemo {

	public static void main(String[] args) {
		
		
		String str ="mainuddin";
		int i=0;
		char[] st = str.toCharArray();
		
		
		
		for(char ch1 : st)
		{
			if(ch1 == 'a' || ch1 == 'i' || ch1 == 'e' || ch1 == 'o' || ch1 == 'u')
			{
				System.out.print(ch1);
			}
				
		}
		
		
		

	}

}
