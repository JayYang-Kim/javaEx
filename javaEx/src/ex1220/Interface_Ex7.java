package ex1220;

/* 날짜 : 2018.12.20
 * 내용 : 익명의 클래스
 * 기타 : 
 * */

// 인터페이스 설계
interface Ex7 {
	public void print();
}

class Test7 {
	public void method() {
		// 익명의 클래스(지역 변수) : 클래스는 필요하지만 이름이 없는 클래스
		Ex7 ob = new Ex7() { // 클래스명 : Test7$1.class
			
			@Override
			public void print() {
				System.out.println("출력");
			}
			
		}; // 익명의 클래스는 {};을 찍어줘야한다.
		
		ob.print();
	}
}

public class Interface_Ex7 {
	
	public static void main(String[] args) {
		Test7 t = new Test7();
		t.method();
	}

}
