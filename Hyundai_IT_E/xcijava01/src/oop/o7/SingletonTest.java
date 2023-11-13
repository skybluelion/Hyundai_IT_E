package oop.o7;

public class SingletonTest {

	public static void main(String[] args) {
//		Singleton s1 = new Singleton();
//		System.out.println(s1); // oop7.Singleton@5eb5c224
//		System.out.println(s1.getClass()); // class oop7.Singleton
//		System.out.println(s1.hashCode()); // 1588970020 10진수 5eb5c224 16진수
//	
//		Singleton s2 = new Singleton();
//		System.out.prinln(s2); // oop7.Singleton@3f8f9dd6
//		System.out.println(s2.getClass()); // class oop7.Singleton
//		System.out.println(s2.hashCode()); // 1066376662
		
		System.out.println();
		Singleton s1 = Singleton.getInstance();
		System.out.println(s1); // oop7.Singleton@7e774085
		System.out.println(s1.getClass()); // class oop7.Singleton
		System.out.println(s1.hashCode()); // 2121744517 10진수 7e774085 16진수
		
		Singleton s2 = Singleton.getInstance();
		System.out.println(s2); // oop7.Singleton@7e774085
		System.out.println(s2.getClass()); // class oop7.Singleton
		System.out.println(s2.hashCode()); // 2121744517
	
	}

}
