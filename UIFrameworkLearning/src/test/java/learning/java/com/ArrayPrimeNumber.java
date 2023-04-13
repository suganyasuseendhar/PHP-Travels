package learning.java.com;

import java.util.Arrays;

import org.testng.annotations.Test;

public class ArrayPrimeNumber {
int i=0;
	@Test
	public void prime() {
		
		int[] a = { 98, 13, 45, 76, 88 };
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		int n = a[i];
		boolean flag = true;
		for (int j = 2; j < a.length; j++) {

			if (n % j == 0) {

				flag = false;
				System.out.println(n + "not a prime number");
				break;
			}
			if (flag =true) {

				System.out.println( n + "is prime number");

			}

		}

	}

}
