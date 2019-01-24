package ex1205;

import java.util.Scanner;

/* 날짜 : 2018.12.05
 * 내용 : 조건 연산자 (삼항 연산자) or (선택 연산자)
 * 기타 : 
 * */
public class Oper_Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 정수를 입력 받아 절대값 구하기
		/*int a, b;
		
		System.out.print("정수를 입력해주세요.");
		a = sc.nextInt();
		
		b = a > 0 ? a : -a;
		System.out.println(a + "의 절대값 : " + b);*/
		
		// 정수를 입력 받아 양수, 음수, 영인지 판별
		int c;
		String s;
		System.out.println("정수를 입력해주세요.");
		c = sc.nextInt();
		
		s = c > 0 ? "양수" : (c == 0 ? "영" : "음수");
		
		System.out.println(c + " : " + s);
		
		sc.close();
	}

}
