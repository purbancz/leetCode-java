package main.java.leetCode.Easy;

//Given an array A of non-negative integers, half of the integers in A are odd, and half of the integers are even.
//Sort the array so that whenever A[i] is odd, i is odd; and whenever A[i] is even, i is even.
//You may return any answer array that satisfies this condition.

public class SortArrayByParityII {
	public int[] sortArrayByParityII(int[] A) {
		for (int i = 0; i < A.length; i++) {
			if (i % 2 != A[i] % 2) {
				for (int j = i; j < A.length; j++) {
					if (i % 2 == A[j] % 2) {
						int temp = A[i];
						A[i] = A[j];
						A[j] = temp;
						break;
					}
				}
			}
		}
		return A;

	}
}
