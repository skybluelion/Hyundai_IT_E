package lamda.expression.e4;

interface A {
	void abc(int k);
}

public class type1 {

	public static void main(String[] args) {
		//1. 익명 이너 클래스
		A a1 = new A() {
			@Override
			public void abc(int k) {
				System.out.println(k);
			}
		};
		//2. 람다식으로 표현
		A a2 = (int k) -> {
			System.out.println(k);
		};
		//3. 인스턴스 메서드 참조
		A a3 = System.out::println;
		a1.abc(3);
		a2.abc(3);
		a3.abc(3);
	}

}
