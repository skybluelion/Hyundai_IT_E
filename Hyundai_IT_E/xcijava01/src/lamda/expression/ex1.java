package lamda.expression;

interface A{
	void abc();
	//구현
}

class B implements A{

	@Override
	public void abc() {
		System.out.println("메서드 내용 1");
	}
	
}

public class ex1 {

	public static void main(String[] args) {
		//1. 객체 지향 프로그래밍 문법 1
		A a1 = new B();
		a1.abc(); //메서드 내용
		// 2. 객체 지향 프로그래밍 문법 2(익명이너 클래스 사용)
		A a2 = new A() {
			@Override
			public void abc() {
				System.out.println("메서드 내용 2");
			}
		};
		
		a2.abc(); //메서드 내용
		//3. 함수형프로그래밍 문법 (람다식)
		A a3 = () -> {System.out.println("메서드 내용 3");};
		a3.abc();
	}

}
