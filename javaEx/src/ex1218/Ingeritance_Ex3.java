package ex1218;

/* 날짜 : 2018.12.18
 * 내용 : 상속 (Inheritance)
 * 기타 : 클래스 상속과 생성자
 * */

class Test4 {
	int x;
	
	public Test4(int x) {
		//super();
		this.x = x;
	}
	
	public void print() {
		System.out.println(x);
	}
}

class Sample4 extends Test4 {
	// super 클래스의 생성자에 인자가 있을 경우, sub 클래스에서 반드시 생성자를 생성해야함
	public Sample4() {
		//super();
		//Test4(10) // [컴파일 오류] 생성자는 new 다음에 작성할 수 있음
		this(10); // 생성자의 최상위에 존재해야함
		//super(10); // [컴파일 오류] this([인수]); 또는 super([인수]);
	}
	
	public Sample4(int x) {
		super(x); // 생성자의 최상위에 존재해야함
	}
}

public class Ingeritance_Ex3 {

	public static void main(String[] args) {
		
	}

}
