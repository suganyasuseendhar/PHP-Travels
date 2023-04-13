package learning.java.com;

import java.util.Arrays;
import java.util.Scanner;

import org.testng.annotations.Test;

public class ArrayLearn {
@Test	
	public void lengthOfArr() {
	
	//method 1
	int[] marks = new int [6];
	
	
	marks[0]=75;
	marks[1]=90;
	marks[2]=89;
	marks[3]=95;
	marks[4]=97;
	marks[5]=80;
	
	
	System.out.println("length of the array is = " + marks.length);
	System.out.println(Arrays.toString(marks));//values how to store in a array to print in console
	
	
	//method 2
	String[] people = {"suganya", "rama","ramya"};
	System.out.println("length of array is = " + people.length);
	System.out.println(Arrays.toString(people));
}

//getting array value dynamically in run time

String[] car = new String[5];
Scanner sc = new Scanner(System.in);

{

for(int i=0; i<=car.length-1; i++)
{
	System.out.println("Enter the car" + i + "value :" );
	car[i]=sc.nextLine();
	
	}

System.out.println("Enter the car names are :" );

for (int i=0; i<=car.length-1; i++)
	
{
	 
	System.out.println("Enter the car" + i + "value is :" + car[i] );
	 
	 
	 
}
}


}
	
	 
	 
	 
	 
	 


