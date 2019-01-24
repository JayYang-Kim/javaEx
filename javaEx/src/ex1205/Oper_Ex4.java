package ex1205;

/* 날짜 : 2018.12.05
 * 내용 : 비트 단위 이동(shift) 연산자 / 캐스팅에 의한 형 변환
 * 기타 : 
 * */
public class Oper_Ex4 {

	public static void main(String[] args) {
		// 산술적 우측 shift 연산자
		int a = 32, b;
		b = a >> 3; // (32/2^3)

		System.out.println(b);

		// 산술적 좌측 shift 연산자
		int c = 32, d;
		d = a << 3; // (32*2^3)

		System.out.println(d);
		
		// 논리적 좌측 shift 연산자
		int e = 32, f;
		f = a >>> 3; // 무조건 양수로 변환

		System.out.println(d);
		
		// 캐스팅에 의한 형 변환
		// 산술 자료형과 boolean 자료형, 참조형 등은 형 변환 불가
		int g = 1, h = 2;
		double i;
		i = (double)(g / h); // 0.5
		
		System.out.println(i);
	}

}
