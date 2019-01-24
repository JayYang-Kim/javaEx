package ex1227;

/* 날짜 : 2018.12.27
 * 내용 : Lambda
 * 기타 : 익명 클래스
 * 		매개변수가 없고, 리턴타입이 void인 경우
 * */

// 람다식을 위해서는 인터페이스에 메소드가 하나만 존재해야 한다.
interface Demo10 {
	public void print();
}

public class Lambda_Ex2 { // Lambda_Ex$
	public static void main(String[] args) {
		//Demo10 u = () -> {System.out.println("람다식");};
		Demo10 u = () -> System.out.println("람다식"); // 한줄인 경우 {} 제외 가능
		u.print();
	}
}
