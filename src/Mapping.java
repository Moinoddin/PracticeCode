import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Mapping {

	public static void main(String[] args) {
		
		HashMap<String,String> hash = new HashMap<String,String>();
		
		hash.put("Name","Mainu");
		hash.put("last","Khan");
		hash.put("Age","30");
		hash.put("cell","928374656");
		
		//System.out.println(hash.entrySet());
		//System.out.println(hash.get("Name"));
		//System.out.println(hash.containsKey("Age"));
		//System.out.println(hash.size());
		//System.out.println(hash.containsValue(30));
		//System.out.println(hash.getOrDefault("cell", 2));
		//System.out.println(hash.keySet());
		//System.out.println(hash.values());
		//System.out.println(hash.remove("Age"));
		//System.out.println(hash.hashCode());
		//hash.clear();
		//System.out.println(hash.isEmpty());
	/*	System.out.println(hash.replace("cell", "928374656", "0987654321"));
		System.out.println(hash.entrySet());
		
		for(Object i: hash.entrySet())
		{
			System.out.println(i);
		}
		
		for(Object i: hash.values())
		{
			System.out.println(i);
		}
		
		
		for(Map.Entry i:hash.entrySet())
		{
			System.out.println(i.getKey()+"  "+i.getValue());
		}
		*/
		
		Set s = hash.entrySet();
		
		Iterator itr = s.iterator();
		
		while(itr.hasNext())
		{
			Map.Entry entry = (Entry)itr.next();
			System.out.println(entry.getKey()+"     "+entry.getValue());
			
		}
		
		
		
		
		
		
		
	}

}
