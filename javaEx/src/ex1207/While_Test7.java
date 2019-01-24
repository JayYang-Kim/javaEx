package ex1207;

import java.util.Scanner;

/* 날짜 : 2018.12.07
 * 내용 : while / do ~ while문 문제
 * 기타 : 
 * */
public class While_Test7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int num, a, t;
		
		do {
			System.out.println("수를 입력해주세요.");
			num = sc.nextInt();
		} while(num < 0);
		
		a = 0;
		t = num;
		while(t > 0) {
			a *= 10;
			a += t % 10;	
			t /= 10;      	
		}
		
		System.out.println("원래의 수 : " + num);
		System.out.println("뒤집은 수 : " + a);
		
		sc.close();
	}

}
