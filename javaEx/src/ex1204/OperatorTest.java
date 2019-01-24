package ex1204;

import java.util.Scanner;

/* 날짜 : 2018.12.04
 * 내용 : 문제 1) 초를 입력 받아 시, 분, 초로 변환하는 프로그램을 작성하시오.
 * 		   
 * 기타 : 
 * */
public class OperatorTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b, c, d;
		
		System.out.println("초를 입력해주세요.");
		a = sc.nextInt(); // 초 입력
		
		b = a / 3600; // 시간 구하기
		c = (a % 3600) / 60; // 분 구하기
		d = (a % 3600) % 60; // 초 구하기
		
		/* 풀이 */
		/*b = a/3600;
		c = (a/60)%60;
		d =a%60;*/
		
		/*System.out.print(a + "초는 ");
		System.out.print(b + "시간 ");
		System.out.print(c + "분 ");
		System.out.print(d + "초");*/
		
		System.out.printf("%d초는 %d시간 %d분 %d초", a, b, c, d);
		
		sc.close();
	}
}
