package ex1213;

/* 날짜 : 2018.12.12
 * 내용 : 생성자 (Constructor) 
 * 기타 : 생성자가 클래스에 없는 경우 컴파일러가 인자가 없는 디폴트 생성자를 만들어 준다.
 *      생성자가 있으면 디폴트 생성자를 만들지 않는다.
 * */

class Test2 {
	// 필드
	private int n;
	
	// 생성자
	public Test2(int a) {
		System.out.println("인자가 있는 생성자");
		n = a;
	}
	
	public void write() {
		System.out.println(n);
	}
}

public class Constructor_Ex2 {

	public static void main(String[] args) {
		//Test2 t = new Test2(); // [컴파일 오류] 인자가 없는 생성자가 없으므로 오류
		Test2 t = new Test2(10);
		
		t.write();
	}

}
