package programpractice;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

public class RepeatingWordCount {

	@Test
	public void wordCount() {
		String sent = "count the repeating strings in the sentence of strings ";
		// String cString = "ttesting Software test ";
		// I want to split the sentance into words and store it in an array

		// char[] ch = cString.toCharArray();
		String[] words = sent.split(" ");

		Map<String, Integer> wc = new HashMap<String, Integer>();

		// for(String w :words)
		for (int i = 0; i < words.length; i++) {

			if (wc.containsKey(words[i])) {
				// if I already have an entry increment the count by 1
				wc.put(words[i], wc.get(words[i]) + 1);

			} else
				wc.put(words[i], 1);

		}
		System.out.println(wc);

	}

	@Test
	public void repeatingWord() {
		/*
		 * store value in String word.toCharArray(); ----------->toCharArray() method
		 * converts the given string into a sequence of characters. Map<Character,
		 * Integer> hashMap = new HashMap<Character, Integer>();
		 * ---------------->Declaring a HashMap of <Character, Integer> for each
		 * method--------->for(CollectionType individualele:collections) containsKey()
		 * ------->method checks if the mapping for the specified key is present in the
		 * hashmap.
		 * 
		 * 
		 * 
		 */

		String Word = "liril";

		char[] singleLetter = Word.toCharArray();
		Map<Character, Integer> reaptedWords = new HashMap<Character, Integer>();
		// for(int i=0; i<singleLetter.length; i++)

		for (char w : singleLetter) {

			if (reaptedWords.containsKey(w)) {
				reaptedWords.put(w, reaptedWords.get(w) + 1);
				
			} else

				reaptedWords.put(w, 1);
		}

		System.out.println(reaptedWords);

	}

	@Test
	public void reversingWordNew() {
		String Word = "learning";

		/*
		 * store value in string word.length()-1 ----->find the length of the array
		 * Word.charAt(i) -----------> charAt() method returns the character at the
		 * specified index in a string
		 * 
		 * 
		 * 
		 */
		System.out.println(Word.length() - 1);

		for (int i = Word.length() - 1; i >= 0; i--) {

			System.out.print(Word.charAt(i));
		}
		System.out.println();
	}

	@Test
	public void reversingWord() {
		String Word = "learning";
		// Char[] inputArray= Word.split(null);
		// char[] inputArray = Word.toCharArray();

		// Map<Character,Character> wc = new HashMap<Character,Character>();
		// char[] reverseWord = Word.toCharArray();

		for (int i = Word.length() - 1; i >= 0; i--) {

			System.out.print(Word.charAt(i));
		}
		System.out.println();
	}

	/*
	 * @Test public void reversingWord() { String Word = "learning"; //Char[]
	 * inputArray= Word.split(null); char[] inputArray = Word.toCharArray();
	 * 
	 * Map<Character,Character> wc = new HashMap<Character,Character>(); /*for(char
	 * w :inputArray ) {
	 * 
	 * for(int i=inputArray.length-1; i>0; i-- ) {
	 * 
	 * wc.containsKey(w);
	 * 
	 * }
	 * 
	 * 
	 * 
	 * }
	 * 
	 * System.out.println("Reversed string is: " + wc);
	 * 
	 * 
	 * 
	 * 
	 * for(int i=inputArray.length-1; i>=0; i-- ) {
	 * if(wc.containsKey(inputArray[i])) { //if I already have an entry increment
	 * the count by 1 wc.put(inputArray[i], wc);
	 * 
	 * }
	 * 
	 * System.out.println(wc);
	 * 
	 * }
	 * 
	 * 
	 * }}
	 */
}