package ex1204;

import java.util.Scanner;

/* 날짜 : 2018.12.04
 * 내용 : 문제 5) 체중과 키를 입력 받아 BMI(체질량지수)를 계산하는 프로그램을 작성하시오.
 * 		   
 * 기타 : 
 * */
public class OperatorTest5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double a, b, c;
		
		System.out.println("체중을 입력해주세요.");
		a = sc.nextDouble(); // 체중 입력
		System.out.println("키를 입력해주세요.");
		b = sc.nextDouble(); // 키 입력
		
		c = b / 100; // 키 cm -> m 변환
		
		System.out.printf("체중 : %.2fkg\n", a);
		System.out.printf("키 : %.2fm\n", c);
		System.out.printf("BMI : %.1f", a / (c * c)); // BMI = 체중 / (키m * 키m)
		
		sc.close();
	}

}
