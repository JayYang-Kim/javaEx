package ex1203;

/* 날짜 : 2018.12.03
 * 내용 : 변수 테스트
 * 기타 : 2200000000은 int 상수이며 int 표현범위가 넘어서 컴파일 오류가 발생
 * */
public class VarEx {

	public static void main(String[] args) {
		/* byte */
		byte a; // a는 초기화 되지 않은 상태
		//System.out.println(a); // [컴파일 오류] a는 초기화가 되자 않아 실행문에서 사용불가
		a = 10;
		System.out.println("a : " + a); // 문자열 + 다른 자료형 -> 문자열 (결합)
		
		byte b = 20, c = 30; // 선언과 동시에 초기화
		System.out.println("b : " + b + " c : " + c);
		
		//byte d = 200; // [컴파일 오류] byte 표현범위 : -128 ~ 127
		
		/* int */
		//int a; // [컴파일 오류] 동일한 영역에서 변수는 중복이 불가능 
		int x = 10;
		//int y = 2200000000; // [컴파일 오류] 표현범위를 넘어감
		System.out.println("x : " + x);
		
		/* long */
		//long y = 2200000000; // [컴파일 오류] 2200000000은 int 상수이며 int 표현범위 넘김 (overflow발생)
		long y = 2200000000L;
		long z = 1000000000;
		
		System.out.println("y : " + y + " z : " + z);
	}

}
