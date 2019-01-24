package ex1217;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 날짜 : 2018.12.17
 * 내용 : DateFormat
 * 기타 : 
 * */

public class DateFormat_Ex {

	public static void main(String[] args) {
		DateFormat df;
		
		Date date = new Date();
		
		//df = DateFormat.getInstance(); // 18. 12. 17 오후 4:37
		//df = DateFormat.getDateInstance(); // 2018. 12. 17
		//df = DateFormat.getDateInstance(DateFormat.LONG, Locale.KOREAN); // 2018년 12월 17일 (월) 
		df = DateFormat.getDateInstance(DateFormat.SHORT, Locale.KOREAN); // 18. 12. 17
		
		String s;
		s = df.format(date);
		System.out.println(s);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		s = sdf.format(date);
		
		System.out.println(s);
	}

}
