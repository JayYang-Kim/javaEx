package ex1204;

import java.util.Scanner;

/* 날짜 : 2018.12.04
 * 내용 : 문제 2) 금액을 입력 받아, 입력 받은 금액을 50,000원권에서 1원권까지의 화폐매수로 계산하는 프로그램을 연산자를 이용하여 작성하시오.
 * 		   
 * 기타 : 
 * */
public class OperatorTest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a;

		System.out.println("금액을 입력해주세요.");
		a = sc.nextInt(); // 금액 입력

		/*System.out.printf("오만원권 : %d\n", a / 50000);
		System.out.printf("만원권 : %d\n", (a % 50000) / 10000);
		System.out.printf("오천원권 : %d\n", (a % 50000) % 10000 / 5000);
		System.out.printf("천원권 : %d\n", (a % 50000) % 10000 % 5000 / 1000);
		System.out.printf("오백원권 : %d\n", (a % 50000) % 10000 % 5000 % 1000 / 500);
		System.out.printf("백원권 : %d\n", (a % 50000) % 10000 % 5000 % 1000 % 500 / 100);
		System.out.printf("오십원권 : %d\n", (a % 50000) % 10000 % 5000 % 1000 % 500 % 100 / 50);
		System.out.printf("십원권 : %d\n", (a % 50000) % 10000 % 5000 % 1000 % 500 % 100 % 50 / 10);
		System.out.printf("오원권 : %d\n", (a % 50000) % 10000 % 5000 % 1000 % 500 % 100 % 50 % 10 / 5);
		System.out.printf("일원권 : %d", (a % 50000) % 10000 % 5000 % 1000 % 500 % 100 % 50 % 10 % 5 / 1);*/
		
		System.out.printf("오만원권 : %d\n", a / 50000);
		System.out.printf("만원권 : %d\n", (a % 50000) / 10000);
		System.out.printf("오천원권 : %d\n", (a % 10000) / 5000);
		System.out.printf("천원권 : %d\n", (a % 5000) / 1000);
		System.out.printf("오백원권 : %d\n", (a % 1000) / 500);
		System.out.printf("백원권 : %d\n", (a % 500) / 100);
		System.out.printf("오십원권 : %d\n", (a % 100) / 50);
		System.out.printf("십원권 : %d\n", (a % 50) / 10);
		System.out.printf("오원권 : %d\n", (a % 10) / 5);
		System.out.printf("일원권 : %d\n", (a % 5));
		
		sc.close();
	}

}
