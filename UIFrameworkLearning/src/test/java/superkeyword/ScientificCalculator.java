package superkeyword;

//child class

public class ScientificCalculator extends Calculator{
	int globala = 1000;
	
	public void cos() {
		System.out.println("This is cos function");
	}
	
	
	public void sin() {
		System.out.println("This is sin function");
	}
	
	public int add(int a, int b, int c) {

		return (a - b - c);

	}
	
	public ScientificCalculator() {
		
		super();
		
	}
	
	public void displayParentClass() {
		
		int globala= 10;
		System.out.println(globala + "local variable of the childclass");
		System.out.println(this.globala + "instance variable of the childclass");
		System.out.println(super.globala + "parent class variable");
		
		super.add(30, 40);
		
		//System.out.println(super.add + "parent class variable");
		
	}
}
