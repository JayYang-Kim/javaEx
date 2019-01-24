package ex1218;

/* 날짜 : 2018.12.18
 * 내용 : 상속 (Inheritance)
 * 기타 : 클래스 상속과 생성자
 * 	    super 클래스의 객체 생성 및 메모리 할당 후 sub 클래스의 객체 생성 및 메모리를 할당
 * */

class Test5 {
	int x;
	
	// 초기화 블럭 : 생성자 보다 먼저 실행된다.
	{
		System.out.println("super 초기화 블럭");
		x = 10;
	}
	
	// 생성자 : 초기화 작업
	public Test5() {
		System.out.println("super 생성자");
	}
	
	public void print() {
		System.out.println(x);
		//System.out.println(y); // [컴파일 오류]
	}
}

class Sample5 extends Test5 {
	int y;
	
	// 초기화 블럭 : 생성자 보다 먼저 실행된다.
	{
		System.out.println("sub 초기화 블럭");
		y = 100;
	}
	
	// 생성자 : 초기화 작업
	public Sample5() {
		System.out.println("sub 클래스 생성자");
	}
	
	public void write() {
		System.out.println(x + " : " + y);
	}
}

public class Ingeritance_Ex4 {

	public static void main(String[] args) {
		Sample5 ob = new Sample5();
		ob.write();
	}

}
