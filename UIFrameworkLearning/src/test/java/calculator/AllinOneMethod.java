package calculator;

public class AllinOneMethod {
	
public static void main(String[] args) {
	Addition.main("hello");
	Addition addOfTwo = new Addition();//object creation
	
	int add = addOfTwo.add(25,90);
	double  add = addOfTwo.add(78,79,96);
	int add = addOfTwo.add(95,45,55,67);
	
	
	System.out.println(add);
	System.out.println(add);
	System.out.println(add);
	
	
	

}	
	

	

	
	
	
	

}	
/*Subraction subOfTwo = new Subraction();//object creation
	
	int sub1 = subOfTwo.sub1(25,90);
	int sub2 = subOfTwo.sub2(25,90,55);
	int sub3 = subOfTwo.sub3(25,90,55,70);
	
	System.out.println(sub1);
	System.out.println(sub2);
	System.out.println(sub3);
	
	
	
	
Multiplication mulOfTwo = new Multiplication();//object creation
	
	int mul1 = mulOfTwo.mul1(25,90);
	int mul2 = mulOfTwo.mul2(25,90,55);
	int mul3 = mulOfTwo.mul3(25,90,55,70);
	
	System.out.println(mul1);
	System.out.println(mul2);
	System.out.println(mul3);
	
	

Division divOfTwo = new Division();//object creation

    int div1 = divOfTwo.div1(25,90);
    int div2 = divOfTwo.div2(25,90,55);
    int div3 = divOfTwo.div3(25,90,55,70);



    System.out.println(div1);
    System.out.println(div2);
    System.out.println(div3);

}*/






