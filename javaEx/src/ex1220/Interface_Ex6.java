package ex1220;

/* 날짜 : 2018.12.20
 * 내용 : Interface
 * 기타 : default, static
 * */

// 인터페이스 설계
interface Ex6 {
	public void print();
	public default void write() { // default 메소드 (jdk8.0)
		System.out.println("write");
	}
	public static void method() { // static 메소드 (jdk8.0)
		System.out.println("static");
	}
}

//인터페이스 구현
class ExImpl6 implements Ex6 {
	// default 메소드인 write()도 재정의 가능하다.
	
	@Override
	public void print() {
		System.out.println("print");
	}
	
}

public class Interface_Ex6 {
	
	public static void main(String[] args) {
		Ex6.method(); // static 메소드는 클래스명.메소드()를 입력하여 객체생성 없이 호출가능
		//Ex6.write(); // [컴파일 오류] default메소드는 객체 생성이 필요함
		
		ExImpl6 oo = new ExImpl6();
		oo.write();
		oo.print();
	}

}
