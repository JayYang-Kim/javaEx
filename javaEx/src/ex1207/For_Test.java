package ex1207;

import java.util.Scanner;

/* 날짜 : 2018.12.07
 * 내용 : For문 문제
 * 기타 : 
 * */
public class For_Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num, a, sum;
		sum = 0;
		
		// 1미만이거나, 10000을 초과하는 정수 재입력 처리
		do {
			System.out.println("정수를 입력해주세요.");
			num = sc.nextInt();
		} while (num < 1 || num > 1000);
		
		// 1부터 입력받은 정수의 수까지의 합
		for(a = 1; a <= num; a++) {
			sum += a;
		}
		
		if(sum == 1) {
			System.out.println("1 : " + sum);
		} else {
			System.out.println("1 ~  " + num + "까지 합 : " + sum);
		}
		
		sc.close();
	}

}
