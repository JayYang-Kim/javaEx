package ex1221;

/* 날짜 : 2018.12.21
 * 내용 : 예외 (Exception) 처리
 * 기타 : catch문 여러 예외 처리 (jdk7.0부터 가능)
 * */

public class Exception_Ex3 {

	public static void main(String[] args) {
		int a, b , c;
		String s1 = "100";
		String s2 = "0";
		
		try {
			a = Integer.parseInt(s1);
			b = Integer.parseInt(s2);
			c = a + b;
			
			System.out.println("결과 : " + c);
		} catch (NumberFormatException | ArithmeticException e) {
			System.out.println("숫자 형식이 아니거나, 0으로 나누었습니다.");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		System.out.println("종료");
	}

}
