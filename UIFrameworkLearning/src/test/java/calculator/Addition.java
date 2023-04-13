package calculator;

public class Addition {
	public int add(int a, int b)
	{
		
		return (a+b);
		
	}
	
	public int add(int a, int b, int c)
	{
		
		return (a+b+c);
		
		
	}
	public double  add(double  a, double  b, double  c ,int d)
	{
		
		return (a+b+c+d);
		
	}
	public static void main(String[] args) {
		
		System.out.println("hi");
	}

public static void main(String args) {
	System.out.println("overloading main method:"+ args);
}
}