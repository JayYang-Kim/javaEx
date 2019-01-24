package ex1220;

/* 날짜 : 2018.12.20
 * 내용 : Nested Class (중첩 클래스)
 * 기타 : static 중첩 클래스 
 * */

// 클래스 파일명 : Ex8$Test.class (외부클래스명$중첩클래스명.class)
class Ex8 {
	static int a = 10;
	int b = 20;
	
	// static 중첩 클래스 (static nested class)
	// 외부 클래스 객체를 생성하지 않고 외부에서 객체를 생성하여 사용할 수 있다. 
	public static class Test {
		int c = 30;
		
		// 메소드
		public void write() {
			//System.out.println(b); // [컴파일 오류] 외부 클래스의 인스턴스 변수나 메소드 접근 불가
			System.out.println(a); // 클래스 변수는 접근 가능
			System.out.println(c);
			
			Ex8 ex = new Ex8();
			System.out.println(ex.b);
			
		}
	}
	
	public void print() {
		Test t = new Test();
		System.out.println(t.c);
		System.out.println(Ex8.a);
	}
}

public class Nested_Ex {

	public static void main(String[] args) {
		Ex8 ee = new Ex8();
		ee.print();
		
		//Test tt = new Test(); // [컴파일 오류]
		
		// static 중첩 클래스는 외부 클래스의 객체 생성과 상관없이 단독으로 객체를 생성한다.
		Ex8.Test tt = new Ex8.Test();
		tt.write();
		
		//Ex8.Test tt2 = ee.new Test(); // [컴파일 오류]
	}

}
