package java.leetCode.Easy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DIStringMatch {

	public static int[] diStringMatch(String S) {
		int mod = S.length() - S.replaceAll("I", "").length();
		int[] results = new int[S.length() + 1];
		results[S.length()] = mod;
		List<Integer> range = IntStream.rangeClosed(0, S.length()).boxed().collect(Collectors.toList());
		range.remove(Integer.valueOf(mod));
		for (int i = S.length()-1; i > -1; i--) {
			int d = 0;

			if ('I' == S.charAt(i)) {
				d = results[i+1]-1;
				while (!range.contains(d)) {
					d--;
				}
				results[i] = d;
				range.remove(Integer.valueOf(results[i]));
		
			}
			if ('D' == S.charAt(i)) {
				d = results[i+1]+1;
				while (!range.contains(d)) {
					d++;
				}
				results[i] = d;
				range.remove(Integer.valueOf(results[i]));

			}
		}

		return results;

	}

	public static void main(String[] args) {
		String dupa = "IDIDDDIDIIIDIDIDIDIIDIIIIDIIIDIIIDIIDID";
		System.out.println(Arrays.toString(diStringMatch(dupa)));


	}

}
