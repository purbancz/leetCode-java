package main.java.leetCode.App;

import main.java.leetCode.Easy.FindCommonCharacters;

public class Main {

	public static void main(String[] args) {
		
		FindCommonCharacters obj = new FindCommonCharacters();
		
		String[] str = {"bella","label","roller"};
		String[] str2 = {"cool","lock","cook"};
		System.out.println(obj.commonChars(str));
		System.out.println(obj.commonChars(str2));
	}
}
