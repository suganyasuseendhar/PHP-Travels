package array;

import java.util.Arrays;

import org.testng.annotations.Test;

public class ArrayPractiseProgram {

	
	
	@Test
	public void basicProgram() {
		
		
	
	
	int[] classes = new int[4];
	
	classes[0]= 75;
	classes[1]= 85;
	classes[2]= 95;
	classes[3]= 105;
	
	
	System.out.println(Arrays.toString(classes));
	
	for(int i =0; i<classes.length;i++) {
		
		System.out.println(classes[i]);
		
		
	}
	
	for (int i : classes) {
		System.out.println(i);
	}
	
}
	@Test
	public void arraySorting() {
		//1. create an array
		//2.traverse into the array
		//3.create temp as 0
		//4.using two for loop
		//5.for loop i,j
		//6.value exchange to temp o i, j=i, temp to j
		//7.print value using arraystostring method
		int[] arraystortingvalues = {78, 67,45,-12,-45};
		
		int temp=0;
		for (int i : arraystortingvalues) {
			System.out.println(i);
		}
		
		for(int i=0; i<arraystortingvalues.length; i++) {
			
			for(int j=i+1;j<arraystortingvalues.length;j++) {
				
				if(arraystortingvalues[i]<arraystortingvalues[j]) {
					
					temp = arraystortingvalues[i];
					arraystortingvalues[i]=arraystortingvalues[j];
					arraystortingvalues[j]=temp;
					
					
				}
				System.out.println(Arrays.toString(arraystortingvalues));
				
				
				
			}
			
			System.out.println(Arrays.toString(arraystortingvalues));
		}
	}
}