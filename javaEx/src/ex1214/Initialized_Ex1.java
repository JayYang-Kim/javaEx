package ex1214;

/* 날짜 : 2018.12.14
 * 내용 : 초기화
 * 기타 : 
 * */

class Ex1 {
	private int a;
	private int b = 10;
	//a = 10; [컴파일 오류] 실행문이 올 수 없다.
	public static int x = 5;
	public static int y;

	// 초기화 블럭 : 생상자보다 먼저 실행. 객체가 생성될때마다 실행
	{
		System.out.println("초기화 블럭");
	}
	
	// staitc 초기화 블럭 : 클래스가 로딩될때 한 번만 실행
	static {
		System.out.println("static 초기화 블럭");
	}
	
	// 생성자
	public Ex1() {
		System.out.println("생성자");
	}
	
	// 메소드
	public void print() { // 인스턴스 메소드
		System.out.println(a + " : " + b);
	}
	
	public static void write() { // 클래스 메소드
		System.out.println(x + " : " + y);
	}
}

public class Initialized_Ex1 {

	public static void main(String[] args) {
		//Ex1 e; // static 초기화 블럭도 실행되지 않음
		Ex1.write(); // static 초기화 블럭 실행
		
		Ex1 e1 = new Ex1(); // 1) static 초기화 블럭
		                    // 2) 초기화 블럭
		                    // 3) 생산자 몸체
		
		Ex1 e2 = new Ex1(); // 1) 초기화 블럭
		                    // 2) 생산자 몸체
		
		//Ex1 e1 = new Ex1(); // 객체 생성 (메모리 할당)
		//Ex1 e2 = new Ex1(); // 객체 생성 (메모리 할당)
	}

}
