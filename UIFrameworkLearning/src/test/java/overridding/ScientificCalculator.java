package overridding;

import inheritance.Calculator;

public class ScientificCalculator extends Calculator{
	
	public void cos() {
		System.out.println("This is cos function");
	}
	
	
	public void sin() {
		System.out.println("This is sin function");
	}
	
	public int add(int a, int b, int c) {

		return (a - b - c);

	}
	
	
	
}