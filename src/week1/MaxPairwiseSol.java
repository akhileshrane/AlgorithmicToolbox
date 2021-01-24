package week1;
import java.util.*;
import java.io.*;

public class MaxPairwiseSol {

	static int getMaxPairwiseProduct(int[] numbers) {
		int maxProduct = 0;
		int n = numbers.length;

		for (int first = 0; first < n; ++first) {
			for (int second = first + 1; second < n; ++second) {
				maxProduct = Math.max(maxProduct,
						numbers[first] * numbers[second]);
			}
		}

		return maxProduct;
	}

	static long getMaxPairwiseProductFast(int[] numbers){

		int maxIndex1 = -1;
		int maxIndex2 = -1;
		for(int i=0;i<numbers.length;i++){
			if(maxIndex1==-1 || numbers[i]>numbers[maxIndex1]){
				maxIndex1=i;
			}
		}

		for(int j=0;j<numbers.length;j++){
			if(j!=maxIndex1 && (maxIndex2==-1 || numbers[j]>numbers[maxIndex2])){
				maxIndex2=j;
			}
		}
		
		return (long)numbers[maxIndex1]*numbers[maxIndex2];
	}

	public static void main(String[] args) {
		FastScanner scanner = new FastScanner(System.in);
		int n = scanner.nextInt();
		int[] numbers = new int[n];
		for (int i = 0; i < n; i++) {
			numbers[i] = scanner.nextInt();
		}
		System.out.println(getMaxPairwiseProductFast(numbers));
	}

	static class FastScanner {
		BufferedReader br;
		StringTokenizer st;

		FastScanner(InputStream stream) {
			try {
				br = new BufferedReader(new
						InputStreamReader(stream));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		String next() {
			while (st == null || !st.hasMoreTokens()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}
	}

}
