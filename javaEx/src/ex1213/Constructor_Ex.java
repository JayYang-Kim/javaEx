package ex1213;

/* 날짜 : 2018.12.12
 * 내용 : 생성자 (Constructor) 
 * 기타 : 생성자는 일반 메소드처럼 호출이 불가능하다.
 *      객체를 생상할때 new 연산자 다음 생성자를 호출한다.
 * */

class Test1 {
	// 필드
	private int n; // 객체 생성 후 메모리 할당받으면 0으로 초기화됨
	
	// 생성자
	public Test1() { // 생성자 / 리턴타입이 존재하지 않는다. (Class와 이름이 동일해야함)
		// 생성자 몸체 / 객체가 생성될때만 호출 (초기화 작업)
		System.out.println("생성자");
		n = 10;
	}
	
	public void write() {
		System.out.println(n);
	}
}

public class Constructor_Ex {

	public static void main(String[] args) {
		Test1 t = new Test1(); // 생성자는 new 다음에 기술하며, 객체를 생성할때 사용한다.
		                       // new = 객체 생성(객체를 위한 메모리 공간을 heep 영역에 할당)
		                       // Test1() = 생성자 몸체를 실행하여 초기화 작업
		//Test1(); // [컴파일 오류] 생성자는 new 다음에만 기술 가능
		
		t.write();
	}

}
