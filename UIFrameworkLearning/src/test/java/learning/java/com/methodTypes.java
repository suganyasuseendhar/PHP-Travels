package learning.java.com;

public class methodTypes {

	// Metod wo return type and wo arguments

	public void add() {

		int a = 10;
		int b = 20;
		System.out.println(a + b);
	}

	// Metod with return type and wo arguments

	public int sub() {

		int a = 10;
		int b = 20;

		return a - b;
	}

	// Metod without return type and with arguments

	public void mul(int a, int b) {

		System.out.println(a * b);
	}

	// Metod with return type and with arguments

	public int div(int a, int b) {

		return (a / b);
	}

}
