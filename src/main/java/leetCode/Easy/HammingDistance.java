package main.java.leetCode.Easy;

public class HammingDistance {
	public int hammingDistance(int x, int y) {
		String xStr = Integer.toBinaryString(x);
		String yStr = Integer.toBinaryString(y);
		int ham = 0;
		if (xStr.length() < yStr.length() ) {
			while (xStr.length() < yStr.length()) {
				xStr = "0" + xStr;
			}
		} else  {
			while (xStr.length() > yStr.length()) {
				yStr = "0" + yStr;
			}
		}
		
		for (int i = 0; i < xStr.length(); i++) {
			if (xStr.charAt(i) != yStr.charAt(i)) {
				ham++;
			}
		}
		return ham;
	}

}
