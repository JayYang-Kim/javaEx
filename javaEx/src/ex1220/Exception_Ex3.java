package ex1220;

import java.util.InputMismatchException;
import java.util.Scanner;

/* 날짜 : 2018.12.20
 * 내용 : 예외(Exception) 처리
 * 기타 : unchecked exception
 * */

public class Exception_Ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b, c;
		
		try {
			System.out.println("두수를 입력해주세요.");
			
			a = sc.nextInt();
			b = sc.nextInt();
			
			c = a + b;
			
			System.out.println("결과 : " + c);
		} catch(InputMismatchException e) { // unchecked 예외
			System.out.println("정수만 입력 가능합니다.");
			//e.printStackTrace();
		} finally {
			System.out.println("예외발생 여부와 관련없이 실행");
			sc.close();
		}
		
		System.out.println("종료");
	}

}
