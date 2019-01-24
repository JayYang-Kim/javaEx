package ex1220;

/* 날짜 : 2018.12.20
 * 내용 : Interface
 * 기타 : 인터페이스는 다중 상속이 가능하다.
 * */

// 인터페이스 설계
interface Ex2 {
	public void print();
}

interface Test2 {
	public void write();
}

// 인터페이스 구현
// 인터페이스는 다중 상속이 가능하다.
class ExImpl2 implements Ex2, Test2 {

	@Override
	public void write() {
		System.out.println("write");	
	}

	@Override
	public void print() {
		System.out.println("print");
	}
	
}

public class Interface_Ex2 {

	public static void main(String[] args) {
		ExImpl2 ob = new ExImpl2();
		
		Ex2 ee = ob; // [업캐스팅]
		
		ee.print(); // Ex2의 메소드만 호출 가능
		
		((ExImpl2)ee).write(); // [다운캐스팅]

	}

}
