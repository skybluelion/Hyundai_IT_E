import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//BOJ2468
public class Main {
	
	static int[][] map;
	static int[][] isVisited;
	static int N;
	static int[] dx = {-1, 1,  0, 0};
	static int[] dy = { 0, 0, -1, 1};
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st;
		
		N = Integer.parseInt(br.readLine());
		map = new int[N][N];
		isVisited = new int[N][N];
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < N; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int max = 1;
		int result = 0;
		for(int h = 2; h <= 100; h++) {
			result = DFS(h); 
			if(result > max) max = result;
		}
		
	}
	
	public static int DFS(int h) {
		
		
		
		return 0;
	}
}
