package ex1205;

/* 날짜 : 2018.12.05
 * 내용 : 논리연산자
 * 기타 : and는 첫번째 결과가 false인 경우 뒤에있는 연산은 하지 않는다.
 *         or는 첫번째 결과가 true인 경우 뒤에있는 연산은 하지 않는다.
 * */
public class Test {

	public static void main(String[] args) {
		// and
		int a;
		boolean b1, b2;
		a = 10;
		b1 = false;
		b2 = a > 20 && (b1=true); // and에서는 첫번째 결과가 false일 경우 뒤에있는 연산은 하지 않는다.
		System.out.println(b1 + " , " + b2);
		
		// or
		a = 10;
		b1 = false;
		b2 = a < 20 || (b1=true); // or에서는 첫번째 결과가 ture일 경우 뒤에있는 연산은 하지않는다.
		System.out.println(b1 + " , " + b2);
	}

}
