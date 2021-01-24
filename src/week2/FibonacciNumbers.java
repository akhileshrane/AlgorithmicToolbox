package week2;
import java.util.Scanner;

public class FibonacciNumbers {
	static long fibonacciRecursSlow(int n) {
		if(n<=1) {
			return n;
		} else {
			return fibonacciRecursSlow(n-1) + fibonacciRecursSlow(n-2);
		}
	}
	
	static double fibonacciFast(int n) {
		double[] arr = new double[n];
		
		for(int i = 0; i < n; i++) {
			if(i<=1) {
				arr[i]=i;
			} else {
				arr[i] = arr[i-1] + arr[i-2];
			}
		}
		return arr[n-1];
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		long startTime = System.nanoTime();
		long endTime = System.nanoTime();
		long timeTaken = endTime-startTime;
		
		//long fib = fibonacciRecursSlow(n); //takes tens of thousands of years for T(100) on a 1Ghz computer.
		double fib = fibonacciFast(n); //takes a blink of an eye for T(100) on a 1Ghz computer. 
		
		
		System.out.println("Result: "  + fib + " Time taken:" + timeTaken + " ns");
	}
}
