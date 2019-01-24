package ex1205;

import java.util.Scanner;

/* 날짜 : 2018.12.05
 * 내용 : 조건문 예제 (if)
 * 기타 : 하루 일한 시간을 입력 받아 급여를 계산하는 프로그램을 작성하시오.
 * */
public class If_Test4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b;
	
		System.out.println("근무시간을 입력해주세요.");
		a = sc.nextInt();
		
		if (a > 8) {
			b = 8 * 10000 + (int)((a-8) * 10000 * 1.5);
			System.out.printf("급여 : %,d원", b);
		} else {
			b = a * 10000;
			System.out.printf("급여 : %,d원", b);
		}
		
		sc.close();
	}

}
