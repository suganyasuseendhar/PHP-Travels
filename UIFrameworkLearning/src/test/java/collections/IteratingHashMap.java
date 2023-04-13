package collections;

import java.util.HashMap;

import org.testng.annotations.Test;

public class IteratingHashMap {
	@Test
	public void hashMapLearn()
	{
		HashMap < String,String >  value = new HashMap < String,String >();
		
		value.put("honda" , "blue" );
		value.put("maruti" , "orange" );
		value.put("bmw" , "red" );
		value.put("ford" , "null" );
		
		System.out.println(value);
		
		System.out.println(value.get("bmw"));
		
		
	

	//To Remove an Item
	System.out.println(value);
	value.remove("maruti");
	System.out.println("After Removal of maruti");
	System.out.println(value);

	//map.clear();
	System.out.println(value.size());	
	
	System.out.println("iterating the keys");
	for(String i : value.keySet()) {

	System.out.println(i);
	}
	System.out.println("iterating the values");
	for(String s : value.values()) {

	System.out.println(s);
	}

	
	
	for(String i : value.keySet()) {
		
	System.out.println(i + ": "+ value.get(i));
	}	
	
	
	}
}
/*
	 * @Test
	 * 
	 * public void wordCount() { String sent =
	 * "count the repeating strings in the sentence of strings "; //String cString =
	 * "ttesting Software test "; //I want to split the sentance in o words and
	 * store it in an array
	 * 
	 * //char[] ch = cString.toCharArray(); String[] words =sent.split(" ");
	 * 
	 * 
	 * 
	 * HashMap<String,Integer> wc = new HashMap<String,Integer>();
	 * 
	 * //for(String w :words) for(int i =0;i<words.length;i++) {
	 * 
	 * if(wc.containsKey(words[i])) { //if I already have an entry increment the
	 * count by 1 wc.put(words[i], wc.get(words[i])+1);
	 * 
	 * } else wc.put(words[i], 1);
	 * 
	 * 
	 * } System.out.println(wc);
	 * 
	 * 
	 * 
	 * 
	 * }
	 * 
	 * }
	 */
	
	

/*public void dataCount(){
	
	String sent = "how many words in the given sentance can checking repeated words"
	
	
}

{
	



}*/
