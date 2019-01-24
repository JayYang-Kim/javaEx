package ex1217;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/* 날짜 : 2018.12.17
 * 내용 : java.util.Date
 * 기타 : 
 * */

public class Date_Ex2 {

	public static void main(String[] args) {
		try {
			String str = "2018-10-10";
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date date1 = sdf.parse(str);
			
			System.out.println(date1);
			
			// Date > Calendar
			Calendar cal = Calendar.getInstance();
			cal.setTime(date1);
			
			System.out.printf("Date > Calendar : %tF %tA %tT\n", cal, cal, cal);
			
			// Calendar > Date
			Date date2 = cal.getTime();
			System.out.println("Calendar > Date : " + date2);
			
			long a = date1.getTime();
			long b = cal.getTimeInMillis();
			
			System.out.println(a + " : " + b);
		} catch (Exception e) { // Exception : 모든 예외를 처리
			// TODO: handle exception
		}
	}

}
