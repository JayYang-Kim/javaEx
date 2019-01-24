package ex1213;

/* 날짜 : 2018.12.12
 * 내용 : 생성자 (Constructor) 
 * 기타 : 생성자는 중복 정의가 가능하다. 
 *      이름은 동일하며 매개변수가 다를 경우 가능
 * */

class Test3 {
	private int n;
	
	// 생성자는 중복 정의가 가능하다.
	public Test3() {
		System.out.println("인자가 없는 생성자");
		n = 10;
	}
	
	public Test3(int a) {
		System.out.println("인자가 있는 생성자");
		n = a;
	}
	
	public void write() {
		System.out.println(n);
	}
}

public class Constructor_Ex3 {

	public static void main(String[] args) {
		Test3 t1 = new Test3(); // 인자가 없는 생성자 호출
		Test3 t2 = new Test3(10); // 인자가 있는 생성자 호출
		
		t1.write(); // [결과] 10
		t2.write(); // [결과] 10
	}

}
