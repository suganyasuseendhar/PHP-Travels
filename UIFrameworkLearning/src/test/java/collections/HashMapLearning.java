package collections;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

public class HashMapLearning {
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
		
	}	
	




 
@Test
public void hashMapLearning() {


/*Store dat in key, value pair
 * keys should be unique
 * you can give any number of null values to the key
 *
 *
 *
 *
 *
 *
 *
 */
//Map<AbstractMap<HashMap>
// name = Aruna

HashMap<Integer,String> map = new HashMap<Integer,String>();

map.put(123, "chennai");
map.put(124, "Banglore");
map.put(125, "Pondy");
map.put(126, "Banglore");
map.put(1249, null);
map.put(334, null);


//to access the values from the map


System.out.println(map.get(125));

//To Remove an Item
System.out.println(map);
map.remove(125);
System.out.println("After Removal of 125");
System.out.println(map);

//map.clear();
System.out.println(map.size());

//Iterate the HashMap
//keyset()
//values()
// ptining keys
System.out.println("iterating the keys");
for(Integer i : map.keySet()) {

System.out.println(i);
}
System.out.println("iterating the values");
for(String s : map.values()) {

System.out.println(s);
}

System.out.println("iterating the keys and values ");
for(Integer i : map.keySet()) {

System.out.println(i+ ": "+ map.get(i));
}
	}

@Test

public void wordCount() {
String sent = "count the repeating strings in the sentence of strings ";
//String cString = "ttesting Software test ";
//I want to split the sentance in o words and store it in an array

//char[] ch = cString.toCharArray();
String[] words =sent.split(" ");



Map<String,Integer> wc = new HashMap<String,Integer>();

//for(String w :words)
for(int i =0;i<words.length;i++)
{
	
	if(wc.containsKey(words[i])) {
		//if I already have an entry increment the count by 1
		wc.put(words[i], wc.get(words[i])+1);
		
	}
	else
		wc.put(words[i], 1);
	
	
}
System.out.println(wc);








}
}