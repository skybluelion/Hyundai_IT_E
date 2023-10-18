package basic;

import java.math.BigDecimal;

public class PrimitiveTypeTest {
	public static void main(String[] args) {
		boolean b = true;
		System.out.println(b);
		
		byte b2 = 127;
		System.out.println(b2);
		
		char c = '가';
		System.out.println(c);
		
		short s = 32767; //int의 1/2배
		System.out.println(s);
		
		int i = 2147483647 + 1;
		System.out.println(i); 
		// -2147483648 int값의 범위를 초과하기 때
	
		long l1 = 2147483648L; //int의 2배
		System.out.println(l1);
		
		double p = 3.1415926536;
		System.out.println(p); 
		
		float p2 = 3.1415926536f;
		System.out.println(p2); //3.1415927
	
		System.out.println(2-1.1); //0.8999999999999999
		
		BigDecimal bd1 = new BigDecimal(2);
		BigDecimal bd2 = new BigDecimal(1.1); // 여기서 깨짐
		System.out.println(bd1.subtract(bd2)); //0.899999999999999911182158029987476766109466552734375
	
		BigDecimal bd3 = new BigDecimal("2");
		BigDecimal bd4 = new BigDecimal("1.1"); 
		System.out.println(bd3.subtract(bd4)); // 0.9
		
		double pi = Math.PI;
		System.out.println(pi);//3.141592653589793

		
	
	}
	
}
