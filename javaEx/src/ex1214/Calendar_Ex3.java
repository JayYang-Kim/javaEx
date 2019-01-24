package ex1214;

import java.util.Calendar;
import java.util.Scanner;

/* 날짜 : 2018.12.14
 * 내용 : Calendar Class
 * 기타 : 
 * */

public class Calendar_Ex3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int y, m;
		
		// 년도 입력
		System.out.println("년도를 입력해주세요.");
		y = sc.nextInt();
		
		// 월 입력
		System.out.println("월을 입력해주세요.");
		m = sc.nextInt();
		
		// 시스템의 현재 날짜
		Calendar cal = Calendar.getInstance();
		
		cal.set(y, m-1, 1);
		
		int w = cal.get(Calendar.DAY_OF_WEEK);
		int end = cal.getActualMaximum(Calendar.DATE);
		
		System.out.println("\t   " + y + "년" + m + "월");
		
		for (int i = 1; i < w; i++) {
			System.out.print("    ");
		}
		
		for(int i = 1; i <= end; i++) {
			System.out.printf("%4d", i);
			
			if (++w % 7 == 1) {
				System.out.println();
			}
		}
		
		System.out.println();
		
		sc.close();
		
	}

}
