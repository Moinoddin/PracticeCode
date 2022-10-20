

public class CountWords {

	public static void main(String[] args) {

		int count;
		int repeated=0;
		String paragraph = "Designed and developed data driven framework using Selenium web driver, TestNG & Maven. Worked on BDD framework. Worked on Jenkins for script scheduling. Responsible for Framework enhancement. Responsible for creating the Test Estimation, Test Summary Report, providing status in daily team meeting.";
		//		if (paragraph == null || paragraph.isEmpty())
		//		{ System.out.println("Given String is Null"); } 

		String[] stringPara = paragraph.split("\\s+"); 
		System.out.println("Count the number of words in the Paragraph is: "+stringPara.length);


		System.out.println("--------------------------------------------------------------------");

		for(int i = 0; i < stringPara.length; i++) {  
			count = 1;  
			for(int j = i+1; j < stringPara.length; j++) {  
				if(stringPara[i].equals(stringPara[j])) {  
					count++;  

					stringPara[j] = "0";  
				}  

			}  

			if(count == 1 && stringPara[i] != " ")


			{  System.out.println(" All the unique words in sorted order: "+ stringPara[i]); }
			
			else if(count > 1 && stringPara[i] != "0")  
			{  
				repeated++;
				System.out.print(" duplicate words with their number of occurrences in the paragraph is : "+ stringPara[i] );  

			}
			
			



		}
		
		
		System.out.println("--------------------------------------------------------------------");
		
		System.out.println("Duplicate words number of occurrences is: "+ repeated );

	}
}












