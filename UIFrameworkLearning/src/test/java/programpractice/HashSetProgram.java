package programpractice;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class HashSetProgram {
	
	@Test
	public void tc1() {

		// 1.Write a Java program to append the specified element to the end of a hash set
        //what are the things learn newly:
		//diff b/w set and list
		//clear method
		//ternary operator
		try {
			Set<String> colours = new HashSet<String>();

			colours.add("White");
			colours.add("Black");
			colours.add("Blue");
			colours.add("Pink");
			colours.add("Gray");
			colours.add("White");

			System.out.println("In Set Interface, duplicate values are not allowed. so white print only one time");
			System.out.println();
			System.out.println("Before Appending the element :");
			System.out.println(colours);
			System.out.println();

			colours.add("Orange");

			System.out.println("After Appending the element :");
			System.out.println(colours);
		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}

	@Test
	public void tc2() {

		// Write a Java program to iterate through all elements in a hash set

		try {
			Set<String> colours = new HashSet<String>();

			colours.add("White");
			colours.add("Black");
			colours.add("Blue");
			colours.add("Pink");
			colours.add("Gray");
			colours.add("White");
			System.out.println(colours);

			
			  //Iterating using iterator
			  
			  Iterator<String> itr = colours.iterator();
			  
			  System.out.println();
			  
			  System.out.println("Itrating The Elements are :");
			  while (itr.hasNext()) {
			  
			  System.out.println(itr.next());
			  
			  }
			 

			// Iterating using for each loop
			for (String colour : colours) {

				System.out.println(colour);

			}
		} catch (Exception e) {
		
			e.printStackTrace();
		}

	}

	@Test
	public void tc3() {

		// Write a Java program to get the number of elements in a hash set

		Set<String> colours = new HashSet<String>();

		try {
			colours.add("White");
			colours.add("Black");
			colours.add("Blue");
			colours.add("Pink");
			colours.add("Gray");
			colours.add("White");

			System.out.println(colours);
			System.out.println("No of element in a hash set");
			colours.size();
			System.out.println(colours.size());
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	@Test
	public void tc4() {

		// Write a Java program to empty an hash set

		try {
			Set<String> colours = new HashSet<String>();

			colours.add("White");
			colours.add("Black");
			colours.add("Blue");
			colours.add("Pink");
			colours.add("Gray");
			colours.add("White");

			System.out.println("Original hash set :" + colours);
			System.out.println("Size of the hash set :" + colours.size());
			//colours.removeAll(colours);
			System.out.println(colours.removeAll(colours));

			System.out.println("Hash set After removing all element :" + colours);
			System.out.println("Size of the hash set after removing the elements : " + colours.size());
		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}

	@Test
	public void tc5() {

		// Write a Java program to test a hash set is empty or not

		try {
			Set<String> colours = new HashSet<String>();
			// colours.add("Black");

			if (colours.isEmpty()) {
				System.out.println("Hash Set is empty");
			} else
				System.out.println("Hash set is not empty");

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	@Test
	public void tc6() {

		// Write a Java program to clone a hash set to another hash set

		try {
			HashSet<String> colours1 = new HashSet<String>();

			colours1.add("White");
			colours1.add("Black");
			colours1.add("Blue");
			colours1.add("Pink");
			colours1.add("Gray");
			colours1.add("White");

			System.out.println("Original Hashset ");
			System.out.println(colours1);
			System.out.println();

			
			HashSet<String> colours2 = new HashSet<String>();
			colours2 = (HashSet<String>) colours1.clone();
			//colours2 = (HashSet<String>) colours1.clone();
			System.out.println("Cloned HashSet :");
			System.out.println(colours2);

			// if we create like this--> Set<String> colours1 = new HashSet<String>();
			// we wrote like this ---> colours2 = (Set<String>) ((HashSet) colours1.clone();
			// colours1).clone();
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	@Test
	public void tc7() {

		// Write a Java program to convert a hash set to an array

		try {
			// Create a empty hash set
			Set<String> colours = new HashSet<String>();

			// use add() method to add values in the hash set
			colours.add("White");
			colours.add("Black");
			colours.add("Blue");
			colours.add("Pink");
			colours.add("Gray");
			colours.add("White");
			System.out.println("Original Hash Set: ");
			System.out.println(colours);
			System.out.println();

			// Creating an Array and pass the hashset size
			String[] array = new String[colours.size()];
			colours.toArray(array);

			// Displaying Array elements
			System.out.println("Array elements: ");

			for (String e : array) {
				System.out.println(e);
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}

	@Test
	public void tc8() {

		// Write a Java program to convert a hash set to a tree set

		try {
			// Create a empty hash set
			Set<String> colours = new HashSet<String>();

			// use add() method to add values in the hash set
			colours.add("White");
			colours.add("Black");
			colours.add("Blue");
			colours.add("Pink");
			colours.add("Gray");
			colours.add("White");

			System.out.println("Original Hash Set: ");
			System.out.println(colours);
			System.out.println();

			// Creat a TreeSet and pass the hashset variable for convert a hash set to a
			// tree set
			Set<String> colours1 = new TreeSet<String>(colours);

			// Display TreeSet elements
			System.out.println("Tree Set: ");
			System.out.println(colours1);
			System.out.println();

			System.out.println("TreeSet elements: ");
			for (String e : colours1) {
				System.out.println(e);
			}
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	@Test
	public void tc9() {

		// Write a Java program to convert a hash set to a List/ArrayList

		try {
			// Create a empty hash set
			Set<String> colours = new HashSet<String>();

			// use add() method to add values in the hash set
			colours.add("White");
			colours.add("Black");
			colours.add("Blue");
			colours.add("Pink");
			colours.add("Gray");
			colours.add("White");

			System.out.println("Original Hash Set: ");
			System.out.println(colours);
			System.out.println();

			// Create a ArrayList and pass the hashset variable for convert a hash set to a
			// List/ArrayList
			ArrayList<String> array = new ArrayList<String>(colours);

			System.out.println("Convert to ArrayList : ");
			System.out.println(array);
			System.out.println();

			System.out.println("ArrayList Elements are :");
			for (String e : array) {
				System.out.println(e);
			}
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	@Test
	public void tc10() {
		// Write a Java program to compare two hash set

		try {
			// Create a empty hash set
			Set<String> colours = new HashSet<String>();

			// use add() method to add values in the hash set
			colours.add("White");
			colours.add("Black");
			colours.add("Blue");
			colours.add("Pink");
			colours.add("Gray");
			colours.add("Orange");
			System.out.println("First Hash Set :");
			System.out.println(colours);

			// Create another empty hash set
			Set<String> colours1 = new HashSet<String>();

			colours1.add("White");
			colours1.add("Black");
			colours1.add("Blue");
			colours1.add("Pink");
			colours1.add("Gray");
			colours1.add("Yellow");
			System.out.println("Second Hash Set :");
			System.out.println(colours1);

			// Create another empty hash set for compare two hash set
			Set<String> colours2 = new HashSet<String>();

			System.out.println("Compare two HashSet :");
			for (String e : colours) {

				// tenary operator---> ? "Yes" : "No"
				// colours2.add(colours1.contains(e) ? "Yes" : "No");
				System.out.println(colours1.contains(e) ? "Yes" : "No");

			}
			// System.out.println(colours2);
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	@Test
	public void tc11() {

		// Write a Java program to compare two sets and retain elements which are same
		// on both sets

		try {
			// Create a empty hash set
			Set<String> colours = new HashSet<String>();

			// use add() method to add values in the hash set
			colours.add("White");
			colours.add("Black");
			colours.add("Blue");
			colours.add("Pink");
			colours.add("Gray");
			colours.add("Orange");
			System.out.println("First Hash Set :");
			System.out.println(colours);
			System.out.println();

			// Create another empty hash set
			Set<String> colours1 = new HashSet<String>();

			// use add() method to add values in the hash set
			colours1.add("White");
			colours1.add("Black");
			colours1.add("Blue");
			colours1.add("Pink");
			colours1.add("Gray");
			colours1.add("Yellow");
			System.out.println("Second Hash Set :");
			System.out.println(colours1);
			System.out.println();

			// Create another empty hash set for compare two hash set and store the element
			Set<String> colours2 = new HashSet<String>();

			System.out.println("Compare two HashSet and Retain elements the same elements:");
			for (String e : colours) {

				if ((colours1.contains(e) ? "Yes" : "No") == "Yes") {

					colours2.add(e);

				}
			}
			System.out.println(colours2);
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	@Test
	public void tc12() {

		// Write a Java program to remove all of the elements from a hash set

		try {
			// Create a empty hash set
			Set<String> colours = new HashSet<String>();

			// use add() method to add values in the hash set
			colours.add("White");
			colours.add("Black");
			colours.add("Blue");
			colours.add("Pink");
			colours.add("Gray");
			colours.add("Orange");

			// Create another empty hash set
			Set<String> colours1 = new HashSet<String>();

			// use add() method to add values in the hash set
			colours1.add("White");
			colours1.add("Black");
			colours1.add("Blue");
			colours1.add("Pink");
			colours1.add("Gray");
			colours1.add("Yellow");
			System.out.println("Second Hash Set :");
			System.out.println(colours1);

			System.out.println("Before Removing HashSet :");
			System.out.println(colours);

			System.out.println("After Removing HashSet :");
			// We can use removeAll or clear method to remove all of the element

			// colours1.removeAll(colours);
			colours.removeAll(colours1);
			// colours.clear();
			System.out.println(colours);
		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}

}
