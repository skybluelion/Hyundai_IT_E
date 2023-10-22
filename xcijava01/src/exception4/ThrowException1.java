package exception4;

// 1. 하위 메서드에 직접 예외를 처리할 때
class A {
	void abc() {
		bcd();
	}
	void bcd(){
		try {
			Thread.sleep(1000); //일반 예외 : InterruptedException
		} catch (InterruptedException e) {
			// 예외 처리 구문
		}
	}
}

//2. 예외를 호출 메서드로 전가할 때
class B {
	void abc() {
		try {
			bcd(); // 일반예외: InterruptedException
		} catch (InterruptedException e) {
			// 예외처리 구문
		}
	}
	
	void bcd() throws InterruptedException{
		Thread.sleep(1000); // 일반예외: InterruptedException
	}
}

public class ThrowException1 {

	public static void main(String[] args) {
		
	}

}
