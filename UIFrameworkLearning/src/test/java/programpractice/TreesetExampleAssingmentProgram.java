package programpractice;
import java.util.Iterator;
import java.util.TreeSet;

import org.testng.annotations.Test;

public class TreesetExampleAssingmentProgram{

	@Test
	public void tc1() {

		// 1. Write a Java program to create a new tree set, add some colors (string)
		// and print out the tree set.
		try {
			// Create an empty Tree set
			TreeSet<String> colors = new TreeSet<String>();

			// use add() method to add values in the Tree set
			colors.add("White");
			colors.add("Black");
			colors.add("Yellow");
			colors.add("Blue");
			colors.add("Black");
			colors.add("Pink");

			System.out.println("Elements in the Tree set :");
			System.out.println(colors);
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	@Test
	public void tc2() {

		// 2. Write a Java program to iterate through all elements in a tree set.
		try {
			// Create an empty Tree set
			TreeSet<String> colors = new TreeSet<String>();

			// use add() method to add values in the Tree set
			colors.add("White");
			colors.add("Black");
			colors.add("Yellow");
			colors.add("Blue");
			colors.add("Black");
			colors.add("Pink");

			System.out.println("Elements in Tree Set :");
			System.out.println(colors);
			System.out.println();

			System.out.println("Iteration Using For Each loop :");
			// iterating using for each loop
			for (String color : colors) {
				System.out.println(color);
			}
			System.out.println();

			// iterating using iterator
			System.out.println("Iteration Using  Iterator :");
			Iterator<String> itr = colors.iterator();
			while (itr.hasNext()) {
				System.out.println(itr.next());
			}

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	@Test
	public void tc3() {

		// 3. Write a Java program to add all the elements of a specified tree set to
		// another tree set.
		try {
			// Create an empty Tree set
			TreeSet<String> colors = new TreeSet<String>();

			// use add() method to add values in the Tree set
			colors.add("White");
			colors.add("Black");
			colors.add("Yellow");
			colors.add("Blue");
			colors.add("Black");
			colors.add("Pink");

			System.out.println("Elements in Tree Set :");
			System.out.println(colors);
			System.out.println();

			// Create an another Tree set to add all the elements
			TreeSet<String> colors1 = new TreeSet<String>();
			colors1.addAll(colors);

			System.out.println("After Add all the Elements one Tree Set to another Tree Set using addAll() :");
			System.out.println(colors1);
			System.out.println();

			// Verification
			if (colors1.equals(colors)) {
				System.out.println("All elements added successfully");
			} else
				System.out.println("All Elements added not successfully");
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	@Test
	public void tc4() {

		// 4. Write a Java program to create a reverse order view of the elements
		// contained in a given tree set.
		try {
			// Create an empty Tree Set
			TreeSet<Integer> n = new TreeSet<Integer>();

			// use add() method to add values in the Tree set
			n.add(10);
			n.add(20);
			n.add(30);
			n.add(40);
			n.add(50);
			System.out.println("Original Elements in Tree Set :");
			System.out.println(n);
			System.out.println();

			// Using descendingIterator() for Create a Reverse order view
			System.out.println("Reverse order using DecendingIterator :");
			Iterator<Integer> itr = n.descendingIterator();

			while (itr.hasNext()) {
				System.out.println(itr.next());
			}
			System.out.println();

			// Using for loop for Create a Reverse order view
			System.out.println("Reverse Order Using for loop :");
			Object[] no = n.toArray();

			for (int i = no.length - 1; i >= 0; i--) {
				System.out.println(no[i]);
			}
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	@Test
	public void tc5() {

		// 5. Write a Java program to get the first and last elements in a tree set.
		try {
			// Create an empty Tree set
			TreeSet<String> colors = new TreeSet<String>();

			// use add() method to add values in the Tree set
			colors.add("White");
			colors.add("Black");
			colors.add("Yellow");
			colors.add("Blue");
			colors.add("Black");
			colors.add("Pink");

			System.out.println("Original Tree Set :");
			System.out.println(colors);
			System.out.println();

			System.out.println("First element in Tree set is :");
			System.out.println(colors.first());
			System.out.println();

			System.out.println("Last element in Tree set is :");
			System.out.println(colors.last());
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	@SuppressWarnings("unchecked")
	@Test
	public void tc6() {

		// 6. Write a Java program to clone a tree set to another tree set.
		try {
			// Create an empty Tree set
			TreeSet<String> colors = new TreeSet<String>();

			// use add() method to add values in the Tree set
			colors.add("White");
			colors.add("Black");
			colors.add("Yellow");
			colors.add("Blue");
			colors.add("Black");
			colors.add("Pink");

			System.out.println("Original Tree Set :");
			System.out.println(colors);
			System.out.println();

			// Create an another empty Tree set for cloning
			TreeSet<String> colors1 = new TreeSet<String>();
			System.out.println("Colors1 treeset-->"+colors1);

			colors1 = (TreeSet<String>) colors.clone();
			System.out.println("Cloned Tree Set :");
			System.out.println(colors1);
			System.out.println();
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	@Test
	public void tc7() {

		// 7. Write a Java program to get the number of elements in a tree set.

		try {
			// Create an empty Tree set
			TreeSet<String> colors = new TreeSet<String>();

			// use add() method to add values in the Tree set
			colors.add("White");
			colors.add("Black");
			colors.add("Yellow");
			colors.add("Blue");
			colors.add("Black");
			colors.add("Pink");

			System.out.println("Original Tree Set :");
			System.out.println(colors);
			System.out.println();
			System.out.println("No of Elements in Tree Set :" + colors.size());
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	@Test
	public void tc8() {

		// 8. Write a Java program to compare two tree sets.

		try {
			// Create an empty Tree set
			TreeSet<String> colors = new TreeSet<String>();

			// use add() method to add values in the Tree set
			colors.add("White");
			colors.add("Black");
			colors.add("Yellow");
			colors.add("Blue");
			colors.add("Black");
			colors.add("Pink");

			System.out.println("Original Tree Set 1:");
			System.out.println(colors);
			System.out.println();

			// Create an another empty Tree set for comparing
			TreeSet<String> colors1 = new TreeSet<String>();

			// use add() method to add values in the Tree set
			colors1.add("White");
			colors1.add("Black");
			colors1.add("Yellow");
			colors1.add("Gray");
			colors1.add("Black");
			colors1.add("Pink");

			System.out.println("Original Tree Set 2:");
			System.out.println(colors1);
			System.out.println();

			// using foreach loop for comparing
			System.out.println("Compare Two Tree set : ");
			for (String e : colors1) {
				// using tenary operator---> ? "Yes" : "No"
				System.out.println(colors.contains(e) ? "Yes" : "No");
			}
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	@Test
	public void tc9() {

		// 9. Write a Java program to find the numbers less than 7 in a tree set.

		try {
			// Create an empty Tree set
			TreeSet<Integer> n = new TreeSet<Integer>();

			// use add() method to add values in the Tree set
			n.add(1);
			n.add(10);
			n.add(4);
			n.add(8);
			n.add(12);
			n.add(5);
			n.add(2);
			n.add(9);
			n.add(6);
			n.add(11);

			System.out.println("Original Tree Set :");
			System.out.println(n);
			System.out.println();

			// Find numbers less than 7
			TreeSet<Integer> n1 = new TreeSet<Integer>();

			n1 = (TreeSet<Integer>) n.headSet(7);
			
			System.out.println(n1);

			// create an iterator
			Iterator itr = n1.iterator();

			// Displaying the tree set data
			System.out.println("Less then 7 Tree set data: ");

			while (itr.hasNext())
				System.out.println(itr.next());

			// print less then 7 data reverse Order
			System.out.println("Less then 7 Tree set data reverse order: ");
			Iterator itrr = n1.descendingIterator();

			while (itrr.hasNext())
				System.out.println(itrr.next());

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	@Test
	public void tc10() {

		// 10. Write a Java program to get the element in a tree set which is greater
		// than or equal to the given element.

		try {
			// Create an empty Tree set
			TreeSet<Integer> n = new TreeSet<Integer>();

			// use add() method to add values in the Tree set
			n.add(12);
			n.add(24);
			n.add(36);
			n.add(48);
			n.add(55);
			n.add(63);
			n.add(77);
			n.add(82);
			n.add(99);
			n.add(100);

			System.out.println("Original Tree Set : ");
			System.out.println(n);
			System.out.println();

			// first preference is equal then goes to greater then
			System.out.println("Greater then or equal to the given number 100 :");
			System.out.println(n.ceiling(100));
			System.out.println("Greater then or equal to the given number 50 :");
			System.out.println(n.ceiling(50));
			System.out.println("Greater then or equal to the given number 10 :");
			System.out.println(n.ceiling(10));
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	@Test
	public void tc11() {

		// 11. Write a Java program to get the element in a tree set which is less than
		// or equal to the given element.

		try {
			// Create an empty Tree set
			TreeSet<Integer> n = new TreeSet<Integer>();

			// use add() method to add values in the Tree set
			n.add(12);
			n.add(24);
			n.add(36);
			n.add(48);
			n.add(55);
			n.add(63);
			n.add(77);
			n.add(82);
			n.add(99);
			n.add(100);

			System.out.println("Original Tree Set : ");
			System.out.println(n);
			System.out.println();

			// first preference is equal then goes to Less then
			System.out.println("Less then or equal to the given number 80 :");
			System.out.println(n.floor(80));
			System.out.println("Less then or equal to the given number 55 :");
			System.out.println(n.floor(55));
			System.out.println("Less then or equal to the given number 20 :");
			System.out.println(n.floor(20));
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	@Test
	public void tc12() {

		// 12. Write a Java program to get the element in a tree set which is strictly
		// greater than to the given element.

		try {
			// Create an empty Tree set
			TreeSet<Integer> n = new TreeSet<Integer>();

			// use add() method to add values in the Tree set
			n.add(12);
			n.add(24);
			n.add(36);
			n.add(48);
			n.add(55);
			n.add(63);
			n.add(77);
			n.add(82);
			n.add(99);
			n.add(100);

			System.out.println("Original Tree Set : ");
			System.out.println(n);
			System.out.println();

			System.out.println("Greater then the given number 100 :");
			System.out.println(n.higher(100));
			System.out.println("Greater then the given number 50 :");
			System.out.println(n.higher(50));
			System.out.println("Greater then the given number 12 :");
			System.out.println(n.higher(12));
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	@Test
	public void tc13() {

		// 13. Write a Java program to get an element in a tree set which is strictly
		// less than the given element.

		try {
			// Create an empty Tree set
			TreeSet<Integer> n = new TreeSet<Integer>();

			// use add() method to add values in the Tree set
			n.add(12);
			n.add(24);
			n.add(36);
			n.add(48);
			n.add(55);
			n.add(63);
			n.add(77);
			n.add(82);
			n.add(99);
			n.add(100);

			System.out.println("Original Tree Set : ");
			System.out.println(n);
			System.out.println();

			System.out.println("Less then the given number 24 :");
			System.out.println(n.lower(24));
			System.out.println("Less then the given number 55 :");
			System.out.println(n.lower(55));
			System.out.println("Less then the given number 100 :");
			System.out.println(n.lower(100));
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	@Test
	public void tc14() {

		// 14. Write a Java program to retrieve and remove the first element of a tree
		// set.
		try {
			// Create an empty Tree set
			TreeSet<String> colors = new TreeSet<String>();

			// use add() method to add values in the Tree set
			colors.add("White");
			colors.add("Black");
			colors.add("Yellow");
			colors.add("Blue");
			colors.add("Black");
			colors.add("Pink");

			System.out.println("Original Tree Set :");
			System.out.println(colors);
			System.out.println();

			// retrieve and remove first element using pollFirst()
			System.out.println("After polling the First element: ");
			System.out.println(colors.pollFirst());
			System.out.println(colors);
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	@Test
	public void tc15() {

		// 15. Write a Java program to retrieve and remove the last element of a tree
		// set.
		try {
			// Create an empty Tree set
			TreeSet<String> colors = new TreeSet<String>();

			// use add() method to add values in the Tree set
			colors.add("White");
			colors.add("Black");
			colors.add("Yellow");
			colors.add("Blue");
			colors.add("Black");
			colors.add("Pink");

			System.out.println("Original Tree Set :");
			System.out.println(colors);
			System.out.println();

			// retrieve and remove last element using pollLast()
			System.out.println("After polling the last element: ");
			System.out.println(colors.pollLast());
			System.out.println(colors);
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	@Test
	public void tc16() {

		// 16. Write a Java program to remove a given element from a tree set.

		try {
			// Create an empty Tree set
			TreeSet<String> colors = new TreeSet<String>();

			// use add() method to add values in the Tree set
			colors.add("White");
			colors.add("Black");
			colors.add("Yellow");
			colors.add("Blue");
			colors.add("Black");
			colors.add("Pink");

			System.out.println("Original Tree Set :");
			System.out.println(colors);
			System.out.println();

			System.out.println("After remove given Element :");
			colors.remove("Blue");
			colors.remove("Gray");
			colors.remove(null);
			System.out.println(colors);
			System.out.println();
		} catch (Exception e) {

			e.printStackTrace();
		}

	}
 

}
