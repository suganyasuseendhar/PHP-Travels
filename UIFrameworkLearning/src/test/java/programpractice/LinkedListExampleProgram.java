package programpractice;



import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.testng.annotations.Test;

public class LinkedListExampleProgram {
	
	@Test
	public void code1() {
		
		//1.Write a program to append the specified element  to the end of the linked list 
		
		List<String> vehicles = new LinkedList<String>();
		
		vehicles.add("car");
		vehicles.add("Bike");
		vehicles.add("Scooter");
		vehicles.add("Bus");
		vehicles.add("Train");
        System.out.println(vehicles);
        vehicles.add(5, "Flight");
        System.out.println("Result after appending");
        System.out.println(vehicles);
		
	}
	
	@Test
	public void code2() {
		
		//2.Write a program to iterate through all elements in a linked list 
		
        List<String> vehicles = new LinkedList<String>();
		
		vehicles.add("car");
		vehicles.add("Bike");
		vehicles.add("Scooter");
		vehicles.add("Bus");
		vehicles.add("Train");
        System.out.println(vehicles);
        
        System.out.println("Result after iterating ");
        
        Iterator itr = vehicles.iterator();
        
       while(itr.hasNext()) {
    	   System.out.println(itr.next());
       }
		
	}
	

	@Test
	public void code3() {
		
		//3.Write a program to iterate through all elements in a linked list starting at the specified position
		
		 LinkedList<String> vehicles = new LinkedList<String>();
			
			vehicles.add("car");
			vehicles.add("Bike");
			vehicles.add("Scooter");
			vehicles.add("Bus");
			vehicles.add("Train");
	        System.out.println(vehicles);
	        
	        System.out.println("Result after iterating ");
	        
	        Iterator<String> itr = vehicles.listIterator(2);
	        
	        while(itr.hasNext()) {
	     	   System.out.println(itr.next());  
	        }

		
		
	}
	
	@Test
	public void code4() {
		
		//4.Write a program to iterate a linked list in a reverse order
		
		  LinkedList<String> vehicles = new LinkedList<String>();
			
			vehicles.add("car");
			vehicles.add("Bike");
			vehicles.add("Scooter");
			vehicles.add("Bus");
			vehicles.add("Train");
	        System.out.println(vehicles);
	        
	        System.out.println("Result after iterating ");
	        
	        Iterator<String> itr = vehicles.descendingIterator();
	        
	        while(itr.hasNext()) {
		     	   System.out.println(itr.next()); 
		        }

	       		
		
	}

	@Test
	public void code5() {
		
		//5.Write a program to insert the specified element at the specified position in the linked list
		
		 LinkedList<String> vehicles = new LinkedList<String>();
			
			vehicles.add("car");
			vehicles.add("Bike");
			vehicles.add("Scooter");
			vehicles.add("Bus");
			vehicles.add("Train");
	        System.out.println(vehicles);
	        
	        vehicles.add(2, "Bicycle");
	        System.out.println("Result after inserting in 2nd position");
	        System.out.println(vehicles);
	        
		
	}
	
	@Test
	public void code6() {
		
		//6.Write a program to insert elements into the linked list at the first and last position
		
		 LinkedList<String> vehicles = new LinkedList<String>();
			
			vehicles.add("car");
			vehicles.add("Bike");
			vehicles.add("Scooter");
			vehicles.add("Bus");
			vehicles.add("Train");
	        System.out.println(vehicles);
	        System.out.println("Result after inserting in first and last position");
	        vehicles.addFirst("Bicycle");
	        vehicles.addLast("Flight");
	        System.out.println(vehicles);
		
	}
	
	@Test
	public void code7() {
		
	   //7.Write a program to insert the specified element at the front of a linked list 
		

		 LinkedList<String> vehicles = new LinkedList<String>();
			
			vehicles.add("car");
			vehicles.add("Bike");
			vehicles.add("Scooter");
			vehicles.add("Bus");
			vehicles.add("Train");
	        System.out.println(vehicles);
            
	       // vehicles.pollFirst()// ask doubt 
	        vehicles.addFirst("Bicycle");
	        System.out.println(vehicles);
	        System.out.println(vehicles.pollFirst());
	        System.out.println(vehicles);
	        
		
	}
	
	@Test
	public void code8() {
		
		//8. Write a program to retrive but does not remove, the first element of a linked list
		
		LinkedList<String> vehicles = new LinkedList<String>();
		
		vehicles.add("car");
		vehicles.add("Bike");
		vehicles.add("Scooter");
		vehicles.add("Bus");
		vehicles.add("Train");
        System.out.println(vehicles);
        System.out.println(vehicles.peekFirst());
        System.out.println("List after reteriving: "+vehicles);
		
	}

	@Test
	public void code9() {
		
		//9.Write a program to compare two linked list
		LinkedList<String> list1 = new LinkedList<String>();
		LinkedList<String> list2 = new LinkedList<String>();
	}

	@Test
	public void code10() {
		
		//10.Write a program to replace an element in a linked list
		LinkedList<String> vehicles = new LinkedList<String>();
		
		vehicles.add("car");
		vehicles.add("Bike");
		vehicles.add("Scooter");
		vehicles.add("Bus");
		vehicles.add("Train");
        System.out.println(vehicles);
        //Only replace all i could see
        vehicles.set(2, "Bicycle");
        System.out.println(vehicles);

		
	}

	@Test
	public void code11() {
		
		//11.Write a program to test whether a linked list is empty or not 
		
		LinkedList<String> vehicles = new LinkedList<String>();
		LinkedList<String> vehicles1 = new LinkedList<String>();

		
		vehicles.add("car");
		vehicles.add("Bike");
		vehicles.add("Scooter");
		vehicles.add("Bus");
		vehicles.add("Train");
        System.out.println(vehicles);
        System.out.println(vehicles1.isEmpty());
		
	}




	

}