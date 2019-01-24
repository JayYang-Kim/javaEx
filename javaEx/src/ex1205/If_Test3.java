package ex1205;

import java.util.Scanner;

/* 날짜 : 2018.12.05
 * 내용 : 조건문 예제 (if)
 * 기타 : 점수를 입력 받아 입력 받은 점수에 따른 평점을 구하는 프로그램을 작성하시오.
 * */
public class If_Test3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		
		System.out.println("점수를 입력해주세요.");
		a = sc.nextInt();
		
		if(a >= 95 && a <= 100) {
			System.out.println(a + "점, 평점 : 4.5점");
		} else if (a >= 90 && a <= 94) {
			System.out.println(a + "점, 평점 : 4.0점");
		} else if (a >= 85 && a <= 89) {
			System.out.println(a + "점, 평점 : 3.5점");
		} else if (a >= 80 && a <= 84) {
			System.out.println(a + "점, 평점 : 3.0점");
		} else if (a >= 75 && a <= 79) {
			System.out.println(a + "점, 평점 : 2.5점");
		} else if (a >= 70 && a <= 74) {
			System.out.println(a + "점, 평점 : 2.0점");
		} else if (a >= 65 && a <= 69) {
			System.out.println(a + "점, 평점 : 1.5점");
		} else if (a >= 60 && a <= 64) {
			System.out.println(a + "점, 평점 : 1.0점");
		} else if (a >= 0 && a <= 59) {
			System.out.println(a + "점, 평점 : 0.0점");
		} else { 
			System.out.println("입력오류");
		}
		
		sc.close();
	}

}
