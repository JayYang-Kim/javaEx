package ex1207;

import java.util.Scanner;

/* 날짜 : 2018.12.07
 * 내용 : while / do ~ while문 문제
 * 기타 : 
 * */
public class While_Test4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b, c, n, cnt;
		
		System.out.println("개수를 입력해주세요.");
		cnt = sc.nextInt();
		
		n = 0;
		a = 0;
		b = 1;
		while(n < cnt) {
			n++;
			
			System.out.println(a + " ");
			
			c = a + b;
			a = b;
			b = c;
		}
		
		System.out.println("");

		sc.close();
	}

}
