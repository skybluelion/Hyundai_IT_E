package basic;

import java.util.Arrays;

public class StringTest3 {

	public static void main(String[] args) {
		
		//문자열 길이
		String str1 = "Hello Java!";
		String str2 = "안녕하세요! 반갑습니다.";
		System.out.println(str1.length());
		System.out.println(str2.length());
		System.out.println();
		
		//문자열 검색
		//charAt()
		System.out.println(str1.charAt(1));
		System.out.println(str2.charAt(1));
		System.out.println();
		
		//@indexOf(), lastIndexOf()
		System.out.println(str1.indexOf('a'));
		System.out.println(str1.lastIndexOf('a'));
		System.out.println(str1.indexOf('a', 8));
		System.out.println(str1.lastIndexOf('a', 8));
		System.out.println(str1.indexOf("Java"));
		System.out.println(str1.lastIndexOf("Java"));
		System.out.println(str1.indexOf("하세요"));
		System.out.println(str1.lastIndexOf("하세요"));
		System.out.println(str1.indexOf("Bye"));
		System.out.println(str2.lastIndexOf("고맙습니다."));
		System.out.println();
		
		//문자열 변환 및 연결
		// @String.valueOf(기본 자료형): 기본 자료형 -> 문자열 변환
		String str3 = String .valueOf(2.3);
		String str4 = String .valueOf(false);
		System.out.println(str3);
		System.out.println(str4);
		
		//@concat(): 문자열 연결
		String str5 = str3.concat(str4);
		System.out.println(str5);
		
		//String.valueOf() + concat()
		String str6 = "안녕" + 3;
		String str7 = "안녕".concat(String.valueOf(3));
		
		//문자열을 byte[] 또는 char[]로 변환
		String str8 = "Hello Java!";
		String str9 = "안녕하세요";
		
		// @getByte() : 문자열 -> char[]변환
		byte[] arr1 = str8.getBytes();
		byte[] arr2 = str9.getBytes();
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
		//@toCharArray(): 문자열 -> char[] 변환
		char[] arr3 = str8.toCharArray();
		char[] arr4 = str9.toCharArray();
		System.out.println(Arrays.toString(arr3));
		System.out.println(Arrays.toString(arr4));
	
	
	}

}