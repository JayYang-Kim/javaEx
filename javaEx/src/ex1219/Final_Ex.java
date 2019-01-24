package ex1219;

/* 날짜 : 2018.12.19
 * 내용 : Singleton Pattern
 * 기타 : 해당 클래스의 인스턴스가 하나만 만들어지고, 어디서든지 그 인스터스에 접근할 수 있도록 한 패턴
 *      자바에서는 생성자를 private로 선언하고, 해당 클래스의 인스턴스에 접근하기 위한 public 메소드를 제공하는 방법으로 싱글턴 패턴을 구현할 수 있다.
 * */

final class Ex3 {
	
}

// [컴파일 오류] final 클래스는 하위 클래스를 가질 수 없음
// 대표적인 final 클래스 : String
/*class Demo3 extends Ex3 {
	
}*/

class Demo3 {
	// final이면서 static인 변수는 대문자로 입력
	public final static double PI = 3.141592;
	public final static int A;
	
	// final static 변수는 static 초기화 블럭에서 초기화 처리
	// static 초기화 블럭
	static {
		A = 10;
	}
	
	// 반드시 초기화 필요 : 선언하면서, 초기화블럭, 생성자에서 가능
	// final 변수는 초기화가 한 번만 가능 (한번은 꼭 해야한다.)
	public final int b = 10; // 초기화 방법 1)
	public final int c; // 초기화 방법 2)
	
	// 생성자
	public Demo3() {
		// A = 65; // [컴파일 오류]
		c = 10; // 초기화 방법 2)
	}
	
	// 초기화 블럭
	{
		//c = 20; // 초기화 방법 3)
	}
	
	public void print() {
		//c = 20; // 변경 불가
		final int x;
		x = 10;
		//x = 20; [컴파일 오류]
		
		System.out.println(x);
	}
	
	// final 메소드
	public final void write() { // 하위클래스에서 재정의 불가
		
	}
}

class Sample3 extends Demo3 {
	// [컴파일 오류] final 메소드는 재정의 불가
	/*public void write() {
		
	}*/
}

public class Final_Ex {

	public static void main(String[] args) {
		//Demo3.PI = 1.14; // [컴파일 오류] final 변수는 값 변경 불가
	}

}
