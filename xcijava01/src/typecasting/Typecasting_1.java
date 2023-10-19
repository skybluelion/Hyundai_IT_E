package typecasting;

class A{}
class B extends A{}
class C extends B{}
class D extends B{}


public class Typecasting_1 {

	public static void main(String[] args) {
		//업캐스팅(자동변환) : 캐스팅 구문을 생략했을 때, 컴파일러가 자동으로 추가
		A ac = (A) new C(); // C -> A 업캐스팅(자동 변환)
		
		B bc = (B) new C(); // C -> B 업캐스팅
		
		B bb = new B();
		A a = (A) bb; // B->A업캐스팅
		
		//다운캐스팅(수동 변환) : 캐스팅할 수 없을 때(실행 할 때 예외 발생)
		A ab = new B();
		B b = (B) ab; //A->B 다운캐스팅
//		C c =  (C) ab; //A-> C 다운캐스팅 불가
		
		B bd = new D();
		D d = (D) bd; //	B->D
		
		A ad = new D();
		B b1 = (B) ad;	//A->B
		D d1 = (D) ad;	// A ->D
		
		
	}

}
