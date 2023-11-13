package array;

public class ArrayTest2 {

	public static void main(String[] args) {

		int[][] score = {
				{100, 90, 80, 70},
				{ 90, 80, 70, 60},
				{ 80, 70, 60, 50}
		};
		
		System.out.println("국어\t영어\t수학\t철학\t총점\t평균");
		for(int row = 0; row < score.length; row++) {
			int sum = 0;
			double avg = 0;
			for(int column = 0; column < score[row].length; column++) {
				System.out.print(score[row][column] + "\t");
				sum += score[row][column];
			}
			avg = sum / score[row].length;
			System.out.println(sum + "\t" + avg);
		}
		System.out.println();
		System.out.println("국어\t영어\t수학\t철학\t총점\t평균");
		for(int[] a : score) {
			int sum = 0;
			double avg = 0;
			for(int b : a) {
				System.out.print(b + "\t");
				sum += b;
			}
			avg = sum / a.length;
			System.out.println(sum + "\t" + avg);
		}
		
		System.out.println("종료");
		
	}

}
