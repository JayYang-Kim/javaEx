package ex1210;

import java.util.Scanner;

/* 날짜 : 2018.12.10
 * 내용 : Array(배열) 테스트
 * 기타 : 1~10까지 난수를 100개를 발생하여 한 줄에 10개씩 출력하고 마지막에 각 숫자의 발생 횟수를 출력하는 프로그램 
 * */
public class Array_Ex8 {

	public static void main(String[] args) {
		int []cnt = new int[10];
		int n;
		
		for(int i = 1; i <= 100; i++) {
			n = (int)(Math.random() * 10) + 1;
			
			System.out.printf("%5d", n);
			
			if(i % 10 == 0) {
				System.out.println();
			}
			
			cnt[n-1]++;
		}
		
		System.out.println();
		
		for(int i = 0; i < cnt.length; i++) {
			System.out.println((i + 1) + " : " + cnt[i]);
		}
	}

}