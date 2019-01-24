package ex1220;

/* 날짜 : 2018.12.20
 * 내용 : Inner class (내부 클래스)
 * 기타 : 익명 클래스 (Anonymous class) 
 * */

interface Test11 {
	public void print();
}

class Ex11 {
	public Object getAnonymous() {
		return new Object() {

			@Override
			public String toString() {
				return "test";
			}
			
		};
	}
	
	public void method() {
		System.out.println(getAnonymous());
	}
	
	public void sub() {
		//Test11 t = new Test11(); // [컴파일 에러] interface는 객체 생성 불가
		
		Test11 t = new Test11() {

			@Override
			public void print() {
				System.out.println("aaa");
			}
			
		};
		
		t.print();
	}
}

public class Anonymous_Ex {

	public static void main(String[] args) {
		Ex11 ob = new Ex11();
		ob.method();
	}

}
