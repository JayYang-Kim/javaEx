package ex1213;

/* 날짜 : 2018.12.13
 * 내용 : 클래스와 객체 정리 - 메소드
 * 기타 : 오버로딩(Method Overloading), 바인딩(Binding)
 *      매개변수의 개수가 다르거나 매개변수의 타입이 다른 경우 가능
 * */

// 클래스
class Task9 {
	public void sub() {
		System.out.println("안자 없는 메소드");
	}
	
	/*public int sub() { // [컴파일 오류] 리턴타입은 오버로딩의 조건이 아님.
		return 1;
	}*/
	
	public void sub(int n) {
		System.out.println("int");
	}
	
	public void sub(int n, int s) {
		System.out.println("int, int");
	}
	
	public void sub(short n) {
		System.out.println("short");
	}
	
	public void sub2(int i) { // Integer (int에 대응되는 Class)
		System.out.println("int");
	}
	
	public void sub2(Short i) { // short, Short(short에 대응되는 Class)
		System.out.println("short");
	}
	
	public void sub2(Long i) { // long, Long(long에 대응되는 Class)
		System.out.println("long");
	}
}

// 클래스
public class Task_Ex9 {
	
	public static void main(String[] args) {
		Task9 ob = new Task9();
		byte b = 10;
		
		// 메소드 이름이 같은 경우 매개변수의 타입이 제일 가까운 타입에 들어가게 된다.
		ob.sub(b);
		
		byte c = 10; // 정적 바인딩
		long f = 10; // 정적 바인딩

		ob.sub2(c); // [결과] int / 자료형이 크거나 같은 기본 자료형중 가장 가까운 자료형 호출 (동적 바인딩)
		ob.sub2(f); // [결과] long / 크거나 같은 기본 자료형이 없는 경우 기본 자료형에 대응되는 클래스 (동적 바인딩)
	}
	
}