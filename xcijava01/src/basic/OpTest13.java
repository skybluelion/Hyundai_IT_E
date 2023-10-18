package basic;

public class OpTest13 {

	public static void main(String[] args) {
		//1~6 난수 발생
		int dice = (int)(Math.random()*6);
		System.out.println((int)(Math.random()*6));
		System.out.println((int)(Math.random()*6));
		System.out.println((int)(Math.random()*6));
		System.out.println((int)(Math.random()*6));
		System.out.println((int)(Math.random()*6));
		System.out.println();
		
		//4~15사이의 정수 난수 발생
		
		System.out.println((int)(Math.random()*12+4));
		System.out.println((int)(Math.random()*12+4));
		System.out.println((int)(Math.random()*12+4));
		System.out.println((int)(Math.random()*12+4));
		System.out.println((int)(Math.random()*12+4));
		System.out.println();

		
		/*
		 * 반드시 아래 숫자로만 난수 발생
		 * 600 700 800 900 1000 1100 1200 1300
		 * 1400 1500 1600 1700 1800 1900
		 * 2000 2100 2200 2300
		 */
		System.out.println((int)((Math.random()*18+6))*100);
		System.out.println((int)((Math.random()*18+6))*100);
		System.out.println((int)((Math.random()*18+6))*100);
		System.out.println((int)((Math.random()*18+6))*100);
		System.out.println((int)((Math.random()*18+6))*100);
		System.out.println((int)((Math.random()*18+6))*100);
		
		
		
	}

}
