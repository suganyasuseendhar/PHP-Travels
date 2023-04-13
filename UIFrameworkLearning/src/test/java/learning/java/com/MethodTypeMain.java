package learning.java.com;

public class MethodTypeMain {
	public static void main(String[] args) {
		
		methodTypes obj=new methodTypes();
		
		obj.add();
	int subResult =	obj.sub();
	obj.mul(23, 12);
	int divResult =obj.div(10, 100);
	
	
	System.out.println("Div Result : "+ divResult);
	System.out.println("subResult : "+ subResult);

	
	}

}
