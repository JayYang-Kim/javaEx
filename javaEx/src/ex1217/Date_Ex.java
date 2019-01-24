package ex1217;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/* 날짜 : 2018.12.17
 * 내용 : java.util.Date
 * 기타 : 
 * */

public class Date_Ex {

	public static void main(String[] args) {
		Date date = new Date();
		
		System.out.println(date);
		
		// 년, 월, 일 (비권장)
		int y = date.getYear() + 1900;
		int m = date.getMonth() + 1;
		int d = date.getDate();
		
		System.out.println(y + "-" + m + "-" + d);
		
		// 1970.1.1 0시 0분 0초를 기준으로 밀리초 단위로 환산
		long lo = date.getTime();
		
		System.out.println(lo);
		
		Date date2 = new Date(1545011113036L);
		System.out.println(date2);
		
		boolean b = date.after(date2); // date가 date2보다 이후의 날짜인지 비교
		System.out.println(b);
		
		// 현재날짜를 String으로 변환 (Date -> String)
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh:mm:ss"); // date 형식 정리
		String s = sdf.format(date);
		
		System.out.println(s);
		
		// String -> Date (String에서 Date로 변환 못시킬 상황이 생길 수 있다.)
		s = "2000-10-10";
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
		
		// 프로그램 실행 중 예외가 발생할 수 있는 소스를 작성
		try {
			Date date3 = sdf2.parse(s);
			System.out.println(date3);
			
			// 2018-12-17 ~ 2019-05-16 (두 날짜 사이의 간격)
			Date begin = sdf2.parse("2018-12-17");
			Date end = sdf2.parse("2019-05-16");
			
			long dif = (end.getTime() - begin.getTime()) / (24*60*60*1000);
			
			System.out.println(dif + "일");
			
		} catch (ParseException e) { // 프로그램 실행중 예외가 발생할때 실행할 소스
			e.printStackTrace();
		} 
	}

}
