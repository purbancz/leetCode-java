package main.java.leetCode.Easy;

public class RobotReturntoOrigin {
	public static boolean judgeCircle(String moves) {
		int ns = 0;
		int we = 0;
		for (char c : moves.toCharArray()) {
			if (c == 'U') ns++;
			if (c == 'D') ns--;
			if (c == 'R') we++;
			if (c == 'L') we--;
			
		}
		System.out.println(ns);
		System.out.println(we);
		if (ns == 0 && we == 0) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		System.out.println(judgeCircle("UDUDUULRLRRRLLL"));
	}
}
