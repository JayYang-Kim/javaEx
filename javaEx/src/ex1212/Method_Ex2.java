package ex1212;

/* 날짜 : 2018.12.12
 * 내용 : 메소드 (Method)
 * 기타 : 
 * */

class Ex2 {
	// 예제1) 한 문자를 인수로 넘겨 받아 ascii 코드를 리턴하는 메소드
	public int ascii(char a) {
		return a;
	}
	
	// 예제2) 문자의 ascii 코드를 인수로 넘겨 받아 ascii 코드에 대한 문자를 리턴하는 메소드
	public char ascii2(int a) {
		return (char)a;
	}
	
	// 예제3) 한문자를 넘겨 받아 소문자인지를 판별하는 메소드
	public boolean isLower(char a) {
		return a >= 'a' && a <= 'z';
	}
	
	// 예제4) x, y중 최소값 구하기
	public int min(int x, int y) {
		return x < y ? x : y;
	}
}

public class Method_Ex2 {

	public static void main(String[] args) {
		Ex2 as = new Ex2();
		// 예제1 - 출력)
		
		int a;
		
		a = as.ascii('A');
		System.out.println(a);
		
		// 예제2 - 출력)
		char b;
		
		b = as.ascii2(65);
		System.out.println(b);
		
		// 예제3 - 출력)
		boolean c;

		c = as.isLower('a');
		System.out.println(c);
		
		// 예제4 - 출력)
		int min = 0, max = 1;
		int d;
		
		d = as.min(min, max);
		System.out.println(d);
	}

}
