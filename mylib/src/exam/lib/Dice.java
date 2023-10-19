package exam.lib;

public class Dice {
	public void roll() {
		System.out.println((int)(Math.random() * 6 + 1));
	}
	public int roll2() {
		return (int)(Math.random() * 6 + 1);
	}
	
}
