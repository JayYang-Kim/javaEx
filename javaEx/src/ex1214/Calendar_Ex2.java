package ex1214;

import java.util.Calendar;

/* 날짜 : 2018.12.14
 * 내용 : Calendar Class
 * 기타 : 
 * */

public class Calendar_Ex2 {

	public static void main(String[] args) {

		Calendar cal = Calendar.getInstance(); // 시스템의 현재 날짜
		
		// 날짜만 10일로 변경
		cal.set(Calendar.DATE, 10);
		System.out.printf("%tF %tA\n", cal, cal);
		
		// 1994-11-04로 변경
		// 월(0 ~ 11월을 리턴하므로 +1을 해야함)
		cal.set(1994, 11 - 1, 4);

		System.out.printf("%tF %tA\n", cal, cal);

		// 홍길동이 2018년 10월 10일에 사귀었다. 100일은?
		cal.set(2018, 10 - 1, 10);
		cal.add(Calendar.DATE, 100); // (일, 100)

		System.out.printf("%tF %tA\n", cal, cal);
		
		// 2000년 10월 35일로 변경
		cal.set(2000, 10 - 1, 35);

		System.out.printf("%tF %tA\n", cal, cal);
		
	}

}
