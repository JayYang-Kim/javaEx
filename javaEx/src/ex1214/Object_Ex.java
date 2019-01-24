package ex1214;

/* 날짜 : 2018.12.14
 * 내용 : 자바의 기본 API 클래스 - 객체(Object)
 * 기타 : 
 * */

class Ex2 {
	// object 클래스를 상속 받음
	// object : 자바의 최상위 클래스
	private int a = 10;
	private int b = 20;
	
	public void sub() {
		System.out.println(a + " : " + b);
	}
}

public class Object_Ex {
	// object 클래스를 상속 받음
	public static void main(String[] args) {
		Ex2 t1 = new Ex2();
		Ex2 t2 = new Ex2();
		
		// toString()
		// 클래스이름@해쉬코드값
		// 물려받은 자식이 내용을 변경할 수 있다.
		System.out.println(t1.toString()); // [결과] 클래스이름@해쉬코드값
		System.out.println(t2); // [결과] 클래스이름@해쉬코드값
		
		// equals()
		// 주소비교
		System.out.println(t1.equals(t2)); // [결과] false
		System.out.println(t1 == t2); // [결과] false
		
		// hashCode()
		// JVM에서 객체를 빠르게 검색하기 위하여 사용
		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());
	}

}
