package control;

public class WhileTest2 {

	public static void main(String[] args) {
		// 1부터 1000까지 정수의 합계
		int sum = 0;
		int cnt = 1;
		while(cnt != 1001) {
			sum += cnt++;
		}
		
		System.out.println(sum);
		
		
		//1부터 1000까지 3의 배수의 합계
		int sum1 = 0;
		int cnt1 = 1;
		
		while(3*cnt1 <= 1000) {
			sum1 += 3*cnt1++;
		}
		
		System.out.println(sum1);

	}

}
