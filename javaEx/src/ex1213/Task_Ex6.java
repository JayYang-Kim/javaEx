package ex1213;

/* 날짜 : 2018.12.13
 * 내용 : 클래스와 객체 정리 - 메소드
 * 기타 : 
 * */

// 클래스
class Task6 {
	int a = 10; // 인스턴스 변수
	static int b = 20; // 클래스 변수
	
	// 메소드 
	// 메소드 리턴 타입이 int형
	public int max(int a, int b) { // 매개변수(지역변수)
		// 지역변수
		int result;
		
		if(a > b) {
			result = a;
		} else {
			result = b;
		}
		
		// 메소드 리턴값 / 메소드를 호출한곳으로 반환
		return result;
	}
	
	public void gugudan(int n) {
		int s;
		System.out.println(n + "단 : ");
		
		for (int i = 1; i <= 9; i++) {
			s = n * i;
			
			System.out.printf("%d * %d = %d \t", n, i, n * i);
		}
		
		// retrun; 생략 가능
	}
	
	// 인스턴스 메소드
	public void print() {
		System.out.println(a + " : " + b); // 인스턴스, 클래스 변수 사용 가능
	}
	
	// 인스턴스 메소드
	public void write() {
		print(); // 인스턴스 메소드 사용 가능
		sub1(); // 클래스 메소드 사용 가능
	}
	
	public static void sub1() {
		// print(); // [컴파일 오류] 인스턴스 메소드는 바로 호출 불가
		//System.out.println(a); // [컴파일 오류] 인스턴스 변수는 바로 접근 불가
		Task6 t = new Task6(); // 객체 생성
		t.print(); // 인스턴스 메소드 호출 (객체 생성 후 호출 가능)
		
		System.out.println(t.a); // [결과] 10
		System.out.println(b); // [결과] 20 / 클래스 변수는 바로 사용 가능
	}
	
	public static void sub2() {
		Task6 t = new Task6(); // 객체 생성
		System.out.println(t.a); // 인스턴스 변수는 객체를 통해 호출 가능
		
		System.out.println(Task6.b); // 클래스 변수는 객체 생성없이 클래스 이름으로 접근이 가능
	}
}

// 클래스
public class Task_Ex6 {
	
	public static void main(String[] args) {
		Task6 t = new Task6();
		
		int n;
		int x = 10, y = 5;
		
		// n = 메소드를 실행하고 실행 결과를 반환받음
		// 실행 결과를 받는 자료형이 같거나 작아야한다. (n이 double이나 long일 경우 컴파일 오류)
		n = t.max(x, y);
		
		System.out.println(x + " , " + y + "중 큰수 : " + n);
		
		int dan = 2;
		t.gugudan(dan);
	}
}