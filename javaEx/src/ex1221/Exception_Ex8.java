package ex1221;

import java.util.InputMismatchException;
import java.util.Scanner;

/* 날짜 : 2018.12.21
 * 내용 : 예외 (Exception) 처리
 * 기타 : throw 비정상적인 처리
 *      연산자가 +, -, *, / 아니면 더이상 아무것도 하지 않는 프로그램
 *      checked 예외
 * */

public class Exception_Ex8 {

	private Scanner sc = new Scanner(System.in);
	
	public char inputOper() throws Exception {
		System.out.println("연산자를 입력해주세요.");
		char c = sc.next().charAt(0);
		
		// throw 예외 던지기 (예외를 강제로 발생)
		if (c != '+' && c != '-' && c != '*' && c != '/') {
			throw new Exception("연산자 입력 오류입니다. 연산자를 정확히 입력해주세요.");
		}
		
		return c;
	}
	
	public int inputNum() throws Exception {
		System.out.println("점수를 입력해주세요. (0또는 양수)");
		int n = 0;
		
		try {
			n = sc.nextInt();
			
			if (n < 0) {
				throw new Exception("음수는 입력을 할 수 없습니다.");
			}
		} catch (InputMismatchException e) {
			//throw e; // 예외를 다시 던짐
			throw new Exception("숫자만 입력해 주세요.");
		}
		
		return n;
	}
	
	public String calculate() { 
		String s = null;
		
		int a, b;
		char c;
		
		try {
			a = inputNum();
			b = inputNum();
			c = inputOper();
			
			if (c == '+') {
				s = String.format("%d + %d = %d", a, b, a + b);
			} else if (c == '-') {
				s = String.format("%d - %d = %d", a, b, a - b);
			} else if (c == '*') {
				s = String.format("%d * %d = %d", a, b, a * b);
			} else if (c == '/') {
				s = String.format("%d / %d = %d", a, b, a / b);
			}
			
			System.out.println(s);
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		return s;
	}
	
	public static void main(String[] args) {
		Exception_Ex8 ob = new Exception_Ex8();
		ob.calculate();
		
		/*String s = ob.calculate();
		
		System.out.println(s);*/
	}

}
