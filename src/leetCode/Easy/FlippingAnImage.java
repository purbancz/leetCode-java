package leetCode.Easy;

import java.util.Arrays;

public class FlippingAnImage {

	public static int[][] flipAndInvertImage(int[][] A) {
		int size = A.length;
		int[][] B = new int[size][size];
		for (int j = 0; j < size; j++) {
			for (int i = size-1; i >= 0; i--) {
                if (A[j][i] == 1) {
                    A[j][i] = 0;
                } else {
                    A[j][i] = 1;
                }
				B[j][Math.abs(i - (size-1))] = A[j][i];
			}
		}
		return B;
	}

	public static void main(String[] args) {

		int[][] arr = { { 1, 1, 0 }, { 1, 0, 1 }, { 0, 0, 0 } };
		System.out.println(Arrays.deepToString(flipAndInvertImage(arr)));
		
		for (int i = arr.length-1; i >= 0; i--) {
			System.out.println(i);
		}

	}

}
