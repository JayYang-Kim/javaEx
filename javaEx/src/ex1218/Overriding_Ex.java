package ex1218;

/* 날짜 : 2018.12.18
 * 내용 : 메소드 오버라이딩(Method Overriding)
 * 기타 : 
 * */

class Test6 {
	int x = 10;
	
	public void print() {
		System.out.println("x : " + x);
	}
}

class Sample6 extends Test6 {
	int y = 20;
	
	// 메소드 오버라이딩(재정의) : 상위 클래스의 메소드를 재정의
	@Override
	// 어노테이션 : 컴파일 할 때 컴파일러에게 코드 문법 에러를 체크하도록 제공
	public void print() { 
		System.out.println("y : " + y);
	}
	
	public void sub() {
		//print(); // 자기 자신의 클래스의 메소드 호출
		super.print(); // super 클래스의 메소드 호출
	}
}

public class Overriding_Ex {

	public static void main(String[] args) {
		Sample6 ob = new Sample6();
		ob.print();
	}

}
