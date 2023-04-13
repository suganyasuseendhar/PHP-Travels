package programpractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.testng.annotations.Test;

public class ArrayListPrograms {
	@Test
	public void findElement() {

		List<String> colours = new ArrayList<String>();
		colours.add("Red");
		colours.add("Green");
		colours.add("Orange");
		colours.add("White");
		colours.add("Black");
		System.out.println(colours.contains("Red"));
		List<String> sub_List = colours.subList(0, 3);
		Collections.swap(colours, 0, 3);
		System.out.println("colours");
		System.out.println("orginal list " + colours);
		System.out.println("Sublist of the elements is : " + sub_List);
		
		/*// Write a Java program to sort a given array list
		System.out.println("List before sort: " + colours);
		Collections.sort(colours);
		System.out.println("List after sort: " + colours);
		
		

		// Write a Java program to extract a portion of a array list.
		//sub String method in Strings
		System.out.println("Original list: " + colours);
		List<String> sub_List = colours.subList(0, 3);
		System.out.println("Sublist of the elements is : " + sub_List);

		
		// Write a Java program to search an element in a array list
		if (colours.contains("Red")) {
			System.out.println("Found the element");
		} else {
			System.out.println("There is no such element");
		}
		
		

		System.out.println("Array list before Swap:");
		for (String a : colours) {
			System.out.println(a);
		}
		
		

		// Swapping 1st(index 0) element with the 3rd(index 2) element
		Collections.swap(colours, 0, 3);
		System.out.println("Array list after swap:");
		for (String b : colours) {
			System.out.println(b);
		}
		
		
		//Replace the second element of a ArrayList with the specified
		System.out.println("Original array list: " + colours);
		String new_color = "Gray";
		colours.set(1, new_color);

		int num = colours.size();
		System.out.println(num);
		
		System.out.println(colours);
		System.out.println("Replace second element with 'Gray'.");
		for (int i = 0; i < num; i++)
			System.out.println(colours.get(i));*/
	
	
	
		
	
}
}