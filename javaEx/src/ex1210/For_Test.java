package ex1210;

import java.util.Scanner;

/* 날짜 : 2018.12.10
 * 내용 : For문 테스트
 * 기타 : 10개의 정수를 입력 받아 입력 받은 정수 중 가장 큰 값, 작은 값을 출력하는 프로그램
 * */
public class For_Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int a, max;
		max = 0;
		//max = Integer.MIN_VALUE; // 
		
		System.out.println("10개의 정수를 입력해주세요.");
		
		// 최대값
		/*for (int i = 1; i <= 10; i++) {
			a = sc.nextInt();
			
			if(i == 1) {
				max = a;
			} else if (max < a) {
				max = a;
			}
		}
		
		System.out.println("최대값 : " + max);*/
		
		int min;
		min = 0;
		
		// 최소값
		for (int i = 1; i <= 10; i++) {
			a = sc.nextInt();
			
			if(i == 1) {
				min = a;
			} else if (min > a) {
				min = a;
			}
		}
		
		System.out.println("최소값 : " + min);
		
		sc.close();
	}

}
