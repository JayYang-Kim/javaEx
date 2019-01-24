package ex1204;

import java.util.Scanner;

/* 날짜 : 2018.12.04
 * 내용 : 문제 3) 섭씨온도를 입력 받아 화씨온도로 변환하는 프로그램을 작성하시오.
 * 		   
 * 기타 : 
 * */
public class OperatorTest3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a;
		double b;
		
		System.out.println("섭씨온도를 입력해주세요.");
		a = sc.nextInt(); // 섭씨온도 입력
		
		b = a * 1.8 + 32; // 화씨온도 계산 (섭씨온도 * 1.8 + 3.2)
		
		System.out.printf("%.1f", b);
		
		sc.close();
	}

}
