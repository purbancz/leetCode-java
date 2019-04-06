package leetCode.Easy;

public class PeakIndexInAMountainArray {

//	Let's call an array A a mountain if the following properties hold:
//
//	A.length >= 3
//	There exists some 0 < i < A.length - 1 such that A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1]
//	Given an array that is definitely a mountain, return any i such that A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1].

	public int peakIndexInMountainArray(int[] A) {
		int peak = 0;
		for (int i = 0; i < A.length - 1; i++) {
			if (A[i] > A[i + 1]) {
				peak = i;
				break;
			} else {
				peak = A.length - 1;
			}
		}
		return peak;

	}

}
