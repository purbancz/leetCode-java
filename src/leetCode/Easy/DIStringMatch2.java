package leetCode.Easy;

import java.util.Arrays;

public class DIStringMatch2 {

	public static int[] diStringMatch2(String S) {

		int lower = 0, upper = S.length();
		int array[] = new int[S.length() + 1];
		int iter = 0;

		for (char c : S.toCharArray()) {
			if (c == 'I')
				array[iter++] = lower++;
			else
				array[iter++] = upper--;
		}
		array[S.length()] = lower;

		return array;

	}

	public static void main(String[] args) {

		String dupa = "IDIDDDID";
		System.out.println(Arrays.toString(diStringMatch2(dupa)));

	}
}