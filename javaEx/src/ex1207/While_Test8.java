package ex1207;

import java.util.Scanner;

/* 날짜 : 2018.12.07
 * 내용 : while / do ~ while문 문제
 * 기타 : 
 * */
public class While_Test8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.println("정수를 입력해주세요.");
		n = sc.nextInt();
		
		int m = 2;
		boolean b = true;
		while (m < n) {
			if (n%m == 0) {
				b = false;
				break;
			}
			m++;
		}
		
		if(b && n!=1) {
			System.out.println(n + ": 소수");
		} else {
			System.out.println(n + ": 소수가 아님");
		}
		
		sc.close();
	}

}
