package main.java.leetCode.Easy;

public class JewelsandStones {

	public static void main(String[] args) {

	
	
	System.out.println(numJewelsInStones("aA", "aAAbbbb"));
}

	private static int numJewelsInStones(String string, String string2) {
		int js = 0;
		for (int i = 0; i < string2.length(); i++) {
			if (string.indexOf(string2.charAt(i)) != -1) {
				js++;
			}
		}
		return js;
		
	}

}
