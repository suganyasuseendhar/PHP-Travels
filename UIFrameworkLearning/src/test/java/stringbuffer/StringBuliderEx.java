package stringbuffer;

public class StringBuliderEx {
	
	public static void main(String args[])
	{
		
		//1. Creating with a no argument to the constructor
		StringBuilder sb = new StringBuilder();
		
		//2. Creating with string argument to the constructor
	StringBuilder sb1  = new StringBuilder("hello");
		
		//3. Creating StringBuilder with capacity(memory)
		//StringBuilder sb2 = new StringBuilder(20);
		
		//append
		sb.append("java");
		sb.append("selenium");
		
		System.out.println(sb);
		
		//insert
		sb.insert(1, "language");
		System.out.println("After inserting-->"+sb);
		
		//delete (end Index is exclusive --> givenEndIndex-1)
		sb.delete(1, 9);
		System.out.println("After deleting-->"+sb);
		
		//replace(end Index is exclusive --> givenEndIndex-1)
		sb.replace(4, 12, "is my favourite language");
		System.out.println("AFter replacing-->"+sb);
		
		//reverse
		//sb.reverse();
		System.out.println("After reversing-->"+sb);
		
		//length
		System.out.println("The length os the given stringbuilder is "+sb.length());
		
		//subString
		System.out.println(sb.substring(0, 4));
		System.out.println(sb.substring(4));
		
		//capacity calculation-->  (oldCapacity  *2)+2
		StringBuilder sb3 = new StringBuilder();
		sb3.append("hello");
		System.out.println(sb3.capacity()); //oldcapacity=16
		System.out.println(sb1.capacity()); //oldcapcity=21
		
		System.out.println("Length of sb1-->"+sb1.length());
		System.out.println("Length of sb3-->"+sb3.length());
		
		
		sb1.ensureCapacity(30);
		
		
		System.out.println(sb3.charAt(1));

		
		
	}

	
	
	
}
