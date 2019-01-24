package ex1204;

import java.util.Scanner;

/* 날짜 : 2018.12.04
 * 내용 : 문제 2) 반지름을 입력 받아 원의 넓이와 둘레 계산
 *         반지름 ?
 *         넓이 : 반 * 반 * 3.14
 *         둘레 : 반 * 2 * 3.14
 *         c : 67
 * 기타 : 
 * */
public class OperatorEx4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int r;
		double a, b;
		
		System.out.println("반지름을 입력해주세요.");
		r = sc.nextInt();
		
		a = r*r*3.14;
		b = r*2*3.14;
		System.out.printf("넓이 : %.2f\n", a);
		System.out.printf("둘레 : %.2f\n", b);
		/*System.out.printf("넓이 : %f\n", c * c * 3.14);
		System.out.printf("둘레 : %f", c * 2 * 3.14);*/
		
		sc.close();
	}

}
