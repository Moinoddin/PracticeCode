import java.util.HashSet;
import java.util.Set;

public class Sett {

	public static void main(String[] args) {

		HashSet<String> set = new HashSet<String>();
		
		set.add("Hello");
		set.add("Java");
		set.add("Collection");
		set.add("Set Concept");
		
	//	System.out.println(set.getClass());
	//	System.out.println(set.contains("Hello"));
		
		System.out.println(set.size());
		System.out.println(set.isEmpty());
		
		Set s = new HashSet<String>();
		
		set.iterator();
		
		for(Object i:set)
		{
			System.out.println(i);
		}
			
		
		
		
		
		//System.out.println(set);
	}

}
