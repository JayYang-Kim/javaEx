package ex1219;

/* 날짜 : 2018.12.19
 * 내용 : instanceof 연산자
 * 기타 : 주어진 객체가 어떤 클래스 또는 그 클래스가 상속하는 하위 클래스의 인스턴스 인지를 검사
 *      연산 결과는 boolean을 리턴한다.
 * */

class Ex1 {
	int a = 10;
	public void print() {
		System.out.println(a);
	}
}

class Demo1 extends Ex1 {
	int a = 0;
	int b = 20;
	int c = 30;
	
	public void print() {
		System.out.println(a + " : " + b + " : " + c + super.a);
	}
	
	public void write() {
		System.out.println(b + " : " + c);
	}
}

public class Instanceof_Ex {

	public static void main(String[] args) {
		Ex1 a1 = new Demo1(); // [업캐스팅]
		Ex1 a2 = new Ex1();
		
		a1.print(); // Demo1 메소드 호출
		System.out.println(a1.a); // Ex1의 a 출력
		
		//a1.write(); // [컴파일 오류]
		Demo1 b1 = (Demo1)a1; // [다운캐스팅]
		b1.write();
		
		//Demo1 b2 = (Demo1)a2; //[런타임 오류] 다운캐스팅은 업캐스팅한것만 사용
		
		// instanceof 어떤 객체인지 확인
		System.out.println(a1 instanceof Demo1); // [결과] true
		System.out.println(a2 instanceof Demo1); // [결과] false
		
		if (a1 instanceof Demo1) {
			Demo1 c1 = (Demo1)a1; // 다운캐스팅
			System.out.println("다운캐스팅 1");
			c1.write();
		}
		
		if (a2 instanceof Demo1) {
			Demo1 c1 = (Demo1)a2; // 다운캐스팅
			System.out.println("다운캐스팅 2");
			c1.write();
		}
	}

}