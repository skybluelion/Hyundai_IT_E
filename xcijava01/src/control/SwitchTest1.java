package control;

public class SwitchTest1 {
	public static void main(String[] args) {
		int n = 3;
		switch (n) {
		case 1, 3:
			System.out.println("남자입니다.");
			break;
		case 2, 4:
			System.out.println("여자입니다.");
			break;
		default :
			System.out.println("error");
			break;
		}
		
		switch (n) {
		case 1:
		case 3:
			System.out.println("남자입니다.");
			break;
		case 2:
		case 4:
			System.out.println("여자입니다.");
			break;
		default :
			System.out.println("error");
			break;
		}
		
	}

}
