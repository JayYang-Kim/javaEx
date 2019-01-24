package ex1206;

import java.util.Scanner;

/* 날짜 : 2018.12.06
 * 내용 : switch ~ case문 문제
 * 기타 : 년도와 월을 입력 받아 입력 받은 월의 마지막 날짜를 구하는 프로그램을 작성 하시오.
 * */
public class Switch_Test3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int y, m, d = 1;
		
		System.out.println("년도를 입력해주세요.");
		y = sc.nextInt();
		System.out.println("월을 입력해주세요.");
		m = sc.nextInt();
		
		switch (m) {
		case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 12 : d = 31; break;
		case 2 : 
			if(y % 4 == 0 && y % 100 != 0 || y % 400 == 0) {
				d = 29;
			} else {
				d = 28;
			}
			break;
		case 4 : case 6 : case 9 : case 11 : d = 30; break;
		}
		
		if (d == 1) {
			System.out.println("입력오류");
		} else {
			System.out.printf("%d년 %d월은 %d일까지 있습니다.", y, m, d);
		}
		
		sc.close();
	}

}
