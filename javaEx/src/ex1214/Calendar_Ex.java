package ex1214;

import java.util.Calendar;

/* 날짜 : 2018.12.14
 * 내용 : Calendar Class
 * 기타 : 
 * */

public class Calendar_Ex {

	public static void main(String[] args) {
		//Calendar new = new Calendar(); // [컴파일 오류] 추상 클래스라서 객체 생성 불가
		
		Calendar now = Calendar.getInstance();
		//String s = String.format("tF %tA %tT", now, now, now);
		String s = String.format("%1$tF", now); // 년-월-일
		String s2 = String.format("%1$tF %1$tA", now); // 년-월-일, 요일
		String s3 = String.format("%1$tF %1$tA %1$tT", now); // 년-월-일, 요일, 시간 (시:분:초)
		System.out.println(s);
		System.out.println(s2);
		System.out.println(s3);
		
		// 데이터 가져오기 (get)
		int y = now.get(Calendar.YEAR); // 년도
		int m = now.get(Calendar.MONTH) + 1; // 월(0 ~ 11월을 리턴하므로 +1을 해야함)
		int d = now.get(Calendar.DATE); // 일자
		//int d = now.get(Calendar.DAY_OF_MONTH); // 일자
		int w = now.get(Calendar.DAY_OF_WEEK); // 요일 (1 : 일 ~ 7 : 토)
		int end = now.getActualMaximum(Calendar.DATE); // 월의 마지막 일자
		
		System.out.println(y + " : " + m + " : " + d + " : " + w + " : " + end);
	}

}
