package ex1204;

import java.util.Scanner;

/* 날짜 : 2018.12.04
 * 내용 : 두 정수를 입력받아 사직연산을 계산하는 프로그램
 * 기타 : 
 * */
public class OperatorEx2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		
		System.out.println("두 정수는 ?");
		a = sc.nextInt();
		b = sc.nextInt();
		
		/*c = a + b;
		d = a - b;
		e = a * b;
		f = a / b;*/
		
		System.out.printf("%d + %d : %d\n", a, b, a+b);
		System.out.printf("%d - %d : %d\n", a, b, a-b);
		System.out.printf("%d * %d : %d\n", a, b, a*b);
		System.out.printf("%d / %d : %d", a, b, a/b);
		System.out.printf("%d %% %d : %d", a, b, a%b);
		
		/*System.out.printf("%d + %d : %d\n", a, b, c);
		System.out.printf("%d - %d : %d\n", a, b, d);
		System.out.printf("%d * %d : %d\n", a, b, e);
		System.out.printf("%d / %d : %d", a, b, f);*/

		sc.close();
	}

}
