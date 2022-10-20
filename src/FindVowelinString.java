
public class FindVowelinString {

	public static void main(String[] args) {
		
		 String str = new String("Mainuddin");
		 int j=0;
		 
		 
				    for(int i=0; i<str.length(); i++)
					{
				    	//System.out.println(str.substring(i));
					   if(str.charAt(i) == 'a'|| str.charAt(i) == 'e'|| str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') 
					   {
						   	System.out.println("Given string contains "+str.charAt(i)+" at the index "+i);
						    
						    j++;
						    
						    
					   }
					  
	
					
					
					
					
					
					
					}
	
				
		//		    System.out.println("Given String contains vowels are    "+ j);
	}
}