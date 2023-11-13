package lamda.expression.e6;

interface A{
	void abc(B b, int k);
}
class B{
	 void bcd(int k) {
		System.out.println(k);
	}
}

public class RefOfStaticMethod {

	public static void main(String[] args) {
		//1. 익명 이너 클래스
		A a1 = new A() {
			@Override
			public void abc(B b, int k) {
				b.bcd(k);
			}
		};
		//2. 람다식으로 표현
		A a2 = (B b, int k) -> {b.bcd(k);};
		//3. 정적 메서드 참조
		A a3 = B::bcd;
		a1.abc(new B(), 3);
		a2.abc(new B(), 3);
		a3.abc(new B(), 3);
	}

}
