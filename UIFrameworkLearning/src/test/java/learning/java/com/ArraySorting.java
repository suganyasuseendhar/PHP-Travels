package learning.java.com;

import java.util.Arrays;

import org.testng.annotations.Test;

public class ArraySorting {
@Test	
		public void sortNo() {
	
		int[] arr = { 12, -3, 40, 98, -9, 29 };
		int temp = 0;
		System.out.println("Elements of the arr are : ");
		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] < arr[j]) {

					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}

			}
			System.out.println(Arrays.toString(arr));
		}
		System.out.println(Arrays.toString(arr));
	}
}