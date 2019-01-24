package ex1210;

import java.util.Scanner;

/* 날짜 : 2018.12.10
 * 내용 : Continue 예제
 * 기타 : 
 * */
public class Continue_Ex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double s, a;
		s = 0;
		
		System.out.println("5개의 실수를 입력해주세요.");
		
		for(int i = 0; i <= 5; i++) {
			a = sc.nextDouble();
			
			if(a >= 0) {
				s += a;
			} else {
				continue;
			}
		}
		
		System.out.println("합 : " + s);
		
		sc.close();
	}

}
