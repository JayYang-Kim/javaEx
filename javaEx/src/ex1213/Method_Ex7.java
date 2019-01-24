package ex1213;

import java.util.Scanner;

/* 날짜 : 2018.12.12
 * 내용 : Class, Method 예제 
 * 기타 : 컴퓨터와 가위, 바위, 보하는 프로그램
 * */

public class Method_Ex7 {
	// 프로그램 설명
	public static void menu() { // 클래스 메소드 생성
		System.out.println("===== 선택 =====");
		System.out.println("1. 가위 2. 바위 3. 보 4. 종료");
		System.out.println("===============");
		System.out.print("선택[1~4] : ");
	}
	
	// 숫자를 입력 시 1 == 가위, 2 == 바위, 3 == 보를 출력
	public static String convertText(int n) { // 클래스 메소드 생성
		return n == 1 ? "가위" : (n == 2 ? "바위" : "보");
	}
	
	// 컴퓨터 난수 생성
	public static int com() { // 클래스 메소드 생성
		return (int)(Math.random() * 3) + 1;
	}
	
	static Scanner sc = new Scanner(System.in);
	// 유저 생성
	public static int user() { // 클래스 메소드 생성
		
		int a;
		do {
			menu(); // 프로그램 설명 메소드 출력
			a = sc.nextInt(); // a변수에 정수 받기
		} while(a < 1 || a > 4); // 1보다 작거나, 4보다 클경우 재입력 처리
		
		return a;
	}
	
	public static void main(String[] args) {
		int u, c;
		
		while(true) {
			// 유저 입력
			u = user();
			
			// 유저가 종료를 요청
			if (u == 4) {
				break;
			}
			
			// 컴퓨터 입력
			c = com();
			
			// 유저와 컴퓨터 입력값 출력
			System.out.println();
			System.out.println("유저 : " + u + " , " + convertText(u));
			System.out.println("컴퓨터 : " + c + " , " + convertText(c));
			
			// 판정
			if (u == c) {
				System.out.println("비겼습니다.");
				System.out.println();
			} else if ((u == 1 && c == 3) || (u == 2 && c == 1) || (u == 3 && c ==2)) {
				System.out.println("유저가 승리했습니다.");
				System.out.println();
			} else {
				System.out.println("컴퓨터가 승리했습니다.");
				System.out.println();
			}
		}
	}

}
