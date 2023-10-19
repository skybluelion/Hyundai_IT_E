import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	static int[] arr;
	static int sum, N;
	static int min = Integer.MAX_VALUE;
	static boolean[] isVisited;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		arr = new int[N];
		
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		sum = 0;
		
		for(int i = 0; i < N; i++) {
			sol(i, 1);			
		}
		System.out.println(min);
	}
	
	public static void sol(int startIdx, int cnt) {
		
		
		if(cnt == N) {
			min = Math.min(min, sum);
			return;
		}
		
		for(int i = 0; i < N; i++) {
			sum += arr[i] + sum;
			sol(startIdx, i);
		}
	}
}
