package leetCode;

import java.util.HashSet;
import java.util.Set;

public class UniqueMorseCodeWords {
	public static int uniqueMorseRepresentations(String[] words) {
        Set<String> morseSet = new HashSet<>();
        String[] morseCode = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        for (String s : words) {
            String morse = "";
            for (int i = 0; i < s.length(); i++) {
                morse = morse + morseCode[(int)s.charAt(i) - (int)'a'];
            }
            morseSet.add(morse);
        }
        return morseSet.size();
    }
	
	public static void main(String[] args) {
		String[] test = {"gin", "zen", "gig", "msg"};
		System.out.println(uniqueMorseRepresentations(test));
		System.out.println(test.toString());
	}
	
	

}
