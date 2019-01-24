package ex1212;

/* 날짜 : 2018.12.12
 * 내용 : 메소드 (Method)
 * 기타 : 
 * */

class Ex4 {
	int a = 10;
	public void sub1(int x) { // x 형식매개변수
		x = 10;
	}
	
	public void sub2(Ex4 e) {
		System.out.println("sub2 : " + e.a); // [결과] 5
		
		e.a = 100;
		System.out.println("sub2 : ==>" + e.a); // [결과] 100
	}
}

public class Method_Ex4 {
	public static void main(String[] args) {
		Ex4 oo = new Ex4();
		
		int n = 5;
		
		oo.sub1(n); // n 실매개변수 (Call by value)
		System.out.println(n); // [결과] 5
		
		System.out.println("main : " + oo.a); // [결과] 10
		oo.a = 5;
		System.out.println("main : " + oo.a); // [결과] 5
		oo.sub2(oo); // Call by reference
		System.out.println("main : " + oo.a); // [결과] 100
	}
}
