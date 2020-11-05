import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

public class Driver {
	
	//this is the participation for C S 2334 
	//november 4 2020
	
	//coded in nano
	/* data structure decides whether data will be in a linkedlist
	 * or in an arraylist. Memory management?
	 */

	/*Collection:
	 *A group of objects of similar types.
	 *Typically contains add(), remove(), and contains() methods
	 */

	/*Collections to Know:
	 *AbstractList
	 *AbstractQueue
     *ArrayDeque
	 *ArrayList
	 *EnumSet
	 *HashSet
	 *LinkedList
	 *Stack
	 *TreeSet
	 *Vector?
	 */
	
	public static void main(String[] args) {
		
		
		//create a list type and add
		List<Integer> jack = new ArrayList<Integer>();
		
		System.out.print("Adding to list [jack]: ");
		//do this twice to create duplicates
		for(int i = 0; i < 10; i++) {
			System.out.print(i + " ");
			jack.add(i);
		}
		
		for(int i = 0; i < 10; i++) {
			System.out.print(i + " ");
			jack.add(i);
		}
		
		System.out.println("\n\nDone. Notice there are two of each integer in the ArrayList jack now.");
		
		
		
		//user set to identify unique elements
		
		System.out.println("\nUsing a set, we can identify unique values, if we try to add all elements from the ArrayList.");
		HashSet<Integer> jackSet = new HashSet<Integer>();
		for(int i = 0; i < jack.size(); i++) {
			jackSet.add(jack.get(i));
		}
		
		System.out.println(jackSet);
		
		System.out.println("This is a unique feature of Sets");
		
		//hashmap
		HashMap<String, String> jackHash = new HashMap<String, String>();
		//populate hashmap
		String[] myNames = {"Jack", "Brent", "Ethan", "Levi"};
		for(String s : myNames) {
			jackHash.put(s, "Person");
		}
		
		//treemap
		TreeMap<String, String> jackTree = new TreeMap<String, String>();
		//populate treemap
		for(String s : myNames) {
			jackTree.put(s, "Person");
		}
		
		//now we have idenitical hashmap and treemap.
		
		//lets try to print them
		
		//remember the order names were added:
		System.out.println("\nThis is the original order:");
		for(String s : myNames) {
			System.out.println(s);
		}
		
		System.out.println("\nHere is the hashmap:");
		for(String h : jackHash.keySet()) {
			System.out.println(h);
		}
		
		
		System.out.println("\nHere is the treemap:");
		for(String t : jackTree.keySet()) {
			System.out.println(t);
		}
		
		System.out.println("\nNow, add another name to both collections");
		
		jackTree.put("Carter", "Person");
		jackHash.put("Carter", "Person");
		
		System.out.println("\nHas the order changed?");
		System.out.println("\nHere is the hashmap:");
		for(String h : jackHash.keySet()) {
			System.out.println(h);
		}
		
		
		System.out.println("\nHere is the treemap:");
		for(String t : jackTree.keySet()) {
			System.out.println(t);
		}
		
		
		System.out.println("\nTo guarantee (some type of order), use a TreeSet");
		System.out.println("Notice how it is in alphabetical order.");
		
	}


	
}
