package control;

import java.util.Scanner;

public class IfTest1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("0~100 사이의 점수를 입력해 주세요 : ");
		int score = sc.nextInt();
		
		
		if(score == 100)	System.out.println("A+");
		else if(score >= 90 && score < 100) System.out.println("A");
		else if(score >= 80 && score <  90) System.out.println("B");
		else if(score >= 70 && score <  80) System.out.println("C");
		else if(score >= 60 && score <  70) System.out.println("D");
		else if(score >=  0 && score <  60) System.out.println("F");
		else System.out.println("0~100 사이의 점수를 입력해 주세요");
		
		  
	}

}
