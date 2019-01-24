package ex1205;

import java.util.Scanner;

/* 날짜 : 2018.12.05
 * 내용 : 조건 연산자 테스트
 * 기타 : 
 * */
public class Oper_Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a;
		String b;
		
		System.out.println("년도를 입력해주세요.");
		a = sc.nextInt();
		
		b = (a % 4 == 0) && (a % 100 != 0) || (a % 400 == 0) ? "윤년" : "평년"  ;
		
		System.out.println(a + "년 : " + b);
		
		sc.close();
	}

}
