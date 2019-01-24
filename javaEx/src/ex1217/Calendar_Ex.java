package ex1217;

import java.util.Calendar;

/* 날짜 : 2018.12.17
 * 내용 : java.util.Calendar
 * 기타 : 
 * */

public class Calendar_Ex {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		Calendar cal2 = cal; // 주소값 공유
		
		// clone 클래스는 object 클래스보다 작아서 다운캐스팅을 해줘야함 "(Calendar)cal"
		Calendar cal3 = (Calendar)cal.clone(); // 객체 복제 (주소값은 다르지만 안의 값들을 복제)
		
		System.out.println(cal == cal2); // [결과] true
		System.out.println(cal == cal3); // [결과] false
		
		System.out.printf("%tF %tT\n", cal, cal);
		System.out.printf("%tF %tT\n", cal3, cal3);
	}

}
