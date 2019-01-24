package ex1213;

/* 날짜 : 2018.12.12
 * 내용 : 메소드 오버로딩 (Method Overloading) / 중복정의
 * 기타 : 매개변수의 개수가 다르거나 매개변수의 타입이 다른 경우 가능
 * */

class Ex4 {
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
}

public class Method_Ex4 {
	public static void main(String[] args) {
		Ex4 ob = new Ex4();
		byte b = 10;
		
		// 메소드 이름이 같은 경우 매개변수의 타입이 제일 가까운 타입에 들어가게 된다.
		ob.sub(b);
	}

}
