package ex1220;

/* 날짜 : 2018.12.20
 * 내용 : Interface
 * 기타 : 인터페이스는 선언할때 접근제어자 : public만 선언가능
 *      1.인터페이스 설계 2.구현
 * */

// Interface 키워드 : 추상 클래스의 일종
// 추상 클래스는 : 선언만 작성한다.
interface Ex1 {
	int sum(int n); // [선언] 컴파일러가 고침 -> public abstract int sum(int n);
	//public int sum(int n);
	public void print(String s);
}

// Interface 구현
// class가 추상 클래스가 아닌 경우, 인터페이스의 모든 메소드는 재정의 처리를 해야한다.
class ExImpl1 implements Ex1 {
	
	// @Override (어노테이션) : 재정의를 잘입력했는지 체크해주는 역할 
	@Override // jdk5.0 미만일 경우 오류가 발생할 수 있음
	public int sum(int n) {
		// 지역변수
		int s = 0; 
		
		// 1 ~ n 까지의 합
		for (int i = 1; i <= n; i++) {
			s += i;
		}
		
		return s;
	}

	@Override
	public void print(String s) {
		System.out.println(s);
	}
	
	public void write() {
		System.out.println("write");
	}
	
}

public class Interface_Ex {

	public static void main(String[] args) {
		ExImpl1 ob = new ExImpl1(); // 객체 생성
		
		ob.print("테스트 입니다.");
		
		Ex1 ee = new ExImpl1(); // [업캐스팅]
		
		ee.print("테스트입니다.");
		//ee.write(); // [컴파일 오류] 실행 시 호출하며, 컴파일러는 write()메소드가 Ex1 클래스에 있는지 확인한다.
		
		((ExImpl1)ee).write(); // [다운캐스팅] - 한줄처리
		
		ExImpl1 ee2 = (ExImpl1)ee; // [다운캐스팅] - 두줄처리
		ee2.write();
	}

}
