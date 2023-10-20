package inner3;

class A {
	int a = 3;
	static int b = 4;
	void method1() {
		System.out.println("instance method");
	}
	static void method2() {
		System.out.println("static method");
	}
	
	//정적 이너 클래스
	static class B{
		void bcd() {
			//필드 사용
			//System.out.println(a); 정적이너 클래스는 아우터 클래스의 정적 멤버만 사용가능.
			System.out.println(b);
			//메서드 호출
			//method1(); 정적이너 클래스는 아우터 클래스의 정적 멤버만 사용가능.
			method2();
		}
	}
}


public class OuterClass2 {

	public static void main(String[] args) {
		//정적 이너 클래스의 객체 생성
		A.B b = new A.B();
		//메서드 호출
		
		b.bcd();
	}

}
