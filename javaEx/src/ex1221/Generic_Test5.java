package ex1221;

/* 날짜 : 2018.12.21
 * 내용 : 제네릭 (Generics)
 * 기타 : 제네릭 메소드
 * */

class Test5 {
	public <U> void print(U u) {
		System.out.println(u.getClass()); // 제네릭 자료형 확인
	}
	
	public <U> U method(U u) {
		System.out.println(u.getClass());
		
		return u;
	}
}

public class Generic_Test5 {

	public static void main(String[] args) {
		Test5 oo = new Test5();
		
		oo.print("seoul");
		oo.print(50);
		
		String s = oo.method("korea");
		System.out.println(s.length());
	}

}
