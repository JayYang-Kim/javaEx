package ex1220;

/* 날짜 : 2018.12.20
 * 내용 : Inner class (내부 클래스)
 * 기타 : Local class 
 * */

class Ex10 {
	static int a = 10;
	int b = 20;
	
	public void write() {
		int c = 30, e = 100;
		final int d = 40;
		
		class Test {
			public void print() {
				System.out.println(a + " : " + b + " : " + d);
				System.out.println(c); // jdk7.0은 오류, 8.0은 가능
			}
		}
		
		//e = 50;
		//c = 100; // [오류] final로 변경됨
		
		Test t = new Test();
		t.print();
	}
}

public class Local_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
