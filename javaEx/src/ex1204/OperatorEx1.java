package ex1204;

/* 날짜 : 2018.12.04
 * 내용 : 산술 연산자 테스트 (이항연산자)
 * 기타 : 
 * */
public class OperatorEx1 {

	public static void main(String[] args) {
		// 산술연사자 (이항연산자)
		byte b1 = 5, b2 = 10, b3;
		// b3 = b1 + b2; // [컴파일 오류]
		
		b3 = (byte)(b1+b2);
		
		System.out.println(b3);
		
		int a;
		a = 'A' + 'B'; // 65 + 66
		System.out.println(a);
		
		float f;
		f = 'A' + 'B' + 10;
		System.out.println(f); // 141.0
		
		//f = 0.5 + 0.5; // [컴파일 오류]
		
		double d;
		d = 0.5 + 0.5;
		System.out.println(d);
		
		d = 1/2 + 1/2 + 1/2; // 정수 연산자 정수 -> 정수
		System.out.println(d); // 0.0
		
		d = 80 % 'A'; // 'A' : 65
		System.out.println(d);
		
		d = 3/2.0 + 3/2; // 정수 연산자 실수 -> 실수
		System.out.println(d); // 값 : 2.5
		
		d= 3.7 % 1.3;
		System.out.println(d); // 값 : 1.1
	}

}
