
public class CheckPalindrome {

	public static void main(String[] args) {
		
		
		//Given String whether Palidrome is or Not check
		
		/*String s1 = "madam";
		String s2 = "";
		
		for(int i=s1.length()-1; i>=0; i--)
		{
			s2 += s1.charAt(i);
		}
		
		if(s1.equals(s2))
			System.out.println("String is a Palindrome");
		else
			System.out.println("String is Not a Palindrome");
		
		*/
		
		int r, m = 656, s=0, t;
		
		t=m;
		
		while(m>0)
		{
			r = m % 10;
			s= (s*10)+r;
			m=m/10;
			
			System.out.println(m);
		}
		
		if(t == s)
			System.out.println("Given Number is Palindrome");
		else
			System.out.println("Given number is Not Palindrome");
		

	}

}
