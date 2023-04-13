package exceptionhandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.testng.annotations.Test;

public class Throws {
	@Test
	public void checkedThrows() throws IOException {
		int k = 0;
		int j = 0;
		String a = null;
		InputStreamReader ir1 = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir1);
		System.out.println("Enter the String: ");
		
			a = br.readLine();
			k = Integer.parseInt(a);
			j = k / 2;

	
}
}
