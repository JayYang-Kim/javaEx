package ex1206;

import java.util.Scanner;

/* 날짜 : 2018.12.06
 * 내용 : switch ~ case문 테스트
 * 기타 : 
 * */
public class Switch_Ex {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int a;
		
		System.out.println("수를 입력해주세요");
		a = sc.nextInt();
		
		// byte, short, char, int, String(java7.0), enum만 사용가능
		/*switch (a) {
		case 3 : System.out.print("*");
		case 2 : System.out.print("*");
		case 1 : System.out.print("*");
		}*/
		
		/*switch (a) {
		case 3 : System.out.println("***"); break;
		case 2 : System.out.println("**"); break;
		case 1 : System.out.println("*"); break;
		}*/
		
		/*switch (a%3) {
		case 0 : System.out.println("3의 배수입니다."); break;
		case 1 : 
		case 2 : System.out.println("3의 배수가 아닙니다."); break;
		}*/
		
		switch (a) {
		case 3 : System.out.println("***"); break;
		case 2 : System.out.println("**"); break;
		case 1 : System.out.println("*"); break;
		default : System.out.println("입력 오류"); break;
		}
		
		sc.close();
	}

}
