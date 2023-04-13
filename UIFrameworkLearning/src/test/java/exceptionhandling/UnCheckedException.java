package exceptionhandling;

import org.testng.annotations.Test;

public class UnCheckedException {

	// NumberFormatException
	@Test
	public void numberFormat() {

		String s = "thilak";
		int a = 0;
		try {
			a = Integer.parseInt(s);
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println(a + 10);

	}
	// ArthmeticException

	@Test
	public void arthmeticException() {

		int j = 8;
		int k = 0;
		try {
			System.out.println(j / k);
		} catch (Exception e) {
			System.out.println(e);

		}

		int a = 10;
		int c = 20;
		System.out.println(a + c);

	}

	// Nullponter Exception
	@Test
	public void nullPointer() {

		String s = null;
		String f = "100";
		try {

			System.out.println(s.length());

		} catch (NullPointerException e) {

			System.out.println(e);

		}
		// System.out.println(s.length());
		System.out.println(f.length());
	}

	@Test
	public void arrayIndex() {
		int[] studentMark = { 90, 98, 67, 89, 79 };
		int s1 = studentMark[2];
		System.out.println(s1);
		try {
			int s2 = studentMark[6];
			System.out.println(s2);
		} catch (Exception e) {

			System.out.println(e);

		}

	}

	@Test
	public void arrayIndexOf() {
		int[] studentMark = { 90, 98, 67, 89, 79 };
		int s1 = studentMark[2];
		System.out.println(s1);

		int s2 = studentMark[6];
		System.out.println(s2);

	}
}
