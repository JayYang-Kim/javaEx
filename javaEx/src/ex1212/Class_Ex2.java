package ex1212;

/* 날짜 : 2018.12.12
 * 내용 : Class public 접근 권한 테스트
 * 기타 : class에서 필드변수와 지역변수의 식별자를 동일하게 할 수 있다. (우선순위 : 필드변수 < 지역변수)
 * */

class Test2 {
	// 필드 : 인스턴스 변수 + 클래스 변수
	// 인스턴스 변수 / 객체가 메모리를 할당 받을 때 마다 새로운 저장 공간을 할당 받는다. (사람이 메모리 생성)
	int a; // 필드는 초기화하지 않으면 정수형 변수는 0으로 초기화
	private int b = 10; // 선언하면서 초기화 가능
	
	static int c = 10; // 클래스 변수 / 클래스가 로딩될 때 단 한번 메모리가 할당 받는다. (이클립스 프로그램이 죽을때 메모리 할당 안받음)
	
	// Method는 역할(Action)
	public void sub1() { // 인스턴스 메소드 (소스)
		System.out.println(a + " : " + b + " : " + c);
	}
	
	public static void sub2() { // 클래스 메소드 (소스)
		//System.out.println(a); // [컴파일 오류] 인스턴스 변수는 사용 불가
		System.out.println("클래스 메소드 : " + c); // 클래스 변수는 호출 가능
	}
}

public class Class_Ex2 {

	public static void main(String[] args) {
		// 객체 선언
		Test2 ob;
		
		//System.out.println(ob.a); // [컴파일 오류] 객체는 메모리를 할당해야 사용 가능
		System.out.println(Test2.c); // 클래스 변수나 클래스 메소드는 메모리 할당과 상관없이 클래스 이름을 이용하여 바로 접급 가능
		
		Test2.sub2(); // 클래스 메소드 호출
		
		//Test2.sub1(); // [컴파일 오류] 인스턴스 메소드는 객체를 통해서만 접근 가능, 메모리할당을 하지 않은 경우 사용 불가
		
		// 객체의 메모리 할당
		ob = new Test2(); // Test2() 생성자는 클래스와 이름이 동일하며, 가장 중요한 역할은 객체 생성이다. (메모리 할당)
		
		// 객체 선언과 동시에 메모리 할당
		Test2 ob2 = new Test2();
		
		ob2.a = 10;
		
		System.out.println("ob.a : " + ob.a);
		System.out.println("ob2.a : " + ob2.a);
		
		//System.out.println(ob.b); // [컴파일 오류] private는 외부에서 접근 불가
		
		// @해쉬코드 : 자바내에서 검색할때 사용
		System.out.println(ob + " : " + ob2); //클래스이름@해쉬코드
		
		//Test2 []oo = new Test2[3]; // Test2 클래스를 객체 3개를 생성 (Test a1, a2, a3;와 동일)
		
		//System.out.println(oo[0].a); // [런타임 오류] 메모리 할당이 안된 상태
	}

}
