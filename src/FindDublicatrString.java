
public class FindDublicatrString {

	public static void main(String[] args) {
		
		
		
		String str = "Mainuddin";
		int count;
		char[] ch = str.toCharArray();
		
		System.out.println(ch.length);
		for(int i=0; i<ch.length; i++)
		{
			
			 count = 1;
			
			for(int j=i+1; j<ch.length; j++)
			{
				if(ch[i]==ch[j] && ch[i]!=' ') //checking between two alphabet and should not be null
				{
					count++;
					ch[j]='0';	//initializing to zero
				}
			}
			if(count>1 && ch[i] !='0') //count is greater then 1 and not equal to zero
				System.out.print(ch[i]);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
