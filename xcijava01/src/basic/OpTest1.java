package basic;

public class OpTest1 {

	public static void main(String[] args) {
		int a = 7, b = 4;
		System.out.println(a+ "+" + b + "=" + (a + b));
		System.out.println(a+ "-" + b + "=" + (a - b));
		System.out.println(a+ "*" + b + "=" + (a * b));
		System.out.println(a+ "/" + b + "=" + (a / b)); // 정수 / 정수 = 정수
		System.out.println(a+ "/" + b + "=" + ((double)a / b)); // (double)정수 / 정수 = 소수
		System.out.println(a+ "%" + b + "=" + (a % b));
		
		/*
		 * 7+4=11
			7-4=3
			7*4=28
			7/4=1
			7/4=1.75
			7%4=3
		 */
	}

}
