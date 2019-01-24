package ex1205;

import java.util.Scanner;

/* 날짜 : 2018.12.05
 * 내용 : 조건 연산자 테스트2
 * 기타 : + 32 (소문자) / - 32 (대문자) 
 * */
public class Oper_Test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char a, b;
		
		System.out.println("문자를 입력해주세요.");
		a = sc.next().charAt(0);
		
		// 경우의 수 : 3가지 (대문자, 소문자, 숫자)
		b = a >= 'A' && a <= 'Z' ? (char)(a + 32) : (a >= 'a' && a <= 'z' ? (char)(a - 32) : a) ;
		
		System.out.println(b);
		
		sc.close();
	}

}