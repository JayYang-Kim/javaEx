package ex1207;

import java.util.Scanner;

/* 날짜 : 2018.12.07
 * 내용 : For문 문제
 * 기타 : 1 ~ 9 사이의 정수를 입력 받아 입력 받은 수의 구구단을 출력하는 프로그램을 작성하시오.
 * */
public class For_Test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num, a;
		
		// 1미만이거나 9를 초과하면 재입력 받기
		do {
			System.out.println("1 ~ 9의 정수를 입력해주세요.");
			num = sc.nextInt();
		} while (num < 1 || num > 9);
		
		for(a = 1; a <= 9; a++) {
			System.out.println(num + " * " + a + " : " + (num * a));
		}
		
		sc.close();
	}

}
