package ex1217;

import java.util.Calendar;
import java.util.Scanner;

/* 날짜 : 2018.12.17
 * 내용 : java.util.Calendar
 * 기타 : 날짜를 입력하여 해당 주의 시작일과 끝나는 일을 구하는 프로그램
 * */

public class Calendar_Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str;
		
		System.out.println("날짜를 입력해주세요.");
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
		cal.set(y, m-1, d);
		
		int n;
		
		// 주의 시작
		Calendar cal2 = (Calendar)cal.clone();
		n = cal2.get(Calendar.DAY_OF_WEEK) - 1;
		cal2.add(Calendar.DAY_OF_MONTH, -n);
		
		// 주의 끝
		Calendar cal3 = (Calendar)cal.clone();
		//n = cal3.get(Calendar.DAY_OF_WEEK); 
		n = 7 - cal3.get(Calendar.DAY_OF_WEEK);
		cal3.add(Calendar.DAY_OF_MONTH, + n);
		
		System.out.printf("날짜 : %tF %tA\n", cal, cal);
		System.out.printf("주 시작 날짜 : %tF %tA\n", cal2, cal2);
		System.out.printf("주 종료 날짜 : %tF %tA\n", cal3, cal3);
		
		// 주의 시작으로 주의 시작과 끝 구하기
		for (int i = 0; i < 7; i++) {
			if(i != 0) {
				cal2.add(Calendar.DAY_OF_MONTH, 1); // i로 할 경우 0, 1, 2, 3, 4, 5, 6 증가
			}
			
			System.out.printf("%tF\n", cal2);
		}
		
		System.out.println();
		
		sc.close();
	}

}
