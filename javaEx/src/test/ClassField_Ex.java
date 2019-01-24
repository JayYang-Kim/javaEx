package test;

/* 날짜 : 2018.12.12
 * 내용 : Class > 필드 (Field)
 * 기타 : 
 * */

class Test {
	// 인스턴스 변수
	int a; 
	int b = 10;
	
	// 클래스 변수
	static int c = 100;
	
	// 인스턴스 메소드
	public void write() {
		int x;
		x = 5;
		System.out.println(a + " : " + b + " : " + c + " :" + x);
	}
	
	public void print() {
		System.out.println(a + " : " + b + " : " + c);
		//System.out.println(x); // [컴파일 오류] 지역 변수는 선언한 메소드 내에서만 사용 가능
	}
	
	// 클래스 메소드
	public static void sub() {
		System.out.println(c);
		//System.out.println(a + " : " + b); [컴파일 오류] 클래스 메소드는 인스턴스 변수를 사용할 수 없다.
	}
}

public class ClassField_Ex {

}
