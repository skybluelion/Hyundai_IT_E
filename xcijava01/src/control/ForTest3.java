package control;

public class ForTest3 {

	public static void main(String[] args) {
		//구구단
		for(int n = 0; n <= 1; n++) {
			for(int i = 1; i <= 9; i++) {
				for(int j = 2; j <=5; j++) {
					System.out.print((j+n*4) + "*" + i + "=" + i*(j+n*4) + "\t");				
				}
				System.out.println();
			}			
			System.out.println();
		}
	}

}
