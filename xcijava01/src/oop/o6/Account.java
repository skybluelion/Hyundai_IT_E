package oop.o6;

public class Account {
	int money1;
	static int money2; // Account 인스턴스가 생성되기 전부터 만들어지고, 공유되는 값
	
	public Account(int money) {
		this.money1 += money;
		this.money2 += money;
	}
	
	public String toString() {
		return "money1:" + money1 + ", money2:" + money2;
	}
}
