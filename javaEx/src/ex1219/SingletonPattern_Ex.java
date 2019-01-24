package ex1219;

/* 날짜 : 2018.12.19
 * 내용 : Singleton Pattern
 * 기타 : 해당 클래스의 인스턴스가 하나만 만들어지고, 어디서든지 그 인스터스에 접근할 수 있도록 한 패턴
 *      자바에서는 생성자를 private로 선언하고, 해당 클래스의 인스턴스에 접근하기 위한 public 메소드를 제공하는 방법으로 싱글턴 패턴을 구현할 수 있다.
 * */

// Singleton
class Ex2 {
	private static Ex2 ob;
	private int a = 10;
	
	private Ex2() {
		
	}
	
	public static synchronized Ex2 getInstance() { // synchronized : 동기화 
		if (ob == null) {
			ob = new Ex2();
		}
		
		return ob;
	}
	
	public void print() {
		System.out.println(a);
	}
}

public class SingletonPattern_Ex {

	public static void main(String[] args) {
		//Ex2 e = new Ex2(); // [컴파일 오류] 생성자가 private일 경우 외부에서 객체 생성 불가능
		
		Ex2 e = Ex2.getInstance();
		Ex2 e2 = Ex2.getInstance();
		
		if (e == e2) {
			System.out.println("같은 객체 입니다.");
		}
	}

}
