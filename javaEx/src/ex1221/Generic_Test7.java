package ex1221;

/* 날짜 : 2018.12.21
 * 내용 : 제네릭 (Generics)
 * 기타 : 와일드 카드
 * */

class Test7<T> {
	private T t;
	
	public void set(T t) {
		this.t = t;
	}
	
	public T get() {
		System.out.println(t.getClass());
		
		return t;
	}
	
	public void print() {
		System.out.println(t);
	}
}

public class Generic_Test7 {

	public static void main(String[] args) {
		Test7<Integer> t = new Test7<>();
		t.set(100);
		
		//Test7<Number> n = t; // [컴파일 오류] 상속 관계가 아님
		Test7<?> t2 = t; // [와일드 카드] <?> 타입이 결정되지 않은 상태
		                 // <?> : List의 Size(), clear()등에서 구체적인 자료형이 필요없는 경우 사용된다.
		
		//t2.set(10); // [컴파일 오류] <?>는 타입 결정이 안된 상태
		//((Test7<Integer>)t2).set(20); // [경고]
		
		t2.print(); // [가능] T에 의존적이지 않으므로 사용 가능
	}

}
