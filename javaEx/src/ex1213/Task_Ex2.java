package ex1213;

/* 날짜 : 2018.12.13
 * 내용 : 클래스와 객체 정리 - 개요 및 필드
 * 기타 : 필드의 접근 제어자
 *      1) private : 클래스의 내부에서만 접근가능하며 외부에서 접근 불가
 *      2) 생략(디폴트) : 동일한 패키지에 있는 클래스에서만 접근 가능
 *      3) protected : 동일한 패키지에 있는 클래스 및 서브클래스에서 접근이 가능
 *      4) public : 제약없이 어디에서나 접근이 가능
 * */

// 클래스
class Task2 {
	// 필드
	int x = 10; // 동일한 패키지에서만 접근 가능
	private int y = 20; // 클래스 외부에서는 접근 불가
	
	public static int z = 30; // 클래스 변수 
	
	public void sub1() { // 인스턴스 메소드
		int a = 10;
		
		sub2();
		System.out.println(x + " : " + y + " : " + z); // 인스턴스 메소드에서 클래스 변수 사용 가능
	}
	
	// private 메소드 (클래스 내부에서만 사용가능)
	private void sub2() { // 인스턴스 메소드
		System.out.println("private 메소드");
		//System.out.println(a); // [컴파일 오류] 지역변수는 선언한 메소드에서만 사용 가능
	}
	
	public static void sub3() { // 클래스 메소드 : 인스턴스 변수 접근 불가능
		//System.out.println(x); // [컴파일 오류] 클래스 메소드에 인스턴스 변수 접근 불가
		System.out.println("static 메소드 : " + z); // 클래스 변수는 사용 가능
		
		Task2 o = new Task2(); // Task2 클래스 객체 생성 및 메모리 할당
		System.out.println(o.x);
	}
}

// 클래스
public class Task_Ex2 {
	// 필드
	int a = 10; // 인스턴스 변수
	
	private static int b = 11;
	
	// 메소드
	public void write() {
		System.out.println("a : " + a);
	}
	
	// 인스턴스 변수는 클래스 메소드에 사용불가 
	public static void main(String[] args) {
		// System.out.println(a); // [컴파일 오류] 클래스 메소드에 인스턴스 변수는 들어올 수 없다.
		// write(); [컴파일 오류]
		System.out.println(b); // [결과] 11
		
		Task_Ex2 oo = new Task_Ex2(); // 객체 생성 (메모리 할당)
		System.out.println(oo.a); // [결과] 10
		oo.write(); // [결과] a : 10
		
		// 클래스 변수는 바로 출력 가능 로딩 하면서 메모리 할당을 받기 때문
		System.out.println(Task2.z); // [결과] 30
		//System.out.println(Task2.x); // [컴파일 오류]  
		
		Task2.sub3(); // 클래스 메소드 호출
		
		Task2 ee = new Task2(); // 객체 생성 및 메모리 할당
		ee.sub1();
		//ee.sub2(); // [컴파일 오류] private 메소드는 클래스 외부에서 접근 불가
	}

}