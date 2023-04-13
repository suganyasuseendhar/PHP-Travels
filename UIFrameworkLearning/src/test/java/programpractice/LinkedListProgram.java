package programpractice;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.testng.annotations.Test;



public class LinkedListProgram {
	
	
	@Test
	public void appendTheValue() {
		
		//1.Write a Java program to append the specified element to the end of a linked list
		
		List<String> s = new LinkedList<String>();
				 
		s.add("Red");
        s.add("Green");
        s.add("Black");
        s.add("White");
        s.add("Pink");
        s.add("Yellow");
        
        
		
        System.out.println("The linked list: " + s);
        
        
        //2.Write a Java program to iterate through all elements in a linked list
        Iterator it = s.iterator();
        while(it.hasNext()){
        	  
            // next() return the next element in the iteration
            System.out.print( it.next() + " ");
        }
        
        
        
        
        //3.Write a Java program to iterate through all elements in a linked list 
        //starting at the specified position.
        
        System.out.println(" list before iteration : " + s);
        
        Iterator it1 = s.iterator();
        //Iterator it1 = s.iterator(1);
        while (it1.hasNext()) {
        	//Object val = p.next().toString();
        	   System.out.println("list after the iteration : " +  it1.next());
        	   }
       
        
        
        // 4.Write a Java program to iterate a linked list in reverse order. 
        //Iterator it = l_list.descendingIterator();
        //add typecast
        Iterator it11 = ((LinkedList<String>) s).descendingIterator();
       
        System.out.println("Elements in Reverse Order:");
        while (it11.hasNext()) {
           System.out.println(it11.next());
        }
        
        
        //5.Write a Java program to insert the specified element at the specified position in the linked list.
        System.out.println("Let add the Yellow color after the Red Color: " + s);
		s.add(1, "Yellow");
		
		//6.Write a Java program to insert elements into the linked list at the first and last position. 
		System.out.println("Original linked list:" + s); 
		//s.addFirst("White");
		//s.addLast("Pink");
	
		((LinkedList<String>) s).addFirst("White");
		((LinkedList<String>) s).addLast("Pink");
		System.out.println("Final linked list:" + s);
		
		//7.Write a Java program to insert the specified element at the front of a linked list.
		((LinkedList<String>) s).offerFirst("Pink");
		//s.offerFirst("Pink");
	     System.out.println("Final linked list:" + s); 
	     
	     //10.Write a Java program to replace an element in a linked list.
	     s.set(1, "Orange");
	     
	     System.out.println("The value of second element changed.");
         System.out.println("New linked list: " + s);
         
         //11.	Write a Java program to test an linked list is empty or not.
         System.out.println("Check the above linked list is empty or not! "+s.isEmpty());
         s.removeAll(s);
         System.out.println("Linked list after remove all elements "+s.isEmpty());
         System.out.println("Linked list after remove all elements "+s);
         
         
         LinkedList<String> c2= new LinkedList<String>();
         c2.add("sugan");
         c2.add("shibin");
         c2.add("chandra");
         c2.add("susi");
	}

}
