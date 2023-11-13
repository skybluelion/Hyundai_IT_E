package basic;

import java.util.Calendar;

public class Cal {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance(); // 실행하는 순간의 시간을 담음
		
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH) + 1; // 0부터 시작
		
		System.out.println(year + " / " + month);
		
		c.set(year, month - 1, 1); // 이번 달의 1일로 설정
		int week = c.get(Calendar.DAY_OF_WEEK); //일요일이 1
		System.out.println(week); // 4 -> 1일이 수요일
		int endday = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println(endday); // 30 -> 이달의 마지막이 30일
		
		System.out.println("일 월 화 수 목 금 토");
		System.out.println("--------------------");
		
		for(int w = 1; w < week; w++) {
			System.out.print("   ");
		}
		for(int d = 1, w = week; d <= endday; d++, w++) {
			System.out.print(d < 10 ? " " + d + " ": d+ " ");
			if(w % 7 ==0) System.out.println();
		}
		System.out.println();
		
	}
}
