package superkeyword;
//parent class
public class Calculator {

	public int globala = 100;
//constructor
	public Calculator() {

		System.out.println("i am the parent class constructor");

	}

	public int add(int a, int b) {

		return (a + b);

	}

	public int add(int a, int b, int c) {

		return (a + b + c);

	}

}
