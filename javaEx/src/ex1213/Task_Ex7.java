package ex1213;

/* 날짜 : 2018.12.13
 * 내용 : 클래스와 객체 정리 - 메소드
 * 기타 : 
 * */

// 클래스
class Task7 {
	int a = 10;
	
	public void sub1(int x) { // x 형식매개변수
		x = 10;
	}
	
	public void sub2(Task7 e) {
		System.out.println("sub2 : " + e.a); // [결과] 5
		
		e.a = 100;
		System.out.println("sub2 : ==>" + e.a); // [결과] 100
	}
	
	public void sub(int[] n) {
		n[1] = 70;
	}
}

// 클래스
public class Task_Ex7 {
	
	public static void main(String[] args) {
		Task7 oo = new Task7();
		
		int n = 5;
		
		oo.sub1(n); // n 실매개변수 (Call by value)
		System.out.println(n); // [결과] 5
		
		System.out.println("main : " + oo.a); // [결과] 10
		oo.a = 5;
		System.out.println("main : " + oo.a); // [결과] 5
		oo.sub2(oo); // Call by reference
		System.out.println("main : " + oo.a); // [결과] 100
		
		int []a = new int[] {10, 20, 30};
		System.out.println(a[1]); // [결과] 20
		
		oo.sub(a);
		System.out.println(a[1]); // [결과] 70
	}
	
}