package ex1227;

/* 날짜 : 2018.12.27
 * 내용 : Lambda
 * 기타 : 익명 클래스
 * 		매개변수가 있고, 리턴 타입이 void인 경우
 * */

@FunctionalInterface // Lambda를 사용하기 위한 인터페이스에서 적용
interface Demo12 {
	public void print(int n);
}

public class Lambda_Ex3 { // Lambda_Ex$1.class
	public static void main(String[] args) {	
		//Demo12 d = (int a) -> {int n = a + 10; System.out.println(n);};
		//Demo12 d = (a) -> {int n = a + 10; System.out.println(n);};
		//Demo12 d = a -> {int n = a + 10; System.out.println(n);};
		Demo12 d = a -> System.out.println(a + 10);
		
		d.print(10);
	}
}
