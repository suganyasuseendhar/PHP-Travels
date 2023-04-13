package programpractice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import org.testng.annotations.Test;

public class HashSetSuganyaPractice {
@Test
	public void tc1() {
		// 1.Write a Java program to append the specified element to the end of a hash set
	//hashset does not maintance insertion order and also not allow duplicates
		try {
			Set<String> fruits = new HashSet<String>(); 
			fruits.add("apple");
			fruits.add("orange");
			fruits.add("mango");
			fruits.add("banana");
			fruits.add("pine apple");
			System.out.println(fruits);
			System.out.println("before append the value : " + fruits);
			fruits.add("strawberry");
			System.out.println("after append the value  at last(hashset does not maintance insertion order and also not allow duplicates): " + fruits);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

@Test
public void tc2() {
	//2.Write a Java program to iterate through all elements in a hash set
	try {
		Set<String> fruits = new HashSet<String>(); 
		fruits.add("apple");
		fruits.add("orange");
		fruits.add("mango");
		fruits.add("banana");
		fruits.add("pine apple");
		System.out.println(fruits);
		//using for each method
		for (String jam : fruits) {
			System.out.println(jam);
		}
		//using iterator
		Iterator<String> iterate = fruits.iterator();
		while(iterate.hasNext()) {
			
			System.out.println(iterate.next());
		}
	} catch (Exception e) {
		
		e.printStackTrace();
	}
	
}
@Test
public void tc3() {
	//// Write a Java program to get the number of elements in a hash set
	try {
		Set<String> fruits = new HashSet<String>(); 
		fruits.add("apple");
		fruits.add("orange");
		fruits.add("mango");
		fruits.add("banana");
		fruits.add("pine apple");
		fruits.add("pine apple");
		System.out.println(fruits);
		System.out.println(fruits.size());
	} catch (Exception e) {
		
		e.printStackTrace();
	}
	
	
}

@Test
public void tc4() {
	//4.Write a Java program to empty an hash set

	try {
		Set<String> fruits = new HashSet<String>(); 
		fruits.add("apple");
		fruits.add("orange");
		fruits.add("mango");
		fruits.add("banana");
		fruits.add("pine apple");
		fruits.add("pine apple");
		System.out.println("original list value is: " + fruits.size());
		System.out.println(fruits.removeAll(fruits));
		System.out.println("after removing all value in the list is: " + fruits.size());
	} catch (Exception e) {
		
		e.printStackTrace();
	}
}

@Test
public void tc5() {
	//5. Write a Java program to test a hash set is empty or not
	try {
		
		Set<String> fruits = new HashSet<String>();
		fruits.add("watermelon");
		System.out.println("the set is empty or not : " + fruits.isEmpty());
		if(fruits.isEmpty()) {
			
			System.out.println("the set is empty");
		}
		else {
			
			System.out.println("the set is not empty");
			
		}
		
	} catch (Exception e) {
		
		e.printStackTrace();
	}
}

@Test
public void tc6() {
	//6. Write a Java program to clone a hash set to another hash set
	try {
		
		HashSet<String> fruits = new HashSet<String>(); 
		fruits.add("apple");
		fruits.add("orange");
		fruits.add("mango");
		fruits.add("banana");
		fruits.add("pine apple");
		fruits.add("pine apple");
		
		Set<String> jam = new HashSet<String>();
		
		//colours2 = (HashSet<String>) colours1.clone();
		  jam	=  (HashSet<String>) fruits.clone();
		  System.out.println("the clonable set is : " + jam);
	} catch (Exception e) {
		
		e.printStackTrace();
	}
}

@Test
public void tc7() {
	//7. Write a Java program to convert a hash set to an array
	
	/*There are two ways of converting HashSet to the array:

1.Traverse through the HashSet and add every element to the array.
2.To convert a HashSet into an array in java, we can use the function of toArray().*/
	
	try {
		HashSet<String> fruits = new HashSet<String>(); 
		fruits.add("apple");
		fruits.add("orange");
		fruits.add("mango");
		fruits.add("banana");
		fruits.add("pine apple");
		//Traverse through the HashSet and add every element to the array.
		System.out.println("size of the set is : " + fruits.size());
		
		String HashSetTOArray[] = new  String[fruits.size()]; 
		int i=0;
		System.out.println("Traverse through the HashSet and add every element to the array : ");
		for (String insideset : fruits) {
			HashSetTOArray[i++]= insideset ;
			//insideset = HashSetTOArray[i++];
		}
		
		for (String finalValue : HashSetTOArray) {
			System.out.println(finalValue);
		}
		
		
		//2.To convert a HashSet into an array in java, we can use the function of toArray().
		System.out.println("using ToArray Method : ");
		fruits.toArray(HashSetTOArray);
		for (String finalValue : HashSetTOArray) {
		System.out.println(finalValue);
		}
	} catch (Exception e) {
		
		e.printStackTrace();
	}
	
	
	
}

@Test
public void tc8() {
	
	//8.Write a Java program to convert a hash set to a tree set
	
	try {
		HashSet<String> fruits = new HashSet<String>(); 
		fruits.add("apple");
		fruits.add("orange");
		fruits.add("mango");
		fruits.add("banana");
		fruits.add("pine apple");
		
		System.out.println("size of the set is : " + fruits.size());
		//method 1 using foreach
		//String HashSetTOArray[] = new  String[fruits.size()]; 
		Set<String> hashSetToTreeSet = new TreeSet<String>(fruits);
		for (String convertValue : hashSetToTreeSet) {
			hashSetToTreeSet.add(convertValue);
			
			
}
		System.out.println(hashSetToTreeSet);
	} catch (Exception e) {
		
		e.printStackTrace();
	}
	
	
}


@Test
public void tc9() {
	//9. Write a Java program to convert a hash set to a List/ArrayList
	
	try {
		HashSet<String> fruits = new HashSet<String>(); 
		fruits.add("apple");
		fruits.add("orange");
		fruits.add("mango");
		fruits.add("banana");
		fruits.add("pine apple");
		
		System.out.println("size of the set is : " + fruits.size());
		ArrayList<String> arrayValue = new ArrayList<String>(fruits);
		
		for (String arrayListOfValue : arrayValue) {
			System.out.println(arrayListOfValue);
			
		}
	} catch (Exception e) {
		
		e.printStackTrace();
	}
	
	
	
}
@Test
public void tc10() {
	//10. Write a Java program to compare two hash set
	try {
		HashSet<String> fruits = new HashSet<String>(); 
		fruits.add("apple");
		fruits.add("orange");
		fruits.add("mango");
		fruits.add("banana");
		fruits.add("pine apple");
		
		System.out.println("size of the fruits set value is : " + fruits.size());
		
		HashSet<String> jam = new HashSet<String>(); 
		jam.add("apple");
		jam.add("orange");
		jam.add("mango");
		jam.add("banana");
		jam.add("pine apple");
		jam.add("butter fruit");
		jam.add("avacado");
		
		System.out.println("size of the jam set value is : " + jam.size());
		
		//compare two hashset
		// To compare jam set value to fruit set
		//To compare fruits set value to jam set
		//for (String comparingValue : fruits)
		for (String comparingValue : jam) {
			//System.out.println(colours1.contains(e) ? "Yes" : "No");
		System.out.println(fruits.contains(comparingValue) ? "yes" : "No");
		}
	} catch (Exception e) {
		
		e.printStackTrace();
	}
	
}

@Test
public void tc11() {
	//11.Write a Java program to compare two sets and retain elements which are same
	// on both sets
	try {
		HashSet<String> fruits = new HashSet<String>(); 
		fruits.add("apple");
		fruits.add("orange");
		fruits.add("mango");
		fruits.add("banana");
		fruits.add("pine apple");
		
		System.out.println("size of the fruits set value is : " + fruits.size());
		
		HashSet<String> jam = new HashSet<String>(); 
		jam.add("apple");
		jam.add("orange");
		jam.add("mango");
		jam.add("banana");
		jam.add("pine apple");
		jam.add("butter fruit");
		jam.add("avacado");
		
		System.out.println("size of the jam set value is : " + jam.size());
		
		//compare two hashset
		// To compare jam set value to fruit set
		//To compare fruits set value to jam set
		//for (String comparingValue : fruits)
		for (String comparingValue : jam) {
			//System.out.println(colours1.contains(e) ? "Yes" : "No");
		System.out.println(fruits.contains(comparingValue) ? "yes" : "No" == "yes");
		}
	} catch (Exception e) {
		
		e.printStackTrace();
	}
	
}

@Test
public void tc12() {
	//12.Write a Java program to remove all of the elements from a hash set
	try {
		HashSet<String> fruits = new HashSet<String>(); 
		fruits.add("apple");
		fruits.add("orange");
		fruits.add("mango");
		fruits.add("banana");
		fruits.add("pine apple");
		fruits.add("papaya");
		fruits.add("star fruit");
		
		System.out.println("size of the fruits set value is : " + fruits.size());
		
		HashSet<String> jam = new HashSet<String>(); 
		jam.add("apple");
		jam.add("orange");
		jam.add("mango");
		jam.add("banana");
		jam.add("pine apple");
		jam.add("butter fruit");
		jam.add("avacado");
		
		System.out.println("size of the jam set value is : " + jam.size());
		
		System.out.println("Before Removing HashSet :");
		System.out.println(fruits);

		System.out.println("After Removing HashSet :");
		
		fruits.removeAll(jam);
		
		System.out.println("after removeall method : "+ fruits);
		fruits.clear();
		System.out.println("after clear method: " + fruits);
	} catch (Exception e) {
		
		e.printStackTrace();
	}
}

}