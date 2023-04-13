import java.util.HashMap;
import java.util.Map;

public class RepeatedWordCount {

	
	public void repeatAlpha() {
	String Word = "selenium learning";

	char[] singleLetter = Word.toCharArray();
	Map<Character, Integer> reaptedWords = new HashMap<Character, Integer>();
	

	for (char w : singleLetter) {

		if (reaptedWords.containsKey(w)) {
			reaptedWords.put(w, reaptedWords.get(w) + 1);
			
		} else

			reaptedWords.put(w, 1);
	}

	System.out.println(reaptedWords);
foreach
}
	
}

