import java.util.ArrayList;
import java.util.HashMap;
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
		
		//do this twice to create duplicates
		for(int i = 0; i < 10; i++) {
			jack.add(i);
		}
		
		for(int i = 0; i < 10; i++) {
			jack.add(i);
		}
		
		//user set to identify unique elements
		Set<Integer> jackSet;
		
		//hashmap
		HashMap<Integer, String> jackHash = new HashMap<Integer, String>();
		//populate hashmap
		String[] myNames = {"Jack", "Brent", "Ethan", "Levi"};
		int k = 1;
		for(String s : myNames) {
			jackHash.put(k, s);
			k++;
		}
		
		//treemap
		TreeMap<Integer, String> jackTree = new TreeMap<Integer, String>();
		//populate treemap
		k = 1;
		for(String s : myNames) {
			jackTree.put(k, s);
			k++;
		}
		
		//now we have idenitical hashmap and treemap.
		
		//lets try to print them
		
		//remember the order names were added:
		System.out.println("This is the original order:");
		k = 1;
		for(String s : myNames) {
			System.out.println(k + ". " + s);
			k++;
		}
		
		System.out.println("Here is the hashmap:");
		System.out.println(jackHash.values());
		
		System.out.println("Here is the treemap:");
		System.out.println(jackTree.values());
		
	}


	
}
