package programpractice;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.testng.annotations.Test;

import constructor.Student;

public class TreeMapSuganyaTryProgram {

	@Test
	public void tc1() {
		
		//1.Write a Java program to associate the specified value with the specified key in a Tree Map.
		
		try {
			TreeMap<String, String> EmployeeTreeMap = new TreeMap<String, String>();
			
			EmployeeTreeMap.put("attur", "Salem");
			EmployeeTreeMap.put("valapaddy", "Salem");
			EmployeeTreeMap.put("minampali", "Salem");
			EmployeeTreeMap.put("kirshnawaram", "Salem");
			
			System.out.println(EmployeeTreeMap);
			
			for ( Map.Entry element : EmployeeTreeMap.entrySet()) {
				
				System.out.println(element.getKey() + " : " +element.getValue());
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
		
		@Test
		public void tc2() {
			
			//2.Write a Java program to copy a Tree Map content to another Tree Map. 
			
			try {
				TreeMap<String, String> EmployeeTreeMap = new TreeMap<String, String>();
				
				EmployeeTreeMap.put("attur", "Salem");
				EmployeeTreeMap.put("valapaddy", "Salem");
				EmployeeTreeMap.put("minampali", "Salem");
				EmployeeTreeMap.put("kirshnawaram", "Salem");
				
				System.out.println(EmployeeTreeMap);
				TreeMap<String, String> newCopyMap = new TreeMap<String, String>();
				newCopyMap.putAll(EmployeeTreeMap);
				
				System.out.println("The new copymap is : " + newCopyMap);
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		
		
		
		
	}
	
	
		@Test
		public void tc3() {
			
			//3.Write a Java program to search a key in a Tree Map.  
			
			try {
				TreeMap<String, String> EmployeeTreeMap = new TreeMap<String, String>();
				
				EmployeeTreeMap.put("attur", "Salem");
				EmployeeTreeMap.put("valapaddy", "Salem");
				EmployeeTreeMap.put("minampali", "Salem");
				EmployeeTreeMap.put("kirshnawaram", "Salem");
				
				System.out.println(EmployeeTreeMap);
			System.out.println(EmployeeTreeMap.containsKey("kirshnawaram"));
			
			if(EmployeeTreeMap.containsKey("vinayagapuram")) {
				System.out.println("The key are presented in our map " );
				}
				else {
					
					System.out.println("The key are not presented in our map " );
					
				}
				
				} catch (Exception e) {
				
				e.printStackTrace();
			}
		
		
}
		
		@Test
		public void tc4() {
			
			//4.Write a Java program to search a value in a Tree Map.  
			
			try {
				TreeMap<String, String> EmployeeTreeMap = new TreeMap<String, String>();
				
				EmployeeTreeMap.put("attur", "Salem");
				EmployeeTreeMap.put("valapaddy", "Salem");
				EmployeeTreeMap.put("minampali", "Salem");
				EmployeeTreeMap.put("kirshnawaram", "Salem");
				
				System.out.println(EmployeeTreeMap);
			System.out.println(EmployeeTreeMap.containsValue("salem"));
			
			if(EmployeeTreeMap.containsKey("vinayagapuram")) {
				System.out.println("The value are presented in our map " );
				}
				else {
					
					System.out.println("The value are not presented in our map " );
					
				}
				
				} catch (Exception e) {
				
				e.printStackTrace();
			}
		
}
		@Test
	public void tc5() {
			
		//5.Write a Java program to get all keys from the given a Tree Map.
		try {
			TreeMap<String, String> EmployeeMap = new TreeMap<String, String>();
			
			EmployeeMap.put("tenth", "vanni vikas");
			EmployeeMap.put("second", "vanni vikas");
			EmployeeMap.put("third", "vanni vikas");
			EmployeeMap.put("fifth", "vanni vikas");
			
			System.out.println(EmployeeMap.keySet());
			
			Set<String> Keys = EmployeeMap.keySet();
			for (String key : Keys) {
				
				System.out.println("All the key values are : " +key);
				
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		}
		

		@Test
	public void tc6() {
		//6.Write a Java program to delete all elements from a given Tree Map
			try {
				TreeMap<String, String> EmployeeMap = new TreeMap<String, String>();
				
				EmployeeMap.put("tenth", "vanni vikas");
				EmployeeMap.put("second", "vanni vikas");
				EmployeeMap.put("third", "vanni vikas");
				EmployeeMap.put("fifth", "vanni vikas");
				
				System.out.print(EmployeeMap);
				EmployeeMap.clear();
				
				System.out.print(EmployeeMap);
				
			
			}
			
                  
		catch (Exception e) {
			
			e.printStackTrace();
		}	
	}
		
		
		
		@Test
		public void tc7() {
			//7.Write a Java program to sort keys in Tree Map by using comparator. 
				try {
					TreeMap<String, String> EmployeeMap = new TreeMap<String, String>();
					
					EmployeeMap.put("C2", "Red");
					EmployeeMap.put("C4", "Green");
					EmployeeMap.put("C3", "Black");
					EmployeeMap.put("C1", "White");
					
					System.out.print(EmployeeMap);
					
				class sortKey implements Comparator<String>{
					
					public int compare (String s1, String s2) {
						
						return s1.compareTo(s2);}
					}	
				
				}
				
	                  
			catch (Exception e) {
				
				e.printStackTrace();
			}	
		}
				
		
		@Test
		public void tc8() {
			//8.Write a Java program to get a key-value mapping associated with the greatest key and the least key in a map.  
				try {
					TreeMap<String, String> EmployeeMap = new TreeMap<String, String>();
					
					EmployeeMap.put("50", "Red");
					EmployeeMap.put("30", "Green");
					EmployeeMap.put("20", "Black");
					EmployeeMap.put("10", "White");
					
					System.out.println("The Original TreeMap contains :" + EmployeeMap);
					System.out.println("The greatest TreeMap contains :" + EmployeeMap.firstEntry());
					System.out.println("The least TreeMap contains :" + EmployeeMap.lastEntry());
					
				
				}
				
	                  
			catch (Exception e) {
				
				e.printStackTrace();
			}	
		}
		
		
		
		
		@Test
		public void tc9() {
			//9.Write a Java program to get the first (lowest) key and the last (highest) key currently in a map.  
				try {
					TreeMap<String, String> EmployeeMap = new TreeMap<String, String>();
					
					EmployeeMap.put("50", "Red");
					EmployeeMap.put("30", "Green");
					EmployeeMap.put("20", "Black");
					EmployeeMap.put("10", "White");
					
					System.out.println("The Original TreeMap contains :" + EmployeeMap);
					System.out.println("The Greatest key :" + EmployeeMap.firstKey());
					System.out.println("The Least key :" + EmployeeMap.lastKey());
					
				
				}
				
	                  
			catch (Exception e) {
				
				e.printStackTrace();
			}	
		}
		
		
		@Test
		public void tc10() {
			//10.Write a Java program to get a reverse order view of the keys contained in a given map.  
				try {
					TreeMap<String, String> EmployeeMap = new TreeMap<String, String>();
					
					EmployeeMap.put("50", "Red");
					EmployeeMap.put("30", "Green");
					EmployeeMap.put("20", "Black");
					EmployeeMap.put("10", "White");
					
					System.out.println("The Original TreeMap contains :" + EmployeeMap);
					System.out.println("The reverse order view of the key :" + EmployeeMap.descendingKeySet());
					
					
				
				}
				
	                  
			catch (Exception e) {
				
				e.printStackTrace();
			}	
		}
		
		

		@Test
		public void tc11() {
			//11.Write a Java program to get a key-value mapping associated with the greatest key less than or equal to the given key.
			
			try {
					TreeMap<Integer, String> EmployeeMap = new TreeMap<Integer, String>();
					
					EmployeeMap.put(50, "Red");
					EmployeeMap.put(30, "Green");
					EmployeeMap.put(20, "Black");
					EmployeeMap.put(10, "White");
					System.out.println("The Original TreeMap contains :" + EmployeeMap);
					System.out.println("The Greatest key :" + EmployeeMap.firstKey());
					System.out.println("The Least key :" + EmployeeMap.lastKey());
					
					
				
				}
				
	                  
			catch (Exception e) {
				
				e.printStackTrace();
			}	
		}
			
		
		@Test
		public void tc12() {
			//12.Write a Java program to get the greatest key less than or equal to the given key.
			
			try {
					TreeMap<Integer, String> EmployeeMap = new TreeMap<Integer, String>();
					
					EmployeeMap.put(50, "Red");
					EmployeeMap.put(30, "Green");
					EmployeeMap.put(20, "Black");
					EmployeeMap.put(10, "White");
					
					System.out.println("The Original TreeMap contains :" + EmployeeMap);
					System.out.println("checking the entry for 10 :");
					System.out.println("The value is  :" + EmployeeMap.floorEntry(10));
					System.out.println("checking the entry for 40 :");
					System.out.println("The value is  :" + EmployeeMap.floorEntry(40));
					System.out.println("checking the entry for 26 :");
					System.out.println("The value is  :" + EmployeeMap.floorEntry(26));
					
				
				}
				
	                  
			catch (Exception e) {
				
				e.printStackTrace();
			}	
		}
}

