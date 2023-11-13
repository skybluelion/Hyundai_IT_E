package oop.o3;

public class AnimalTest {

	public static void main(String[] args) {
		Animal a1 = new Animal();
		
		Animal b1 = new Condor(); // upcasting은 한단계 뛰고도 가능.
		Bird b2 = new Bird();
		Bird b3 = (Bird) b1; 
		
		System.out.println(a1.toString());
		System.out.println(b1.toString());
		System.out.println(b2.toString()); // upcasting
		System.out.println(b3.toString()); // downcasting
		/*
			Animal 입니다.
			Condor입니다.
			Bird입니다. 
			Condor입니다.
		 */
		Condor c1 = (Condor) b1;
//		System.out.println(c.toString()); //실체보다 더 낮은 downcasting시 cast예외발
		
		System.out.println();
		
		Animal a = new Condor();
		System.out.println(a);
		
		Bird b = (Bird) a;
		System.out.println(b);
		
		Condor c = null;

		
		if(b instanceof Condor) {
			c = (Condor) b;
			System.out.println(c);
		}else {
			System.out.println("downcasting 불가.");
		}
		if(c instanceof BlackVulture) {
			BlackVulture bv = (BlackVulture) c;
			System.out.println(bv);
		}else {
			System.out.println("downcasting 불가.");
		}
		
		System.out.println();
		/*
		 	Condor입니다.
			Condor입니다.
			Condor입니다.
			downcasting 불가.

		 */
		
		
		
		
		Cat cat = new Cat();
		System.out.println(cat);
		
		Animal an = cat;
		System.out.println(an);
		
		if(an instanceof Bird) {
			Bird bi = (Bird) an;
			System.out.println(bi);
		} else {
			System.out.println("downcasting 불가");
		}
		/*
			 Cat입니다.
			 Cat입니다.
			 downcasting 불가
		 */
	}

}
