package ex1213;

/* 날짜 : 2018.12.12
 * 내용 : 메소드 오버로딩 (Method Overloading) / 중복정의
 * 기타 : 매개변수의 개수가 다르거나 매개변수의 타입이 다른 경우 가능
 * */

class Ex5 {
	public void sub(int i) { // Integer (int에 대응되는 Class)
		System.out.println("int");
	}
	
	public void sub(Short i) { // short, Short(short에 대응되는 Class)
		System.out.println("short");
	}
	
	public void sub(Long i) { // long, Long(long에 대응되는 Class)
		System.out.println("long");
	}
}

public class Method_Ex5 {
	public static void main(String[] args) {
		Ex5 oo = new Ex5();
		
		byte b = 10; // 정적 바인딩
		long c = 10; // 정적 바인딩 
		
		oo.sub(b); // [결과] int / 자료형이 크거나 같은 기본 자료형중 가장 가까운 자료형 호출 (동적 바인딩)
		oo.sub(c); // [결과] long / 크거나 같은 기본 자료형이 없는 경우 기본 자료형에 대응되는 클래스 (동적 바인딩)
	}

}
