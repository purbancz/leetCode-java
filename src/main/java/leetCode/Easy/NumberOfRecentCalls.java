package main.java.leetCode.Easy;

import java.util.ArrayList;

public class NumberOfRecentCalls {

	ArrayList<Integer> calls;



	public NumberOfRecentCalls() {
		this.calls = new ArrayList<>();
	}


	public int pingrev(int t) {
		calls.add(t);

		int temp = 0;
		for (int i = calls.indexOf(t); i >= 0; i--) {
			if (calls.get(i) < t - 3000) {
				temp = i + 1;
				break;
			}
		}
		return calls.indexOf(t) - temp + 1;

	}

}
