package ex1203;

/* 날짜 : 2018.12.03
 * 내용 : 변수 테스트2
 * 기타 : 
 * */
public class VarEx2 {

	public static void main(String[] args) {
		int a, b, c, d, e;
		a = 0b101;	// 2진수 = 5
		b = 0101;	// 8진수 = 65
		//b = 019;	// [컴파일 에러] 8진수는 9가 없다.
		c = 101;		// 10진수
		d = 0x101;	// 16진수
		e = 1_0_1;	// 101
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		
		int x = 20;		// 4byte
		short y = 20, z;	// 2byte
		//z = x;	// [컴파일 오류] 큰자료형은 작은 자료형에 대입할 수 없다.
		z = (short)x;	// 강제형 변환 int -> short (큰자료형을 작은 자료형으로 강제 변환)
		
		System.out.println("x : " + x + " y : " + y + " z : " + z);
	}

}
