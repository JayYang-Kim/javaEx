package ex1213;

/* 날짜 : 2018.12.13
 * 내용 : 클래스와 객체 정리 - 참조변수
 * 기타 : 
 * */

// 클래스
class Task4 {
	int a;
	int b = 10;
	
	public void print() {
		System.out.println(a + " : " + b); // [결과] 0 : 10
	}
}

// 클래스
public class Task_Ex4 {
	 
	public static void main(String[] args) {
		Task4 t1;
		Task4 t2 = null;
		
		//t1.print(); // [컴파일 오류] t1객체가 선언만되고 초기화가 되지 않은 상태
		
		//t2.print(); // [런타임 오류] null로 초기화된 상태이며, null은 인스턴스(객체)가 없는 것을 의미
		
		Task4 t3 = new Task4();
		t3.print();
		
		Task4 []t4 = new Task4[5]; // Task4 a1, a2, a3, a4, a5 (동일)
		
		//t4[0].a = 5; // [런타임 오류] 인스턴스(객체) 선언만 했으며 객체가 생성도지 않은 상태에서 인스턴스 변수를 접근
		
		// []t4 인스턴스 객체 선언 (메모리 할당)
		for (int i = 0; i < t4.length; i++) {
			// 배열의 수만큼 객체 선언 및 메모리 할당 처리
			t4[i] = new Task4();
		}
		
		t4[0].a = 5;
		t4[0].b = 10;
		
		System.out.println(t4[0].a); // [결과] 5
		System.out.println(t4[0].b); // [결과] 5
	}
}