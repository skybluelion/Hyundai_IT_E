package trycatch1;

public class TryCatch4 {

	public static void main(String[] args) {

		//1. catch블록을 각각 처리했을 때
		try {
			System.out.println(3 / 1);
			int num = Integer.parseInt("10A");
		} catch (ArithmeticException e) {
			System.out.println("예외가 발생했습니다.");
		} catch (NumberFormatException e) {
			System.out.println("예외가 발생했습니다.");
		}
		
		//2.catch 블록을 하나로 통합했을 때
		try {
			System.out.println(3 / 1);
			int num = Integer.parseInt("10A");
		} catch (ArithmeticException | NumberFormatException e) {
			System.out.println("예외가 발생했습니다.");
		}
		
	}

}
