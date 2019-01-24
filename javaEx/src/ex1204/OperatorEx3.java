package ex1204;

import java.util.Scanner;

/* 날짜 : 2018.12.04
 * 내용 : 문제 1) 가로와 세로 길이를 입력 받아 직사각형의 넓이와 둘레계산
 * 		   가로 ?
 *         세로 ?
 *         넓이 : 가 * 세
 *         둘레 : (가+세) * 2
 * 기타 : 
 * */
public class OperatorEx3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		
		System.out.println("가로와 세로 길이를 입력해주세요.");
		a = sc.nextInt();
		b = sc.nextInt();
		
		System.out.printf("넓이 : %d\n", a * b);
		System.out.printf("둘레 : %d", (a + b) * 2);
		
		sc.close();
	}

}
