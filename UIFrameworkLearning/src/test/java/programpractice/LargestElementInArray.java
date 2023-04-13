package programpractice;

import java.util.Arrays;
import java.util.Scanner;

import org.testng.annotations.Test;

public class LargestElementInArray {
	@Test
	public int[] largest(){

		int arrayValue[] = { 10, 324, 45, 90, 9808 };
		int i; 
		int max = arrayValue[0];

		for (i = 1; i < arrayValue.length; i++)
			if (arrayValue[i] > max)
				max = arrayValue[i];

		return arrayValue;

	}

	//System.out.println(Arrays.toString(arrayValue));





	




	private void elseif(boolean b) {
		// TODO Auto-generated method stub

	}

	@Test
	public void smallestElement() {  

		int [] arr = new int [] {25, 11, 7, 75, 56, 97, 998, 765, -98, -3};  
		int min = arr[0];  
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] < min)  
				min = arr[i];  

		}  
		System.out.println("Smallest element present in given array: " + min);  
	}  


	@Test
	public void checkPalindrome()
	{
		String str, rev = "";
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string:");
		str = sc.nextLine();
		int length = str.length();

		for ( int i = length - 1; i >= 0; i-- )
			rev = rev + str.charAt(i);

		if (str.equals(rev))
			System.out.println(str+" is a palindrome");
		else
			System.out.println(str+" is not a palindrome");

	}
	//find given string is palindrome or not
	@Test
	public void validatePalindrome()
	{
		/*
		 * palindrome: Reversed string should be same as the input string. 
		 * Eg: liril
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = sc.nextLine();
		
		String revString="";
		for ( int i=str.length() -1; i>=0;i--)
		{
			revString= revString + str.charAt(i); //liril""
		}
		
		System.out.println("Reversed String: "+revString);
		
		if(str.equalsIgnoreCase(revString))
		{
			System.out.println("Both the Input string( "+str+") and reversed string ("+revString+") are the same. Hence it is a palindrome string ");
		}
		else
		{
			System.out.println("Both the Input string( "+str+") and reversed string ("+revString+") are not the same. Hence it is not a palindrome string ");

		}
		
		
		
		
		
	}

	//find large and smallest number in the given array

		@Test
		public void largestElement() {  

			int [] arr = new int [] {25, 11, 7, 75, 56, 97, 998, 765, -98, -3};  
			int max = arr[0];   int min = arr[0]; int i =0;
			for (i =1; i < arr.length; i++) {
				if(arr[i] > max)
				{

					max = arr[i];  

				}  

				else if (arr[i] < min) 
				{
					min = arr[i];
					 

				}
			
	}
			System.out.println("Largest element present in given array: " + max);  
			System.out.println("Smallest element present in given array: " + min);
		}  

}

