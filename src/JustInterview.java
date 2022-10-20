import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class JustInterview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 5;
		System.out.println( ++i + ++i + ++i + " ---- "+ i);

		String paragraph = "Designed and developed data driven framework using Selenium web driver, TestNG & Maven. Worked on BDD framework. Worked on Jenkins for script scheduling. Responsible for Framework enhancement. Responsible for creating the Test Estimation, Test Summary Report, providing status in daily team meeting.";
		//		if (paragraph == null || paragraph.isEmpty())
		//		{ System.out.println("Given String is Null"); } 

		String[] stringPara = paragraph.split("\\s+"); 
		System.out.println("Count the number of words in the Paragraph is: "+stringPara.length);


		System.out.println("----------------------------------------------------------------------------------");

		HashSet<String> str1 = new HashSet<String>();
		HashSet<String> str2 = new HashSet<String>();
        
		for(String st : stringPara)
		{
			if(!str1.add(st)) 
			str2.add(st);
		}
		
		System.out.println("Unique words: "+ str1);
		System.out.println("Unique words: "+ str1.size());
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------");
		
		System.out.println("Duplicate words: "+ str2);
		System.out.println("Duplicate words: "+ str2.size());
		
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------");
		
		
		
		//		for(int j=0;;)
		//		{
		//		System.out.println(j);
		//		}



		//		String str = "Hello World";
		//		for(int i=0;;i++)
		//		if(i==str.length())
		//		break;
		//		else if(str.charAt(i)!=' ')
		//		System.out.print(str.charAt(i));

	}


	public static void strFunc(String str, int i)
	{
		if(i==str.length())
			return;
		else if(str.charAt(i)!=' ')
			System.out.print(str.charAt(i));
		strFunc(str,i+1);
	}

}
