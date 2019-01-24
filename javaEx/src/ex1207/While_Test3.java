package ex1207;

import java.util.Scanner;

/* 날짜 : 2018.12.07
 * 내용 : while / do ~ while문 문제
 * 기타 : 
 * */
public class While_Test3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int a, b, t1, t2, lcm;
		
		System.out.println("첫번째 정수를 입력해주세요.");
		a = sc.nextInt();
		System.out.println("두번째 정수를 입력해주세요.");
		b = sc.nextInt();
		
		// 최대공약수
		t1 = a;
		t2 = b;
		
		int mod = t1 % t2;
		
		// 최대공약수 구하기
		while(mod > 0) {
			t1 = t2;
			t2 = mod;
			mod = t1 % t2;
		}
		
		System.out.println("최대공약수 : " + t2);
		
		lcm = (a * b) / t2;
		System.out.println("최소공배수 : " + lcm);
	}

}
