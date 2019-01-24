package ex1220;

/* 날짜 : 2018.12.20
 * 내용 : 예외(Exception) 처리
 * 기타 :  
 * */

public class Exception_Ex2 {

	public static void main(String[] args) {
		int a = 10, b = 0;
		int c;
		
		try {
			c = a / b;
			System.out.println("결과 : " + c);
		} catch (ArithmeticException e) { // exception : 최상위 예외 클래스
			//System.out.println("0으로 나누어 발생한 오류입니다.");
			//System.out.println(e.toString()); // 클라이언트 오류 확인용
			//System.out.println(e);
			e.printStackTrace(); // 개발자 오류 확인용
		} finally {
			
		}
		
		System.out.println("종료");
	}

}
