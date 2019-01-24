package ex1213;

/* 날짜 : 2018.12.12
 * 내용 : this 테스트
 * 기타 : 
 * */

class Test6 {
	private int a, b;
	
	public Test6() {
		//Test6 (1, 2); // [컴파일 오류] 생성자는 new 다음에 부를 수 있다.
		
		// 다른 생성자 호출. 객체를 또 생성하는것이 아니라 단지 다른 생성자의 코드를 실행
		// this([인수]);는 생성자의 최 상단에서 한번만 호출 가능
		this(1, 2);
		
		System.out.println("인자 없는 생성자");
	}
	
	public Test6(int a, int b) {
		this.a = a;
		this.b = b;
		
		System.out.println("인자 있는 생성자");
	}
	
	public void write() {
		System.out.println(this.a + " : " + this.b);
		//System.out.println(a + " : " + b); // 사용가능
	}
}

public class This_Ex3 {

	public static void main(String[] args) {
		Test6 t = new Test6();
		t.write();
	}

}
