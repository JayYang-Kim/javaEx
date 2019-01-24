package ex1206;

import java.util.Scanner;

/* 날짜 : 2018.12.06
 * 내용 : switch ~ case문 문제
 * 기타 : 점수를 입력 받아 입력 받은 점수에 따른 판정을 구하는 프로그램을 작성 하시오.
 * */
public class Switch_Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int score;
		char a; // 판정
		
		System.out.println("점수를 입력해주세요");
		score = sc.nextInt();
		
		switch (score / 10) {
		case 10 : case 9 : a = '수'; break;
		case 8 : a = '우'; break;
		case 7 : a = '미'; break;
		case 6 : a = '양'; break;
		case 5 : case 4 : case 3 : case 2 : case 1 : case 0 : a = '가'; break;
		default : a = '가';
		}
		
		System.out.println("점수 : " + score + " , " + "판정 : " + a);
		
		sc.close();

	}

}
