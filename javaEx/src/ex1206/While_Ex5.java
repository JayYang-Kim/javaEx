package ex1206;

import java.util.Scanner;

/* 날짜 : 2018.12.06
 * 내용 : Do ~ while 테스트
 * 기타 : 구구단을 2단에서 9단까지 실행 결과처럼 가로로 출력하는 프로그램을 작성하시오.
 * 		   do ~ while은 최소 한번은 실행
 * */
public class While_Ex5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int dan, n;
		
		do {
			System.out.print("단 ? ");
			dan = sc.nextInt();
		} while (dan < 1 || dan > 9);
		
		n = 0;
		while (n < 9) {
			n++;
			System.out.printf("%d * %d = %2d\n", dan, n, dan * n);
		}
		
		sc.close();
	}

}
