package ex1212;

/* 날짜 : 2018.12.12
 * 내용 : 메소드 (Method)
 * 기타 : 
 * */

class Ex3 {
	// 인스턴스 변수
	int x = 10; // 동일한 패키지에서만 접근 가능
	private int y = 20; // 클래스 외부에서는 접근 불가
	
	// 클래스 변수
	public static int z = 30; 
	
	// 인스턴스 메소드
	public void sub1() {
		sub2();
		System.out.println(x + " : " + y + " : " + z);
	}
	
	// private 메소드 (클래스 내부에서만 사용가능)
	private void sub2() {
		System.out.println("private 메소드");
	}
	
	// 클래스 메소드
	// 인스턴스 변수 접근 불가능
	public static void sub3() {
		//System.out.println(x); // 컴파일 오류
		System.out.println("static 메소드 : " + z);
		
		Ex3 o = new Ex3(); // 객체 생성 및 메모리 할당
		System.out.println(o.x);
	}
}

public class Method_Ex3 {
	int a = 10; // 인스턴스 변수
	public void write() {
		System.out.println("a : " + a);
	}
	
	// 인스턴스 변수는 클래스 메소드에 사용불가 
	// main에서 static을 지우게 된다면 클래스 메소드가있는 main을 찾는다.
	public static void main(String[] args) {
		// System.out.println(a); // [컴파일 오류] 클래스 메소드에 인스턴스 변수는 들어올 수 없다.
		// write(); [컴파일 오류]
		
		Method_Ex3 oo = new Method_Ex3();
		System.out.println(oo.a);
		oo.write();
		
		// 클래스 변수는 바로 출력 가능 로딩 하면서 메모리 할당을 받기 때문
		System.out.println(Ex3.z);
		
		Ex3.sub3(); // 클래스 메소드 호출
		
		Ex3 ee = new Ex3(); // 객체 생성 및 메모리 할당
		ee.sub1();
		//ee.sub2(); // private는 클래스 외부에서 접근 불가
		
	}

}
