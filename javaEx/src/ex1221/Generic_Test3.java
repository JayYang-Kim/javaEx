package ex1221;

/* 날짜 : 2018.12.21
 * 내용 : 제네릭 (Generics)
 * 기타 : 제한된 타입 파라미터
 * */

class Test3<T extends Number> {
	private T t;
	
	public void set(T t) {
		this.t = t;
	}
	
	public T get() {
		System.out.println(t.getClass().getName()); // 제네릭 자료형 확인
		return t;
	}
}

public class Generic_Test3 {

	public static void main(String[] args) {
		Test3<Integer> t1 = new Test3<>();
		System.out.println(t1.get());
		
		//Test3<String> t2 = new Test3<>(); // [컴파일 오류] Number의 하위만 가능
	}

}
