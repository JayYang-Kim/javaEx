package ex1210;

import java.util.Scanner;

/* 날짜 : 2018.12.10
 * 내용 : Test
 * 기타 : 조내부에서 만든 문제
 * */
public class Test2 {

	public static void main(String[] args) {
		// 입력한 수의 만큼 곱하기는 프로그램 (임희석)
		/*
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * int a, sum;
		 * 
		 * System.out.println("정수를 입력해주세요."); a = sc.nextInt();
		 * 
		 * sum = 1; for(int i = 1; i <= a; i++) { sum *= a; }
		 * 
		 * System.out.println("결과 : " + sum);
		 */

		// [짝수 구구단] 2 ~ 9단까지 출력하는데 짝수 x 짝수만 출력 (이민지)
		/*for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if (i % 2 == 0 && j % 2 == 0) {
					System.out.print(i + " * " + j + " = " + i * j + ", ");
				}
			}
		}*/
		
		// 10개 숫자를 입력받아서 최대값과 최소값을 구하세요. (이민영)
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int min = 0, max = 0;

		System.out.println("10개의 정수를 입력해주세요.");
		for (int i = 1; i <= 10; i++) {
			a = sc.nextInt(); // 
			
			// 최대값
			if(i == 1) {
				max = a;
			} else if (max < a) {
				max = a;
			}
			
			// 최소값
			if(i == 1) {
				min = a;
			} else if (min > a) {
				min = a;
			}
			
		}
		
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		
		sc.close();

		// 주사위 100회 던졌을 경우 (이동건)
		// 주사위를 2개를 던졌을 때와 3개를 던졌을 때 모두 6이 나올 확률이 어느 경우가 더 높을까? 차이를 구하여라
		/*int a, b, c; // 주사위 
		int count2, count3; // 주사위 값이 일치하는 경우 체크
		count2 = count3 = 0;
		double result2, result3; // 값

		for (int i = 0; i <= 100; i++) {
			a = (int)(Math.random() * 6) + 1;
			b = (int)(Math.random() * 6) + 1;

			if (a == 6 && b == 6) {
				count2++; // 주사위 2개를 던졌을때 일치하는 경우 체크
			}
		}

		for (int i = 0; i <= 100; i++) {
			a = (int)(Math.random() * 6) + 1;
			b = (int)(Math.random() * 6) + 1;
			c = (int)(Math.random() * 6) + 1;

			if (a == 6 && b == 6 && c == 6) {
				count3++; // 주사위 2개를 던졌을때 일치하는 경우 체크
			}
		}
		
		result2 = (double)count2 / 100 * 100;
		result3 = (double)count3 / 100 * 100;
		
		System.out.printf("2개 던졌을때 확률 : %f\n", result2);
		System.out.printf("3개 던졌을때 확률 : %f", result3);*/
	}

}
