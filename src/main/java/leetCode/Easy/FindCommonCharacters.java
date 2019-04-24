package main.java.leetCode.Easy;

import java.util.ArrayList;
import java.util.List;

public class FindCommonCharacters {
	public List<String> commonChars(String[] A) {
		List<String> stringList = new ArrayList<String>();
		List<String> stringListNew = new ArrayList<String>();
		for (char ch : A[0].toCharArray()) {
			stringList.add(String.valueOf(ch));
		}
		for (int i = 1; i < A.length; i++) {
			for (char ch : A[i].toCharArray()) {
				if (stringList.contains(String.valueOf(ch))) {
					stringListNew.add(String.valueOf(ch));
					stringList.remove(String.valueOf(ch));
				}
			}
			stringList.clear();
			stringList.addAll(stringListNew);
			stringListNew.clear();
		}
	return stringList;
	}

}
