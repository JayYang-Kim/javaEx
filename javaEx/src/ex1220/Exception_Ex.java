package ex1220;

/* 날짜 : 2018.12.20
 * 내용 : 예외(Exception) 처리
 * 기타 :  
 * */

public class Exception_Ex {

	public static void main(String[] args) {
		int a = 10, b = 0;
		int c;
		
		c = a / b; // java.lang.ArithmeticException 예외 발생 : unchecked 예외
		           // 예외처리를 하지 않아서 여기서 프로그램은 종료
		System.out.println("결과 : " + c);
		
		System.out.println("종료");
	}

}
