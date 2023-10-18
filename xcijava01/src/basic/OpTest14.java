package basic;

public class OpTest14 {

	public static void main(String[] args) {
		double n = 10; //묵시적 형변환- 자동 형변환
		System.out.println(n); // 10.0
		
		int p = (int) 3.84; //명시적 형변환 - 강제 형변환
		System.out.println(p);// 3 버림
		
	}

}
