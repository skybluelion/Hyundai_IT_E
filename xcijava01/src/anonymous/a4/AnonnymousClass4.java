package anonymous.a4;

interface A{
	public abstract void abc();
}
class C{
	void cde(A a) {
		a.abc();
	}
}

public class AnonnymousClass4 {

	public static void main(String[] args) {
		C c = new C();
		//방법 3. 클래스 명 X + 참조변수명 O
		A a = new A() {
			public void abc() {
				System.out.println("입력매개변수 전달1");
			}
		};
		c.cde(a);
		//방법 4. 클래스명 X + 참조 변수명 X
		c.cde(new A() {
			public void abc() {
				System.out.println("입력매개변수 전달2");
			}
		});
	}

}
