package basic;

public class OpTest12 {

	public static void main(String[] args) {
		int n = -12341;
		System.out.println( n == 1 || n == 3 ? "남자" : 
							n == 2 || n == 4 ? "여자" :
												"오류");
		
		
		System.out.println( n > 0 ? "양수" : 
							n < 0 ? "음수" :
									"0은 양수도 음수도 아님.");
		System.out.println( n % 2 == 1 ? "홀수" : 
										 "짝수" ); // n이 -12341과 같을때 오류 %일 때 주
								//결과가 -1이 나오므로 1이 아닐 때 짝수.
	}

}
