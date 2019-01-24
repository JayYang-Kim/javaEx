package ex1218;

/* 날짜 : 2018.12.18
 * 내용 : 메소드 오버라이딩(Method Overriding)
 * 기타 : 클래스의 형변환시 주의 사항
 *      클래스간의 형변환은 상하관계에서만 가능하다.
 *      업 캐스팅 (상위 클래스의 객체가 하위 클래스의 객체를 가르키는 것)은 언제나 가능
 *      다운 캐스틩 (상위 클래스이 객체를 하위 클래스의 객체로 변환하는것)은 업 캐스팅한것만 가능하고 반드시 명시적으로 캐스팅을 해야 한다. 
 * */

class Test7 {
	int a = 10;
	int b = 20;
	
	public void write() {
		System.out.println(a + " : " + b);
	}
	
	public void disp() {
		System.out.println("결과 : " + a + " , " + b);
	}
}

class Sample7 extends Test7 {
	int b = 100;
	int c = 200;
	
	// 오버라이딩
	@Override
	public void write() {
		System.out.println(a + " : " + b + " : "+ c);
	}
	
	public void method() {
		super.write();
		System.out.println(super.b);
	}
}

public class Overriding_Ex2 {

	public static void main(String[] args) {
		Sample7 ob = new Sample7();
		Test7 tt = new Test7();
		System.out.println(ob.a);
		
		// Up casting / 언제나 가능 / casting 하지 않아도 됨
		Test7 ts = ob;
		
		// Down casting / 다운 캐스팅은 업캐스팅 한것만 가능
		// 다운 캐스팅은 명시적으로 캐스팅을 해야함
		//Sample7 st = tt; // [컴파일 에러]
		
		System.out.println(ts.b); // [결과] 20 / 부모(Test7)의 b
		                          // 업캐스팅 되어도 필드는 자신의 우선순위가 높음
		//System.out.println(ts.c); // [컴파일 오류]
		
		ts.write(); // 자식(Sample7)의  write() 호출
		            // 메소드가 재정의되면 상위 클래스의 메소드는 숨겨진다.
		
		tt.write(); // 자신의 메소드
		
		//Sample7 s = ts; [컴파일 오류]
		Sample7 s = (Sample7)ts;
		System.out.println(s.c);
		
		Sample7 s2 = (Sample7)tt; // [런타임 오류] / 업캐스팅한것만 다운 가능
		s2.write();
	}

}
