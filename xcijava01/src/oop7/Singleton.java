package oop7;

public class Singleton {
	int score;
	
	//1. 생성자를 private로 생성하면 외부에서 새로운 인스턴스를 생성 못함.
	private Singleton() {}
	
	//2. 자기 자신을 참조하는 변수를 static으로 선언.
	public static Singleton singleton = null;
	
	//3. null인 경우만 인스턴스를 생성, 즉 한번만 생성.
	//	 처음 1회만 인스턴스를 생성하고 리턴하는 메소
	public static Singleton getInstance() {
		if(singleton == null) {
			singleton = new Singleton();
		}
		
		return singleton;
	}

}
