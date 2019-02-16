package leetCode;

public class NRepeatedElementinSize2NArray {
	public static int repeatedNTimes(int[] A) {
		// HashMap<Integer,Integer> map = new HashMap<>();
		int result = 0;
		for (int i = 0; i < A.length; i++) {
			for (int j = i + 1; j < A.length; j++) {
				if (A[i] == A[j]) {
					result = A[i];
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 3 };
		System.out.println(repeatedNTimes(array));
	}

}
