package programpractice;

import java.util.Iterator;
import java.util.TreeSet;

import org.testng.annotations.Test;

public class TreeSetSuganyaPractiseProgram {

	@Test
	public void tc1() {
		//1.Write a Java program to create a new tree set, add some colors (string) and print out the tree set. 
		try {
			TreeSet<String> colours = new TreeSet<String>();
			colours.add("yellow");
			colours.add("green");
			colours.add("blue");
			colours.add("orange");
			colours.add("purple");
			
			System.out.println("The TreeSet is :" + colours);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	
	@Test
	public void tc2() {
		//2.Write a Java program to iterate through all elements in a tree set. 
		try {
			TreeSet<String> colours = new TreeSet<String>();
			colours.add("yellow");
			colours.add("green");
			colours.add("blue");
			colours.add("orange");
			colours.add("purple");
			
			System.out.println("Before iteration The TreeSet is :" + colours);
			for (String listOfColours : colours) {
				System.out.println("After the iteration The TreeSet is :"+ listOfColours);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void tc3() {
		//3.Write a Java program to add all the elements of a specified tree set to another tree set.
		
		try {
			TreeSet<String> colours = new TreeSet<String>();
			colours.add("yellow");
			colours.add("green");
			colours.add("blue");
			colours.add("orange");
			colours.add("purple");
			System.out.println("The Frist TreeSet is :" + colours);
			
			TreeSet<String> colours1 = new TreeSet<String>();
			colours1.add("megenta");
			colours1.add("violet");
			colours1.add("pink");
			colours1.add("lavender");
			colours1.add("black");
			System.out.println("The Second TreeSet is :" + colours1);
			
			colours.addAll(colours1);
			System.out.println("The New TreeSet is : " + colours);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void tc4() {
		//4.Write a Java program to create a reverse order view of the elements contained in a given tree set.
		try {
			TreeSet<String> colours = new TreeSet<String>();
			colours.add("yellow");
			colours.add("green");
			colours.add("blue");
			colours.add("orange");
			colours.add("purple");
			System.out.println("The TreeSet is :" + colours);
			Iterator itera = colours.descendingIterator();
			// using foreach method
			/*for (String coloursValueInDescending : colours) {
				
			itera.hasNext();
			System.out.println(itera.next());	
			}*/
			
			
			//using While loop
			
			while(itera.hasNext()) {
				
				
				System.out.println(itera.next());
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println("Treeset printing in reverse order : " + itera );
	}
	
	
	@Test
	public void tc5() {
		//5.Write a Java program to get the first and last elements in a tree set.
		try {
			TreeSet<String> colours = new TreeSet<String>();
			colours.add("yellow");
			colours.add("green");
			colours.add("blue");
			colours.add("orange");
			colours.add("purple");
			System.out.println("The TreeSet is :" + colours);
			
   Object	firstElement = colours.first();
			
   System.out.println("First Element is: "+ firstElement);
 
 
   Object	lastElement = colours.last();
			
   System.out.println("Lirst Element is: "+ lastElement);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void tc6() {
		try {
			//6Write a Java program to clone a tree set to another tree set.
			TreeSet<String> colours = new TreeSet<String>();
			colours.add("yellow");
			colours.add("green");
			colours.add("blue");
			colours.add("orange");
			colours.add("purple");
			System.out.println("The Original TreeSet is :" + colours);
			
			TreeSet<String> newColourtreeSet = (TreeSet<String>) colours.clone();
			
			System.out.println(" The Cloned TreeSet is : " + newColourtreeSet);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println(" The Cloned TreeSet is : " + colours);
	
}
	@Test
	public void tc7() {
		//7.Write a Java program to get the number of elements in a tree set. 
		try {
			TreeSet<String> colours = new TreeSet<String>();
			colours.add("yellow");
			colours.add("green");
			colours.add("blue");
			colours.add("orange");
			colours.add("purple");
			System.out.println("The TreeSet is :" + colours);
			System.out.println("The TreeSet Size is :" + colours.size());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
}
	
	@Test
	public void tc8() {
		//8.Write a Java program to compare two tree sets.  
		try {
			TreeSet<String> colours = new TreeSet<String>();
			colours.add("yellow");
			colours.add("green");
			colours.add("blue");
			colours.add("orange");
			colours.add("purple");
			System.out.println("The Second TreeSet is :" + colours);
			
			
			TreeSet<String> colours1 = new TreeSet<String>();
			colours1.add("yellow");
			colours1.add("purple");
			colours1.add("pink");
			colours1.add("lavender");
			colours1.add("blue");
			System.out.println("The Second TreeSet is :" + colours1);
			
			TreeSet<String> newTreeSet = new TreeSet<String>();
			
			for (String compareTwotreeSet : colours) {
				
				System.out.println(colours1.contains(compareTwotreeSet) ? "Yes" : "No");
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		//System.out.println("the result of new TreeSet is : " + newTreeSet);
}
	
	@Test
	public void tc9() {
	
	//9.Write a Java program to find the numbers less than 7 in a tree set.
		try {
			TreeSet<Integer> addingNumber = new TreeSet<Integer>();
			TreeSet<Integer> treeHeadSet = new TreeSet<Integer>();
			
			addingNumber.add(1);
			addingNumber.add(2);
			addingNumber.add(3);
			addingNumber.add(4);
			addingNumber.add(5);
			addingNumber.add(6);
			addingNumber.add(7);
			addingNumber.add(8);
			addingNumber.add(9);
			addingNumber.add(10);

System.out.println("The Treeset is: " + addingNumber);

treeHeadSet =(TreeSet) addingNumber.headSet(7);

//Using Foreach loop
System.out.println("In the treeset the value less than 7 is using foreach: ");
for (Integer headValue : treeHeadSet) {
			System.out.println(headValue);
}

//Using iterator
//create iterator
			Iterator itera;
			//using foreach method
			itera =	treeHeadSet.iterator();

//using while loop
System.out.println("In the treeset the value less than 7 is using whileloop: ");
while(itera.hasNext()) {
			
			System.out.println(itera.next());
}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	
	}
	
	
	@Test
	public void tc10() {
		
		//10.Write a Java program to get the element in a tree set which is greater than or equal to the given element. 
		try {
			TreeSet<Integer> addingNumber = new TreeSet<Integer>();
			
			addingNumber.add(11);
			addingNumber.add(22);
			addingNumber.add(33);
			addingNumber.add(44);
			addingNumber.add(55);
			addingNumber.add(66);
			addingNumber.add(73);
			addingNumber.add(88);
			addingNumber.add(99);
			addingNumber.add(100);

 System.out.println("The Treeset is: " + addingNumber);
			
 System.out.println("Greater than or equal to 73 : "+addingNumber.ceiling(73));
 System.out.println("Greater than or equal to 41 : "+addingNumber.ceiling(41));
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
		
	}
	
	@Test
	public void tc11() {
		
		//11.Write a Java program to get the element in a tree set which is less than or equal to the given element. 
		try {
			TreeSet<Integer> addingNumber = new TreeSet<Integer>();
			
			
			addingNumber.add(11);
			addingNumber.add(22);
			addingNumber.add(33);
			addingNumber.add(44);
			addingNumber.add(55);
			addingNumber.add(66);
			addingNumber.add(77);
			addingNumber.add(88);
			addingNumber.add(99);
			addingNumber.add(100);

 System.out.println("The Treeset is: " + addingNumber);
			
 System.out.println("less than or equal to 73 : "+addingNumber.floor(73));
 System.out.println("less than or equal to 41 : "+addingNumber.floor(44));
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
		
	}
	
	
	@Test
	public void tc12() {
		
		//12.Write a Java program to get the element in a tree set which is strictly greater than to the given element. 
		try {
			TreeSet<Integer> addingNumber = new TreeSet<Integer>();
			
			
			addingNumber.add(11);
			addingNumber.add(22);
			addingNumber.add(33);
			addingNumber.add(44);
			addingNumber.add(55);
			addingNumber.add(66);
			addingNumber.add(77);
			addingNumber.add(88);
			addingNumber.add(99);
			addingNumber.add(100);

 System.out.println("The Treeset is: " + addingNumber);
			
 System.out.println("Strictly greater than 51 : "+addingNumber.higher(51));
 System.out.println("Strictly greater than 76 : "+addingNumber.higher(76));
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
		
	}
	
	@Test
	public void tc13() {
		
		//13. Write a Java program to get the element in a tree set which is strictly less than to the given element. 
		try {
			TreeSet<Integer> addingNumber = new TreeSet<Integer>();
			TreeSet<Integer> treeHeadSet = new TreeSet<Integer>();
			
			addingNumber.add(11);
			addingNumber.add(22);
			addingNumber.add(33);
			addingNumber.add(44);
			addingNumber.add(55);
			addingNumber.add(66);
			addingNumber.add(77);
			addingNumber.add(88);
			addingNumber.add(99);
			addingNumber.add(100);

 System.out.println("The Treeset is: " + addingNumber);
			
 System.out.println("Strictly greater than 51 : "+addingNumber.lower(51));
 System.out.println("Strictly greater than 76 : "+addingNumber.lower(76));
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
		
	}
	
	
	@Test
	public void tc14() {
		
		//14.Write a Java program to retrieve and remove the first element of a tree set. 
		try {
			TreeSet<Integer> addingNumber = new TreeSet<Integer>();
			
			addingNumber.add(11);
			addingNumber.add(22);
			addingNumber.add(33);
			addingNumber.add(44);
			addingNumber.add(55);
			addingNumber.add(66);
			addingNumber.add(77);
			addingNumber.add(88);
			addingNumber.add(99);
			addingNumber.add(100);

 System.out.println("The Treeset is: " + addingNumber);
			
 System.out.println("Removes the first(lowest) element: "+addingNumber.pollFirst());
 
 System.out.println("Tree set after removing first element: "+addingNumber);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
		
	}
	
	@Test
	public void tc15() {
		
		//15.Write a Java program to retrieve and remove the last element of a tree set. 
		try {
			TreeSet<Integer> addingNumber = new TreeSet<Integer>();
			
			
			addingNumber.add(11);
			addingNumber.add(22);
			addingNumber.add(33);
			addingNumber.add(44);
			addingNumber.add(55);
			addingNumber.add(66);
			addingNumber.add(77);
			addingNumber.add(88);
			addingNumber.add(99);
			addingNumber.add(100);

 System.out.println("The Treeset is: " + addingNumber);
			
 System.out.println("Removes the first(highest) element: "+addingNumber.pollLast());
 System.out.println("Tree set after removing Last element: "+addingNumber);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
		
	}
	
	
	@Test
	public void tc16() {
		
		//16.Write a Java program to remove a given element from a tree set.
		try {
			TreeSet<Integer> addingNumber = new TreeSet<Integer>();
			
			
			addingNumber.add(11);
			addingNumber.add(22);
			addingNumber.add(33);
			addingNumber.add(44);
			addingNumber.add(55);
			addingNumber.add(66);
			addingNumber.add(77);
			addingNumber.add(88);
			addingNumber.add(99);
			addingNumber.add(100);
			
			

 System.out.println("The Treeset is: " + addingNumber);
			
 System.out.println("Removes 77 from the list: "+ addingNumber.remove(75));
 System.out.println("Remove given element in the Treeset: " + addingNumber);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
	}		
	
	
	}