package ex1210;

import java.util.Scanner;

/* 날짜 : 2018.12.10
 * 내용 : Test
 * 기타 : 1 ~ 100까지 정수중 3, 5의 배수가 되는 수의 합과 평균을 구하는 프로그램
 *      [결과]
 *      합 : 2418
 *      평균 : 51
 * */
public class Test {

	public static void main(String[] args) {
		/*int sum, c;
		sum = 0;
		c = 0; // 3, 5의 배수 카운트
		
		for(int i = 1; i <= 100; i++) {
			// 3, 5의 배수 체크하여 더하기
			if(i % 3 == 0 || i % 5 == 0) {
				sum += i;
				c++;
			} else {
				
			}
		}
		
		System.out.println("합 : " + sum);
		System.out.println("평균 : " + sum / c);*/
		
		// 두 주사위의 결과가 입력한 수의만큼 굴려서 동일한 결과가 나올 확률 구하는 프로그램 
		// 단, 입력한 숫자가 0이거나 음수일 경우 재입력
		// 출력은 double형으로 출력해주세요.
		// [출력] #번동안 두 주사위가 동일한 확률 : x.xxxxxx
		Scanner sc = new Scanner(System.in);
		
		int a, b, cnt;
		int c;
		cnt = 0;
		
		double result;
		
		do {
			System.out.println("숫자를 입력해주세요.");
			c = sc.nextInt();
		} while (c <= 0);
		
		for(int i = 0; i <= c; i++) {
			a = (int)(Math.random() * 6) + 1;
			b = (int)(Math.random() * 6) + 1;
			
			if(a == b) {
				cnt++;
			}
		}
		
		System.out.println("cnt : " + cnt);
		System.out.println("c : " + c);
		
		result = (double)cnt / c * 100; 
		
		System.out.println("result : " + result);
		
		System.out.printf("%d번동안 두 주사위가 동일한 확률 : %f", c, result);
		
		sc.close();
	}

}