package ex1204;

/* 날짜 : 2018.12.04
 * 내용 : 증감 연산자2
 * 기타 : 
 * */
public class OperatorEx7 {

	public static void main(String[] args) {
		int a, b;
		
		a = 10;
		b = a++ + a++ + 1;
		// 10 + 11 + 1
		System.out.println(a + " : " +b); // 12 : 22
		
		a = 10;
		b = ++a + ++a + 1;
		// 11 + 12 + 1
		System.out.println(a + " : " +b); // 12 : 24
		
		a = 10;
		b = a++ + ++a + ++a + a++ + a++;
		// 10 + 12 + 13 + 13 + 14
		System.out.println(a + " : " +b); // 15 : 62
		
		a = 0;
		b = a---a; // 0 - (-1)
		System.out.println(a + " : " + b); // a : -1, b : 1
	}

}
