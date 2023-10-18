package basic;

public class OpTest6 {

	public static void main(String[] args) {
		double seedMoney = 1_000_000;
		seedMoney = seedMoney + (seedMoney * 0.1);
		System.out.println(seedMoney);
		//1100000
		seedMoney = seedMoney - (seedMoney * 0.1);
		System.out.println(seedMoney);
		//990000
		seedMoney = 1_000_000;
		seedMoney = seedMoney - (seedMoney * 0.1);
		System.out.println(seedMoney);
		//900000
		seedMoney = seedMoney + (seedMoney * 0.1);
		System.out.println(seedMoney);
		//990000
		
		seedMoney = 1_000_000;
		for(int i = 0; i < 100; i++) {
			seedMoney = seedMoney + (seedMoney/2 * 0.4);
			seedMoney = seedMoney - (seedMoney/2 * 0.3);
			//1100000
			System.out.println(seedMoney);
		}
		//투자의 방법
	}

}
