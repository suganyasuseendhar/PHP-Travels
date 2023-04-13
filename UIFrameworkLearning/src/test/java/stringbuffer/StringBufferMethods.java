package stringbuffer;

import org.testng.annotations.Test;

public class StringBufferMethods {

	@Test
	public  void program1()
	{
		//1.one way of creating StringBuffer
		StringBuffer sb= new StringBuffer();
		sb.append("learning");
		//sb.append("java");
		System.out.println(sb);
		
		/*
		//2. Creating a Stringbuffer with value
		StringBuffer sb1= new StringBuffer("Hello");
		sb1.append("world");
		System.out.println(sb1);
		
		//3. Creating Stringbuffer with memory value
		StringBuffer sb2= new StringBuffer(20);
		sb2.append("new");
		sb2.append("value");
		System.out.println(sb2);
		*/
		
		//inserts the value at the specified index
		//sb.insert(1,"Java" );
		//System.out.println(sb);
		
		/*replace
		 * end index is exclusive which means endindex-1
		
		*/
		//sb.replace(1, 3, "Java");
		//System.out.println(sb);
		
		//delete[ end index is exclusive which means endindex-1]
		//sb.delete(1, 3);
		//System.out.println(sb);
		
		//reverse
		//sb.reverse();
		//System.out.println(sb);
		
		/*capacity
		Dafault memory of a String buffer is 16.
		 If it exceeds 16, then the new memory will be calculated with the below formula,
		new memory size -->(oldcapacity*2) +2
		
		*/
		
		//System.out.println(sb.capacity());
		sb.append("Selenium is a web automation");
		System.out.println(sb.capacity());
		
		System.out.println(sb.length());
		
	}
	
	
	@Test
	public void stringBufferTrying() {
		
		
		StringBuffer sb = new StringBuffer();
		sb.append("learning");
		sb.append("java");
		System.out.println(sb);
		
		sb.insert(1, "selenium");
		System.out.println(sb);
		
		sb.replace(5, 10, "mavean");
		System.out.println(sb);
		
		sb.delete(3, 12);
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
		
		System.out.println(sb.capacity());
		
		System.out.println(sb.length());
		
		//ways of creating string buffer
		
		//1.one way of creating StringBuffer
		
		StringBuffer sb1 = new StringBuffer();
		sb1.append("suganya");
		sb1.append("shibin");
		System.out.println(sb1);
		
		//2. Creating a Stringbuffer with value
		StringBuffer sb2 = new StringBuffer("hello");
		sb2.append("suseendhar");
		System.out.println(sb2);
		
		//3. Creating Stringbuffer with memory value
		
		StringBuffer sb3 = new StringBuffer(40);
        System.out.println(sb3.capacity());
        sb3.append("magathi");
		sb3.append("paranesh");
        System.out.println(sb3.length());
		
		
		System.out.println(sb3);
		
	}
	
}
