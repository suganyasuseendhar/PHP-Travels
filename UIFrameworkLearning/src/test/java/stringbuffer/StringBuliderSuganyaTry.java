package stringbuffer;

public class StringBuliderSuganyaTry {

	 public static void main(String args[]) {
		 
		 StringBuilder sb = new StringBuilder();
		 
		 sb.append("suganya");
		 sb.append("suseendhar");
		 sb.append("shibin");
		 System.out.println(sb);
		 sb.delete(17, 23);
		 System.out.println("After removing the value" + sb);
		 sb.insert(7, "Shibin is my baby");
		 System.out.println("after inserting the sentance : " + sb);
		 
		 sb.replace(0, 7, "lenny");
		 System.out.println("after replacing the sentance : " + sb);
		 
		 sb.substring(0, 6);
		 System.out.println("the substring value is : " + sb);
		 sb.substring(7);
		 System.out.println("the substring with starting value is : " + sb);
		 
		
		 System.out.println("the substring with starting value is : " + sb.charAt(5));
	 }
}
