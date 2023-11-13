package control;

import java.util.Scanner;

public class SwitchTest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("0~100 점수를 입력해주세요 : ");
		int n = sc.nextInt();
		
		switch(n / 10) {
			case 10, 9: //최신 버전 자바에서만 가능
				System.out.println("A");
				break;
			case 8:
				System.out.println("B");
				break;
			case 7:
				System.out.println("C");
				break;
			case 6:
				System.out.println("D");
				break;
			case 5, 4, 3, 2, 1, 0:
				System.out.println("F");
				break;
			default :
				System.out.println("점수를 다시 입력해주세요.");
				break;
		}
	}
}
