package ex1221;

/* 날짜 : 2018.12.21
 * 내용 : 제네릭 (Generics)
 * 기타 : 
 * */

class Test4<T, U> {
	private T t;
	private U u;
	
	public void set(T t, U u) {
		this.t = t;
		this.u = u;
	}
	
	public void print() {
		System.out.println(t.getClass().getName()); // 제네릭 자료형 확인
		System.out.println(u.getClass().getName()); // 제네릭 자료형 확인
	}
}

public class Generic_Test4 {

	public static void main(String[] args) {
		Test4<String, Integer> t1 = new Test4<>();
		
		t1.set("korea", 1000);
		t1.print();
	}

}
