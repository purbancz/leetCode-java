package main.java.leetCode.Easy;

public class RemoveOutermostParentheses {

	public String removeOuterParentheses(String S) {
		StringBuilder sb = new StringBuilder();
		int left = 0;
		int right = 0;
		int end = 0;
		for (int i = 0; i < S.length(); i++) {
			if (S.substring(i, i + 1).equals("(")) {
				left++;
			}
			if (S.substring(i, i + 1).equals(")")) {
				right++;
			}
			if (left != 0 && left == right) {
				sb.append(S.substring(end + 1, i));
				end = i+1;
			}
		}
		return sb.toString();
	}

}
