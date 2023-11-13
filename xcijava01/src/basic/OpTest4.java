package basic;

public class OpTest4 {

	public static void main(String[] args) {
		int a = 10;
		int b = 4;
		
		System.out.println(a & b);
		
		//값 교
		int i = 10;
		int j = 5;
		
		int temp = j;
		j = i;
		i = temp;
		System.out.println(i + " " + j); // 5 10
		
		i ^= j;
		j ^= i;
		i ^= j;
		
		System.out.println(i + " " + j); // 10 5
		
		int n = 5;
		System.out.println(n << 2); //20
		
		
	}

}
