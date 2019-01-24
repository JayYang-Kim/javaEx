package ex1218;

/* 날짜 : 2018.12.18
 * 내용 : 상속 (Inheritance)
 * 기타 : 
 * */

class Test2 {
	// 필드
	private int a = 10; // Sample2에서 사용 불가능
	int b = 20;
	public int c = 30;
	
	// 메소드
	public void write() {
		System.out.println(a + " : " + b + " : " + c);
	}
	
	public static void sub() {
		System.out.println("static 메소드");
	}
}

// Test2는 Sample2의 Super Class
// Sample2는 Test2의 Sub Class
class Sample2 extends Test2 {
	int c = 40;
	int d = 50;
	
	public void print() {
		//System.out.println(a); // [컴파일 오류] Super Class에 private 접근 불가
		System.out.println(b); // [결과] 20 / Super Class의 b를 사용
		System.out.println(this.b); // [결과] 20 
		System.out.println(c); // [결과] 40 / 필드 이름이 동일한 경우 자기 자신이 우선 순위가 높다.
		System.out.println(super.c); // [결과] 30 / 슈퍼클래스이 필드에 접근
		
		write();
	}
}

public class Ingeritance_Ex {

	public static void main(String[] args) {
		Sample2 ob = new Sample2();
		
		System.out.println(ob.b);
		ob.write();
		ob.print();
		
		//Test2.sub();
		//Sample2.sub();
		ob.sub(); 
		//Test2.sub();
	}

}
