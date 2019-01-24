package ex1220;

/* 날짜 : 2018.12.20
 * 내용 : Interface
 * 기타 : final, static 
 * */

// 인터페이스 설계
interface Ex5 {
	int A = 10; // public final static int A = 10; (동일)
	
	public void print();
}

//인터페이스 구현
class ExImpl5 implements Ex5 {

	@Override
	public void print() {
		System.out.println("print");
		
	}

}

public class Interface_Ex5 {
	
	public static void main(String[] args) {
		System.out.println(Ex5.A);
	}

}
