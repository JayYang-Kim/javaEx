package test;

import java.util.Scanner;

// Checked Exception 발생
class test1 {
	private Scanner sc = new Scanner(System.in);
	int a, b;
	int c;
	
	public void division() throws Exception {
		System.out.println("두 정수를 입력해주세요.");
		a = sc.nextInt();
		b = sc.nextInt();
		
		if (b == 0) {
			throw new Exception("0은 나눌수 없습니다."); // checked exception 발생
		}
		
		int c = a / b;
		
		this.c = c;
	}
}

// Unchecked Exception 발생
class test2 {
	private Scanner sc = new Scanner(System.in);
	int a, b;
	int c;
	
	public void division() {
		System.out.println("두 정수를 입력해주세요.");
		a = sc.nextInt();
		b = sc.nextInt();
		
		if (b == 0) {
			throw new RuntimeException("0은 나눌수 없습니다."); // Runtime exception 발생
		}
		
		int c = a / b;
		
		this.c = c;
	}
}

public class Exception_Ex {
	
	public static void main(String[] args) {
		test1 t = new test1();
		test2 t2 = new test2();
		
		//t.division(); // [컴파일 오류] test1 클래스의 division() 메소드를 호출할 경우, checked exception 발생하여 예외처리 하도록 만듬
		/*try {
			t.division();
			System.out.println(t.c);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.toString());
		}*/
		
		try {
			t2.division();
			System.out.println(t2.c);
		} catch (RuntimeException e) {
			System.out.println(e.toString());
		}
		
		System.out.println("종료");
	}
	
}
