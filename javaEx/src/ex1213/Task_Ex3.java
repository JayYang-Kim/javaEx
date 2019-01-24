package ex1213;

/* 날짜 : 2018.12.13
 * 내용 : 클래스와 객체 정리 - 참조변수
 * 기타 : 
 * */

// 클래스
class Task3 {
	// 필드
	int a = 10; // 인스턴스 변수 
	int b = 20; // 인스턴스 변수
	
	private static int c = 5; // 클래스 변수 / private 클래스 외부에서 사용 불가
	
	static int d = 2; // 클래스 변수
	
	// 메소드
	public void print() { // 인스턴스 메소드
		System.out.println(a + " : " + b + " : " + d); // [결과] 10 : 20
	}
	
	static void print2() { // 클래스 메소드
		//System.out.println(a + " : " + b); // 인스턴스 변수는 클래스 메소드에서 사용 불가
		System.out.println(d); // [결과] 2
	}
}

// 클래스
public class Task_Ex3 {
	 
	public static void main(String[] args) {
		Task3 t3 = new Task3(); // 객체 선언 및 생성 (메모리 할당)
		
		// 위에꺼와 동일
		Task3 t4; // 객체 선언 
		//System.out.println(t4.a); // [컴파일 오류] 객체가 생성되지 않음
		t4 = new Task3(); // 객체 생성 (메모리 할당)
		System.out.println(t4.a);
		
		t3.print(); 
		
		//System.out.println(Task3.c); // [컴파일 오류] private 클래스 변수는 클래스 외부에서 사용 불가
		System.out.println(Task3.d); // [결과] 2 / 클래스 변수와 클래스 메소드는 인스턴스(객체) 생성 없이 바로 클래스 이름으로 접근이 가능
		System.out.println(); // [결과] 2
		
		Task3.print2(); // 클래스 변수와 클래스 메소드는 인스턴스(객체) 생성 없이 바로 클래스 이름으로 접근이 가능
		
		t3.b = 30;
		t4 = t3; // t4와 t3은 동일한 인스턴스(객체) 참조
		
		System.out.println(t3.b + " : " + t4.b); // [결과] 30 : 30
	}
}