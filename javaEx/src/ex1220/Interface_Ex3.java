package ex1220;

/* 날짜 : 2018.12.20
 * 내용 : Interface
 * 기타 : 인터페이스는 다중 상속이 가능하다.
 * */

// 인터페이스 설계
interface Aex3 {
	public void print();
}

interface Bex3 {
	public void write();
}

interface Ex3 extends Aex3, Bex3 {
	public void sub();
}

// 인터페이스 구현
class ExImpl3 implements Ex3 {

	@Override
	public void print() {
		System.out.println("print");
	}

	@Override
	public void write() {
		System.out.println("write");
	}

	@Override
	public void sub() {
		System.out.println("sub");
	}
	
}

public class Interface_Ex3 {

	public static void main(String[] args) {
		Ex3 ob = new ExImpl3(); // [업캐스팅]
		
		ob.sub();
		ob.print();
		ob.write();
	}

}
