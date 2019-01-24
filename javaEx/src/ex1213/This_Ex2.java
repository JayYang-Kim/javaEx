package ex1213;

/* 날짜 : 2018.12.12
 * 내용 : this 테스트
 * 기타 : 
 * */

class Test5 {
	private int a = 10;
	private static int b = 20;
	
	public void sub1() {
		// this.b는 가능하지만 클래스 변수는 객체 생성과 상관없으므로 this.b로 표현하지 않는다.
		System.out.println(this.a + " : " + b);
		//System.out.println(a + " : " + b); // 사용 가능 / sub1메소드에 매개변수가 없기 때문에 사용 가능
		
		write();
		//this.write(); // 가능
	}
	
	private void write() {
		System.out.println("write");
	}
	
	// static 메소드는 this 키워드를 사용할 수 없다.
	// static 메소드는 객체 생성과 관련없다.
	// static 메소드는 인스턴스 변수 호출 불가
	public static void sub2() {
		//System.out.println(this.a); // 컴파일 오류
		
		System.out.println(b);
	}
}

public class This_Ex2 {

	public static void main(String[] args) {
		
	}

}