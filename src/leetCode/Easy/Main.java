package leetCode.Easy;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		SelfDividingNumbers selfDivid = new SelfDividingNumbers();
		List<Integer> list = selfDivid.selfDividingNumbers(1, 22);
		System.out.println(Arrays.toString(list.toArray()));

	}

}
