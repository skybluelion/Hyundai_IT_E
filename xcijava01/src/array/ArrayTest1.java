package array;

import java.util.Arrays;

public class ArrayTest1 {

	public static void main(String[] args) {

//		int[] n = new int[3]; //heap 영역에 4바이트(int)를 3개 만듬. 동적할
//		n[0] = 100;
//		n[1] = 100;
//		n[2] = 100;
	
		int[] n = {100, 200, 300};
		
		for(int i = 0; i < n.length; i++) {
			System.out.println(n[i]);
		}
		
		System.out.println(Arrays.toString(n));
		
		for (int temp : n) {
			System.out.println(temp);
		}
		
	}

}
