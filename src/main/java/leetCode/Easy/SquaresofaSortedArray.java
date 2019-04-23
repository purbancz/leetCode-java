package main.java.leetCode.Easy;

public class SquaresofaSortedArray {
    public int[] sortedSquares(int[] A) {
        for (int i = 0; i < A.length; i++) {
            A[i] = A[i]*A[i];
        }
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length - 1; j++) {
                if (A[j+1] < A[j]) {
                    int temp = A[j];
                    A[j] = A[j+1];
                    A[j+1] = temp;
                }
            }
        }
    return A;
    }
}