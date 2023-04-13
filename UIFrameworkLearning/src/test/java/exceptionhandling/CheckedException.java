package exceptionhandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.testng.annotations.Test;


public class CheckedException {
	@Test
	public void checked() {
		int k = 0;
		int j = 0;
		String a = null;
		InputStreamReader ir1 = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir1);
		System.out.println("Enter the String: ");
		try {
			a = br.readLine();
			k = Integer.parseInt(a);
			j = k / 2;
			if(j>200) {
				
				throw new ArithmeticException();
				
			}

		}

		catch (IOException e) {

			System.out.println(e);

		}
		finally {
			System.out.println("BYE");
		}
		System.out.println("value of j is " + j);
	}

	

	
}