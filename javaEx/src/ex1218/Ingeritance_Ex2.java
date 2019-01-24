package ex1218;

/* 날짜 : 2018.12.18
 * 내용 : 상속 (Inheritance)
 * 기타 : 클래스 상속과 생성자
 * */

class Test3 {
	// 필드
	int a = 10;
	int b = 10;
	
	// 생성자
	// 생성자를 만들지 않은 경우에만 public Test3() {} 처럼 컴파일러가 디폴트 생성자를 만들어줌
	public Test3() {
		System.out.println("super 클래스의 생성자");
	}
	
	// 매소드
	public void write() {
		System.out.println(a + " : " + b);
	}
}

class Sample3 extends Test3 {
	int b = 100;
	int c = 200;
	
	public Sample3() {
		// super(); // super();가 없으면 컴파일러가 자동 추가 (보이지 않음)
		System.out.println("sub class 생성자");
	}
	
	public void print() {
		System.out.println(a + " : " + super.b + " : " + b + " : " + c);
	}
}

public class Ingeritance_Ex2 {

	public static void main(String[] args) {
		Sample3 ob = new Sample3();
	}

}
