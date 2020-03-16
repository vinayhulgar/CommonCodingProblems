import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashTableDemo {
	public static void main(String[] args) {
		Hashtable<Integer, String> h = new Hashtable<>();
		Hashtable<Integer, String> h1 = new Hashtable<>();
		h.put(3,"Hello");
		h.put(2, "World");
		h.put(1, "isBest");
		// Create a clone
		h1 = (Hashtable<Integer, String>) h.clone();
		System.out.println("Values in clone are:"+h1);
		//h.clear();
		//System.out.println("After clearing:"+h);
		if(h1.contains("Hello")){
			System.out.println("Value found in table");
		}
		if(h1.containsValue("isBest")){
			System.out.println("Value found");
		}
		Enumeration<String> e = h1.elements();
		System.out.println("Display values");
		while(e.hasMoreElements()){
			System.out.println(e.nextElement());
		}
		
		Set s = h1.entrySet();
		System.out.println("Set entries"+s);
		
		Set s1 = h1.keySet();
		System.out.println("Set Key entries"+s1);
		
		if(h.equals(h1)){
			System.out.println("Both are equal");
		}
		if(!h.isEmpty())
		System.out.println(h.get(3));
	}
}
