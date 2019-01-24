package ex1206;

import java.util.Scanner;

/* 날짜 : 2018.12.06
 * 내용 : while 테스트
 * 기타 : 두 정수를 입력 받아 입력 받은 수중 적은 수에서 큰 수까지의 합을 구하는 프로그램
 * */
public class While_Test4 {

	public static void main(String[] args) {
		int a, b, n ,s;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력해주세요.");
		a = sc.nextInt();
		System.out.println("정수를 입력해주세요.");
		b = sc.nextInt();
		
		// 최대값 구하기
		if(a > b) {
			n = a; a = b; b = n;
		}
		
		// while초기값으로 최소값 대입
		n = a;
		s = 0;
		
		while (n <= b) {
			s += n;
			n++;
		}
		
		System.out.println(a + " ~" + b + "까지의 합 = " + s);
		
		sc.close();
	}

}
