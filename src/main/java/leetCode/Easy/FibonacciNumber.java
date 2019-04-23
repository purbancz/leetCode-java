package main.java.leetCode.Easy;

//F(0) = 0,   F(1) = 1
//F(N) = F(N - 1) + F(N - 2), for N > 1.


public class FibonacciNumber {
	public int fib(int N) {
		if (N == 0) {
			return 0;
		}
		if (N == 1) {
			return 1;
		}
		return fib(N-1)+fib(N-2);

	}
}
