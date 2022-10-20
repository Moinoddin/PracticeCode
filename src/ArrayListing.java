import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListing
{

	public static void main(String[] args) 
	{
		
		ArrayList list = new ArrayList();
		LinkedList i=new LinkedList();
		
		
		list.add("yuii");
		list.add("dfdfd");
		list.add(999);
		list.add(786);
		list.set(2, "element");
		
		list.clear();
		System.out.println(list.contains(786));
		
		System.out.println(list);
		  
		 
		
		
	}

	
		
}


