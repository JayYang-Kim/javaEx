package ex1217;

import java.util.Calendar;
import java.util.Scanner;

/* 날짜 : 2018.12.17
 * 내용 : java.util.Calendar
 * 기타 : 생년월일을 입력해서 만 나이를 계산하는 프로그램
 * */

public class Calendar_Ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str;
		
		System.out.println("생년월일을 입력해주세요.");
		System.out.println("(YYYYMMDD 또는 YYYY-MM-DD)");
		str = sc.next();
		
		// -, .(정규식 특수문자 : 한문자를 나타냄)을 입력받으면 ""(공백)으로 변환
		// 실제.을 나타내기위해 \\(두번 입력해야함)
		str = str.replaceAll("\\-|\\.|/", "");
		
		// 입력한 날짜 길이가 8자리가 아닐 경우 프로그램 종료 처리
		if (str.length() != 8) {
			System.out.println("날짜 형식 오류");
			System.exit(0); // 프로그램 종료
		}
		
		// 년, 월, 일 구하기
		int y = Integer.parseInt(str.substring(0, 4));
		int m = Integer.parseInt(str.substring(4, 6));
		int d = Integer.parseInt(str.substring(6));
		
		Calendar cal = Calendar.getInstance(); // 시스템 현재 날짜 구하기
		
		// 나이 구하기
		int age = cal.get(Calendar.YEAR) - y;
		
		// 월구하기 (월이 지났거나 월이 같을 경우 일자 비교)
		if ((m > cal.get(Calendar.MONTH) + 1) ||  
			(m == cal.get(Calendar.MONTH) + 1 && d > cal.get(Calendar.DAY_OF_MONTH))) {
				age--;
		}
		/*if (cal.get(Calendar.MONTH) >= m && cal.get(Calendar.DATE) >= d) {
			age--;
		}*/
		
		System.out.println("나이 : " + age);
		//System.out.printf("주 시작 날짜 : %tF %tA\n", cal2, cal2);
		//System.out.printf("주 종료 날짜 : %tF %tA\n", cal3, cal3);
		
		sc.close();
	}

}
