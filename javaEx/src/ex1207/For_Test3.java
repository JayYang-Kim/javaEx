package ex1207;

import java.util.Scanner;

/* 날짜 : 2018.12.07
 * 내용 : For문 문제
 * 기타 : 10개의 정수를 입력 받아 입력받은 정수 중 짝수 개수와 홀수 개수를 출력하는 프로그램
 * */
public class For_Test3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.println("10개의 정수를 입력해주세요.");
		
		int c1, c2;
		c1 = c2 = 0;
		for(int a = 1; a <= 10; a++) {
			num = sc.nextInt();
			
			if(num % 2 == 0) {
				c1++;
			} else {
				c2++;
			}
		}
		
		System.out.println("홀수의 개수 : " + c2);
		System.out.println("짝수의 개수 : " + c1);
		
		sc.close();
	}

}
