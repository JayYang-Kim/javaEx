package ex1205;

import java.util.Scanner;

/* 날짜 : 2018.12.05
 * 내용 : 조건문 (if)
 * 기타 : 
 * */
public class If_Ex {

	public static void main(String[] args) {
		// 절대값 구하기
		/*int a = -10;
		if (a < 0) {
			a = -a;
		}
		System.out.println("절대값 : " + a);*/
		
		// 홀수, 짝수 구하기
		/*int a = 37;
		if (a%2 == 1)
		//if((a&1) == 1) // 비트 연산자 사용 (== 우선순위가 높아서 괄호 입력하여 우선순위 변경)
			System.out.println(a + " : 홀수");*/
		
		Scanner sc = new Scanner(System.in);
		
		int a, b, c, t;
		
		System.out.println("세개의 수를 입력해주세요.");
		
		// 세개의 수 ex) 45 22 65 -> 22 45 65
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		if (a > b) { // t = 45, a = 22, b = 45
			t = a; a = b; b = t;
		}
		
		// 최소값 구하기
		if (a > c) { // a = 22
			t = a; a = c; c = t;
		}
		
		if (b > c) {
			t = b; b = c; c = t;
		}
		
		System.out.println(a + " , " + b + " , " + c);
	}

}
