package userexception3;

//점수가 음수일 때 예외 발생
class MinusException extends Exception{
	public MinusException() {
		super();
	}
	public MinusException(String message) {
		super(message);
	}
}

// 점수가 100점을 초과할 때 예외 발생
class OverException extends Exception{
	public OverException() {
		super();
	}
	public OverException(String message) {
		super(message);
	}
}

class A{
	void checkScore(int score) throws MinusException, OverException{
		if(score < 0) {
			throw new MinusException("예외 발생: 음숫값 입력");
		}
		else if(score > 100)
			throw new OverException("예외 발생: 100점 초과");
		else
			System.out.println("정상적인 값입니다.");
	}
}

public class UserExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		try {
			a.checkScore(85);
			a.checkScore(150);
			a.checkScore(-13); // 이미 윗줄에서 예외발생해서 try블럭을 빠져나가 예외처리가 안됨.
		} catch (MinusException | OverException e) {
			System.out.println(e.getMessage());
		}
	}

}
