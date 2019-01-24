package ex1227;

/* 날짜 : 2018.12.27
 * 내용 : Lambda
 * 기타 : 익명 클래스
 * */

@FunctionalInterface // Lambda를 사용하기 위한 인터페이스에서 적용
interface User12 {
	public int add(int a, int b);
}

public class Lambda_Ex4 { 
	public static void main(String[] args) {	
		//User12 u = (a, b) -> {int c = a + b; return c;};
		//User12 u = (a, b) -> {return a + b;};	
		User12 u = (a, b) -> a + b;
		
		System.out.println(u.add(10, 5));
	}
}
