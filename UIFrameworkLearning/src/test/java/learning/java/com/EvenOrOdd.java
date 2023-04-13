package learning.java.com;

import java.util.Scanner;

import org.testng.annotations.Test;

public class EvenOrOdd {
	@Test
	
	public void even() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number is :  ");
		int number = sc.nextInt();
		
	if (number % 2 == 0) {
		
		System.out.println("enter number is even");
	}	
		
	else {
		
		System.out.println("enter number is not even");
		
	}	
		
		
		
		
	}
	
	
	

}
