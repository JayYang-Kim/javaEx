package ex1205;

import java.util.Scanner;

/* 날짜 : 2018.12.05
 * 내용 : 조건문 예제 (if)
 * 기타 : 두수 및 연산자를 입력 받아 입력 받은 연산자에 대한 연산을 수행하는 프로그램을 작성하시오.
 * */
public class If_Test5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		char c;
		
		System.out.println("첫번째 정수를 입력해주세요.");
		a = sc.nextInt();
		System.out.println("두번째 정수를 입력해주세요.");
		b = sc.nextInt();
		System.out.println("+, -, *, /중 하나를 입력해주세요.");
		c = sc.next().charAt(0);
		
		if (c == '+' ) {
			System.out.printf("%d + %d = %d", a, b, a+b);
		} else if (c == '-') {
			System.out.printf("%d - %d = %d", a, b, a-b);
		} else if (c == '*') {
			System.out.printf("%d * %d = %d", a, b, a*b);
		} else if (c == '/') {
			System.out.printf("%d / %d = %d", a, b, a/b);
		} else {
			System.out.println("입력 오류");
		}
		
		sc.close();
	}

}
