package method;

public class MethodTest3 {

	public static void main(String[] args) {
		// method overloading 메서드 오버로딩 메서드 중복정의
		print(1);
		print(2,3);
		print(4,5,6);
		
	}

	//가변형 메소드
	//배열 형태로 매개변수를 받음
	private static void print(int... i) {
		for(int j = 0; j < i.length; j++) {
			System.out.print(i[j]);
		}
		System.out.println();
	}
	
	
	
	/*
	private static void print(int i, int j, int k) {
		System.out.println(i +" " + j + " " + k);
		
	}

	private static void print(int i, int j) {
		System.out.println(i +" " + j);
	}

	private static void print(int i) {
		System.out.println(i);
	}
*/
}
