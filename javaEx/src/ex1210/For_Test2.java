package ex1210;

import java.util.Scanner;

/* 날짜 : 2018.12.10
 * 내용 : For문 테스트
 * 기타 : 두 개의 정수를 입력받아 입력 받은 수중 적은수에서 큰 수 사이에 3의 배수이거나 5의 배수인수들의 합과 평군을 출력하는 프로그램
 * */
public class For_Test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n1, n2, temp;
		int s, c;
		
		System.out.println("첫번째 정수를 입력해주세요.");
		n1 = sc.nextInt();
		System.out.println("두번째 정수를 입력해주세요.");
		n2 = sc.nextInt();
		
		// 작은수와 큰수 비교
		// n1 : 최소값, n2 : 최대값
		if(n1 > n2) {
			temp = n1; n1 = n2; n2 = temp;
		}
		
		s=c=0;
		
		for (int i = n1; i <= n2; i++) {
			if(i % 3 == 0 || i % 5 == 0) {
				c++; // 3, 5의 배수 카운트
				s += i;
			}
		}
		
		System.out.println("합 : " + s);
		System.out.println("평균 : " + (s / c));
		
		sc.close();
	}

}
