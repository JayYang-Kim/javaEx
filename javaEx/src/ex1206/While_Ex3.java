package ex1206;

import java.util.Scanner;

/* 날짜 : 2018.12.06
 * 내용 : while 테스트
 * 기타 : 
 * */
public class While_Ex3 {

	public static void main(String[] args) {
		// 10! (팩토리얼)의 연산 결과를 출력
		/*int a, b;
		a = 0;
		b = 1;
		while (a < 10) {
			a++;
			b *= a;
			// 마지막 * 빼기
			if (a == 10) {
				System.out.print(a + " = ");
			} else {
				System.out.print(a + " * ");
			}
		}
		
		System.out.print(b);*/
		
		// 정수를 입력 받아 1부터 입력 받은 수까지의 합을 구하는 프로그램
		Scanner sc = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.println("수를 입력해주세요.");
		c = sc.nextInt();
		
		// 입력 받은 수 까지 합
		/*a = 0;
		b = 0;
		while (a < c) {
			a++;
			b+=a;
		}
		System.out.println(b);*/
		
		// 입력 받은 수 까지 홀수합
		a = 1;
		b = 0;
		
		while (a <= c) {
			b += a;
			System.out.println(a);
			a += 2;
		}
		
		System.out.println(b);
		
		// 정수를 입력받아 입력 받은 단에 대한 구구단 출력
		/*a = 0;
		while(a < 9) {
			a++;
			b = c * a;
			System.out.printf("%d * %d = %d\n", c, a, b);
		}*/
		
		sc.close();
	}

}
