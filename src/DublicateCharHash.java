import java.util.HashSet;

public class DublicateCharHash {

	public static void main(String[] args) {
		
		String name="Mainuddin";
		
		HashSet<Character> hashch1 = new HashSet<Character>();
		HashSet<Character> hashch2 = new HashSet<Character>();
		
		char[] ch = name.toCharArray();
		
		for(char check: ch)
		{
			if(!hashch1.add(check))
				hashch2.add(check);
		}
		System.out.println("Unique Chracter in given String is :"+hashch1+" "+"Count of Unique Character are :"+hashch1.size());
		System.out.println("Dublicate Chracter in given String is :"+hashch2+" "+"Count of Dublicate Character are :"+hashch2.size()); 
		

		System.out.println("------------------Below Code Using For loop have done Dublicate and unique Character find----------------------------------------------------------------------");
		
		String str6 = new String();
		String str7 = new String();
		char ch1 = 0;
		int count;
		int dub=0   ;
		int uni =0;
		System.out.println("Given String is : "+ name);
		for(int i=0; i<ch.length; i++)
		{
			count=1;
			for(int j=i+1; j<ch.length; j++)
			{
				if(ch[i]==ch[j] && ch[i]!='0')
				{
					count++;
					ch[j]='0';
				}
			
			}
			 if(count==1 && ch[i] != '0' )
			{
				uni++;
				ch1 = ch[i];
			    str7 +=String.valueOf(ch1); 
			    
			}
			 if(count>1 && ch[i] != '0' )
			{
				dub++;
				ch1 = ch[i];
			    str6 +=Character.toString(ch1); 
			//    System.out.println(" ");
				
			}
			
			
		}
		System.out.println("Unique Chracter in given String is :"+str7);
		System.out.println("Dublicate Chracter in given String is :"+ str6);
		System.out.println("--------------------------------------------------------------------");
		System.out.println("Dublicate Chracter counts is :"+dub);
		System.out.println("unique Chracter in given String is :"+uni);
		
	}

}
