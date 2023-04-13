package learning.java.com;

import java.util.Arrays;

import org.testng.annotations.Test;

public class ValueExchange {
	
	
@Test
	public void exchange()
	{
		
	int[] value = new int [1];
		
	int temp =0;	
	value [0] =10;
	value [1] =20;
	
	System.out.println("length of the array is = " + value.length);
	
	
	for (int i = 0; i < value.length; i++) {

		if (value [0] < value[1]) {

			temp = value[0];
			value[0] = value[1];
			value[1] = temp;

		}
	
		System.out.println(Arrays.toString(value));
		
	}
}
}

inheritation:
	
	
	