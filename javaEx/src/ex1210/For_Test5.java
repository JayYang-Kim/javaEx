package ex1210;

import java.util.Scanner;

/* 날짜 : 2018.12.10
 * 내용 : For문 테스트
 * 기타 : 5개의 정수를 입력 받아 입력 받은 정수 중 7에 가장 가까운 수를 출력하는 프로그램 (7입력 시 재입력)
 * */
public class For_Test5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n, diff, min = 999, result = 0;
		
		System.out.println("5개의 정수를 입력해주세요. (단, 7은 재입력)");
		
		for (int i = 1; i <= 5; i++) {
			n = sc.nextInt();
			
			// 입력한 정수가 7일 경우, 재입력 받기
			if(n == 7) {
				i--;
				continue;
			}
			
			// 입력받은 값과 7차이값 구하기 (양수)
			if(n > 7) {
				diff = n - 7;
			} else {
				diff = 7 - n;
			}
			
			if(i == 1) {
				min = diff;
				result = n;
			} else if (min > diff) {
				min = diff;
				result = n;
			}
		}
		
		System.out.println("7에 가장 가까운 수 : " + result);
		
		sc.close();
	}

}
