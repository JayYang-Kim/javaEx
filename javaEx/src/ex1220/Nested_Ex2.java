package ex1220;

/* 날짜 : 2018.12.20
 * 내용 : Inner class (내부 클래스)
 * 기타 : Member class 
 * */

// 외부 클래스
// 접근제어자는 default나 public만 사용가능
class Ex9 {
	static int a = 10; // 클래스 변수
	int b = 20; // 인스턴스 변수
	
	//Test ob = new Test();
	
	// 내부 클래스 (member class)
	// 외부에서 static 중첩 클래스처럼 단독으로 객체 생성이 불가능
	// 외부클래스의 객체를 먼저 생상하고 생성된 객체를 이용하여 객체 생성이 가능
	// 접근제어자 모두 사용 가능
	public class Test {
		int c = 30;
		
		public void write() {
			System.out.println(a + " : " + b + " : " + "c");
		}
	}
	
	public void method() {
		Test ob = new Test();
		System.out.println(ob.c);
	}
}

public class Nested_Ex2 {

	public static void main(String[] args) {
		//Test ob = new Test(); // [컴파일 오류] 내부 클래스는 외부에서 독립적으로 객체 생성 불가
		//Ex9.Test ee = new Ex9.Test(); // [컴파일 오류] 단독 객체 생성 불가능
		
		// 내부 객체 생성
		Ex9 e = new Ex9();
		Ex9.Test t = e.new Test();
		t.write();
	}

}
