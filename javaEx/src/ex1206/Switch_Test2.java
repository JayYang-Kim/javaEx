package ex1206;

import java.util.Scanner;

/* 날짜 : 2018.12.06
 * 내용 : switch ~ case문 문제
 * 기타 : 두수 및 연산자를 입력 받아 입력 받은 연산자에 대한 연산을 수행하는 프로그램을 작성하시오.
 * */
public class Switch_Test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		char c;
		
		System.out.println("첫번째 수를 입력해주세요.");
		a = sc.nextInt();
		System.out.println("두번째 수를 입력해주세요.");
		b = sc.nextInt();
		System.out.println("연산자를 입력해주세요.");
		c = sc.next().charAt(0);
		
		switch (c) {
		case '+' : System.out.println(a + " + " + b + " = " + (a + b)); break;
		case '-' : System.out.println(a + " - " + b + " = " + (a - b)); break;
		case '*' : System.out.println(a + " * " + b + " = " + (a * b)); break;
		case '/' : System.out.println(a + " / " + b + " = " + (a / b)); break;
		default : System.out.println("입력 오류");
		}
		
		sc.close();
	}

}
