package ex1221;

/* 날짜 : 2018.12.21
 * 내용 : 예외 (Exception) 처리
 * 기타 : Finally 블럭
 * */

public class Exception_Ex2 {

	public static void main(String[] args) {
		int a = 10, b = 0, c;
		
		try {
			// 프로그램 비정상적인 종료가 되며 "종료"는 출력되지 않는다.
			c = a / b;
			System.out.println("결과 : " + c);
		} catch (ArithmeticException e) {
			System.out.println(e.toString());
		} finally {
			System.out.println("예외가 발생해도, 예외가 없어도 실행");
		}
		
		System.out.println("종료");
	}

}
