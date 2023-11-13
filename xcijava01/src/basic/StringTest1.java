package basic;

public class StringTest1 {

	public static void main(String[] args) {
		String str = "안녕하세요";
		System.out.println(str);
		
		StringBuffer sb = new StringBuffer("실수란 ");
		System.out.println(sb.length() + ":" + sb.capacity());
		sb.append("신을 용서하는 ");
		System.out.println(sb.length() + ":" + sb.capacity());
		sb.append("인간의 행위이다");
		System.out.println(sb.length() + ":" +sb.capacity());
		sb.append("~~");
		System.out.println(sb.length() + ":" +sb.capacity());
		
		StringBuffer sb2 = new StringBuffer("실수란 ");
		System.out.println(sb2.length() + ":" + sb2.capacity());
		sb.append("신을 용서하는 ");
		System.out.println(sb2.length() + ":" + sb2.capacity());
		sb.append("인간의 행위이다");
		System.out.println(sb2.length() + ":" +sb2.capacity());
		sb.append("~~");
		System.out.println(sb2.length() + ":" +sb2.capacity());
	}

}
/*
안녕하세요
4:20
12:20
20:20
22:42

4:20
4:20
4:20
4:20
 */
