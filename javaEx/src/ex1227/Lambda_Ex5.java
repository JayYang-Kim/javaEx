package ex1227;

/* 날짜 : 2018.12.27
 * 내용 : Lambda
 * 기타 : 익명 클래스
 * */

@FunctionalInterface // Lambda를 사용하기 위한 인터페이스에서 적용
interface User13 {
	public void method();
}

class Demo13 {
	int x = 10;
	
	public void sub() {
		int y = 10;
		
		User13 u = () -> {
			System.out.println(this); // this는 익명 개체가 아니라 람다식을 구현한 클래스를 의미
			System.out.println(x);
			System.out.println(y);
		};
		
		// y = 20; // 변경하면 안됨
		
		u.method();
	}
}

public class Lambda_Ex5 { 
	public static void main(String[] args) {	
		Demo13 o = new Demo13();
		o.sub();
	}
}
