package ex1205;

import java.util.Scanner;

/* 날짜 : 2018.12.05
 * 내용 : 조건문 예제 (if)
 * 기타 : 두 정수를 입력 받아 입력 받은 수중 큰 수에서 적은수를 뺀 차이를 출력하는 프로그램을 작성하시오.
 * */
public class If_Test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.println("첫번째 정수를 입력해 주세요.");
		a = sc.nextInt();
		System.out.println("두번째 정수를 입력해 주세요.");
		b = sc.nextInt();
		
		// a, b 정수 비교
		if(a >= b) {
			c = a - b;
		} else {
			c = b - a;
		}
		
		System.out.println("두수의 차이 : " + c);
	}

}
