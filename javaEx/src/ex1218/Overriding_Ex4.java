package ex1218;

/* 날짜 : 2018.12.18
 * 내용 : 메소드 오버라이딩(Method Overriding)
 * 기타 :  
 * */

class Test9 {
	String name;
	int score;
	
	public Test9() {
		
	}
	
	public Test9(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	public void print() {
		System.out.println(name + " : " + score);
	}

	@Override
	public boolean equals(Object obj) { // (Object obj) Up casting
		//System.out.println(//obj.name); // [컴파일 오류]
		//String s = (Test9)obj.name; // [컴파일 오류] obj.name을 Test9으로 다운 캐스팅 한다.
		                              // 연산자 우선순위가 ()보다 .이 더 높다.
		
		String s = ((Test9)obj).name;
		//System.out.println(s);
		
		
		Test9 t = (Test9)obj; // Down casting (Up casting한 것만 가능)
		// name => this.name // t1의 name
		//System.out.println(t.name);
		
		return this.name.equals(t.name) && this.score == t.score;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + " : " + score;
	}
}

public class Overriding_Ex4 {

	public static void main(String[] args) {
		Test9 t1 = new Test9("java", 80);
		Test9 t2 = new Test9("java", 80);
		
		System.out.println(t1 == t2); // [결과] false
		System.out.println("equals = " + t1.equals(t2)); // [결과] false
		
		System.out.println(t1); // [결과] 클래스명@해쉬코드
		System.out.println("toString = " + t1.toString()); // [결과] 클래스명@해쉬코드
	}
}