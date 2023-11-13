package control;

public class WhileTest3 {

	public static void main(String[] args) {
		// 구구단
		int lineIdx = 0;
		int firstNum = 2;
		int secondNum = 1;
		
		while(lineIdx < 2) {
			secondNum = 1;
			while(secondNum < 10) {
				firstNum = 2;
				while(firstNum < 6) {
					System.out.print(firstNum + lineIdx*4 + "*" + secondNum + 
							"=" + (firstNum + lineIdx*4)*secondNum + "\t");
					firstNum++;
				}
				secondNum++;
				System.out.println();
			}
			System.out.println();
			lineIdx++;
		}

	}

}
