package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.testng.annotations.Test;

import programpractice.HashSet;

public class ArrayListLearning {

	@Test
	public void arrayList() {

		// create data
		ArrayList<Integer> arlist = new ArrayList<Integer>();
		arlist.add(10);
		arlist.add(-25);
		arlist.add(78);
		arlist.add(7);
		arlist.add(90);

		// read data

		System.out.println(arlist.get(0));
		System.out.println(arlist.get(1));
		System.out.println(arlist.get(2));
		System.out.println(arlist.get(3));
		System.out.println(arlist.get(4));
		
		ArrayList<String> strlist = new ArrayList<String>();

		strlist.add("Tamil");
		strlist.add("kannada");
		strlist.add("malayalam");
		strlist.add("Hindi");
		strlist.add("Telugu");

		// modify

		arlist.set(0, 50);
		arlist.set(1, 990);
		arlist.set(2, 250);
		arlist.set(3, 650);
		arlist.set(4, 950);

		System.out.println(arlist);

		arlist.sort(null);

		System.out.println(arlist);

		// delete the data
		System.out.println("remove the elements");
		arlist.remove(0);
		arlist.remove(2);

		System.out.println(arlist);

		// check for the presense of the data inside an array list

		System.out.println(arlist.contains(250));

		System.out.println(arlist);

		
		// check for the index of the element inside an array list
		System.out.println("the index of the element is");
		arlist.indexOf(arlist);

		System.out.println(arlist.indexOf(250));
		System.out.println(arlist.indexOf(650));

		// check for arraylist is empty
		
		arlist.isEmpty();
		System.out.println("array list is empty or not");
		System.out.println(arlist.isEmpty());
		
		// remove elements in array

		arlist.removeAll(arlist);

		
		System.out.println(arlist);
		
		
		
		//Iterating the aaraylist using for-each loop
		//break terminates the loop
		//continue skips the particular index value
		for(String s : strlist )
		{
			if(s.contentEquals("malayalam")) {
				System.out.println("Skipping the word malayalam");
				continue;
			}
			System.out.println(s);
		}
		
		
		
		//Iterating the aaraylist using for-each loop
		for(String s : strlist )
		{
			
			System.out.println(s);
			
			
		}
		
		
		//UsingIterator
		
		Iterator itr = strlist.iterator();
		System.out.println("iterator");
		
		for(int i =0; i<strlist.size();i++) {
			System.out.println(strlist.get(i));
		}
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}



	}
	/*
	 * 
	 * // delete the data
	 * 
	 * arlist.remove(0); arlist.remove(1); arlist.remove(4);
	 * 
	 * System.out.println(arlist.get(2)); System.out.println(arlist.get(3));
	 * 
	 * // check for the presense of the data inside an array list
	 * 
	 * System.out.println(arlist.contains(250));
	 * 
	 * //arlist.removeAll(arlist);
	 * 
	 * // sort the array
	 * 
	 * 
	 * 
	 * System.out.println(arlist.get(0));
	 */
}

/*
 * BREAK&
 * 
 * CONTINUE AND ITERATOR package collections.learning; import
 * java.util.ArrayList; import java.util.Iterator; import
 * org.testng.annotations.Test;
 * 
 * public class CollectionsLearning {
 * 
 * /* CRUD Operations
 *
 * Create > add() Read > get() Update > set() Delete > remove()
 *
 *
 */

/*
 * public void arrayList() { // int a =20; // Integer b = 200; // char c ='A';
 * // Character d ='A';
 * 
 * // Collection <-- extends -- List <-----implements <--ArrayList
 * 
 * ArrayList<Integer> arlist = new ArrayList<Integer>(); arlist.add(1);
 * arlist.add(1000); arlist.add(100); arlist.add(10000); arlist.add(19);
 * ArrayList<String> strlist = new ArrayList<String>(); strlist.add("Tamil");
 * strlist.add("kannada"); strlist.add("malayalam"); strlist.add("Hindi");
 * strlist.add("Telugu");
 * 
 * // Read Data from the ArrayList
 * 
 * // System.out.println(strlist.get(1)); // System.out.println(arlist.get(2));
 * // // Modify the existing data strlist.set(1, "English"); arlist.set(2, 675);
 * // delete the existing data
 * 
 * strlist.remove(1); arlist.remove(2); // arlist.removeAll(arlist);
 * System.out.println(arlist); arlist.sort(null);
 * 
 * System.out.println(arlist);
 * 
 * // check for the presense of the data inside an array list
 * 
 * System.out.println(arlist.contains(76));
 * 
 * // System.out.println(strlist.get(1)); // System.out.println(arlist.get(2));
 * 
 * // size() // sort() // contains() // indexOf() // isEmpty()
 * 
 * // Iterating the aaraylist using for-each loop // break terminates the loop
 * // continue skips the particular index value for (String s : strlist) { if
 * (s.contentEquals("malayalam")) {
 * System.out.println("Skipping the word malayalam"); continue; }
 * System.out.println(s); }
 * 
 * // UsingIterator
 * 
 * Iterator itr = strlist.iterator(); System.out.println("iterator"); while
 * (itr.hasNext())
 * 
 * System.out.println(itr.next());
 * 
 * }
 * 
  @Test
 
  public void hashSetLearning() {
  
  }
  
 * @Test
 * 
 * public void hashMapLearning() {
 * 
 * }}
 * 
 * Linked list and SET
 * 
 * for( int i = 0;i<strlist.size();i++) { System.out.println(strlist.get(i));
 * }while(itr.hasNext()) { System.out.println(itr.next()); } List<String> l =
 * new LinkedList<String>();System.out.println("Linked list"); List<String> s =
 * new
 * LinkedList<String>();s.add("chennai");s.add("banglore");s.add("NCR");s.add(
 * "gurgaon");s.add("noida");s.add("chennai");s.add("banglore");s.add("NCR");
 * 
 * System.out.println(s);
 * 
 * }
 */
  @Test
 
  public void hashSetLearning() { 
	  
	  Set<String> s = new HashSet <String>();
  s.add("chennai"); s.add("banglore"); s.add("NCR"); s.add("gurgaon");
  s.add("noida"); s.add("chennai"); s.add("banglore"); s.add("NCR");
  
  System.out.println(s);
  
  
  }}
 /* 
 * @Test
 * 
 * public void treeSetLearning() { Set<String> s = new TreeSet<String>();
 * s.add("chennai"); s.add("banglore"); s.add("ncr"); s.add("gurgaon");
 * s.add("noida"); s.add("chennai"); s.add("banglore"); s.add("ncr");
 * 
 * System.out.println(s);
 * 
 **/