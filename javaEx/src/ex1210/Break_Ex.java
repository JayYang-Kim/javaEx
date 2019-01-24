package ex1210;

import java.util.Scanner;

/* 날짜 : 2018.12.10
 * 내용 : Break문 예제
 * 기타 : 실수를 입력 받아 입력 받은 수의 합을 출력하는 프로그램
 * */
public class Break_Ex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double a, s;
		s = 0;
		
		System.out.println("실수 입력 [종료 : 0]");
		while(true) {
			a = sc.nextDouble();
			
			if(a <= 0) {
				break;
			}
			
			s += a;
		}
		System.out.println("합 : " + s);
		
		sc.close();
	}

}
