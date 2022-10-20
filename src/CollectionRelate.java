import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Set;

public class CollectionRelate {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> ar = new ArrayList<Integer>();
		
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		
		ar.add(2);
		ar.add(3);
		ar.add(4);
		ar.add(5);
		ar.add(5);
		ar.add(2);
		
		System.out.println("ArrayList of element is :" +ar);
		
		System.out.println("-----------------------------------------------------------------------");
		
		HashSet<Integer> ft = new HashSet<Integer>();
	
		ft.add(2);
		ft.add(5);
		ft.add(2);
		
		System.out.println("HashSet of element is :" +ft);
				
		System.out.println("-----------------------------------------------------------------------");
		
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		pq.add(2);
		pq.add(2);
		pq.add(3);
		
		System.out.println("PriorityQueue of element is :" +pq);
		
		System.out.println("-----------------------------------------------------------------------");
		
		
		System.out.println(ar.contains(10));
		ar1.addAll(ar);
		
		System.out.println(ar1);
		
		ar1.clear();
		
		System.out.println(ar1);
		
		System.out.println(ar.clone());
		
		System.out.println(ar.containsAll(ar1));
		
		System.out.println("========================================================================");
		
		
		
		
//		ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,5,6,7,8,9,3));
//		
//		HashSet<Integer> ck = new HashSet<Integer>();
//		HashSet<Integer> tgt = new HashSet<Integer>();
//		
//		for(Integer i: arr)
//		{
//			if(!ck.add(i))
//			tgt.add(i);
//		}
//		System.out.println(tgt);
//		
//		System.out.println("========================================================================");
//		
//		ArrayList<String> st = new ArrayList<String>(Arrays.asList("mainuddin","Sarwad","nisar","yakub","jaan","nisar"));
//		
//		
//		HashSet<String> schk = new HashSet<String>();
//		HashSet<String> tchk = new HashSet<String>();
//		
//		for(String str: st)
//		{
//			if(!schk.add(str))
//			tchk.add(str);
//		}
//		
//		System.out.println(tchk);
//		
//		System.out.println("========================================================================");
//		
//		
//		Iterator<String> spt = st.iterator();
//		
//		while(spt.hasNext())
//		{
//			System.out.println(spt.next());
//		}
//		
//		System.out.println("------------------------Itration Taken----------------------------------");
//		
//		for(String chup: st)
//		{
//			System.out.println(chup);
//		}
//		
//		System.out.println("------------------------For Each Taken----------------------------------");

	}

}
