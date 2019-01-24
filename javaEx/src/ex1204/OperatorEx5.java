package ex1204;

import java.util.Scanner;

/* 날짜 : 2018.12.04
 * 내용 : 문제 3) 한문자를 입력 받아 입력받은 문자의 ASCII 코드 출력
 *         문자 ? c 
 *         c : 67
 * 기타 : 
 * */
public class OperatorEx5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char a;
		int b;
		
		System.out.println("한문자를 입력해주세요.");
		a = sc.next().charAt(0);
		
		b = a;
		
		System.out.printf("%c : - > %d\n", a, b);
		
		sc.close();
	}

}
