package ex1213;

/* 날짜 : 2018.12.12
 * 내용 : this 테스트
 * 기타 : 호출하는 객체 자기 자신을 나타냄
 * */

class Test4 {
	private String name;
	private int age;
	
	public Test4() {
		
	}
	
	public Test4(String name, int a) {
		this.name = name; // this를 생략하면 다른 결과
		age = a; // 가능
		// this.age = a;
	}
	
	public void write() {
		// name = this.name + " : " + this.age
		// this = 호출하는 객체 자기 자신을 나타냄
		System.out.println(name + " : " + age);
		//System.out.println(this.name + " : " + this.age); // this를 생략 가능
	}
}

public class This_Ex {

	public static void main(String[] args) {
		Test4 t1 = new Test4("감자바", 10);
		Test4 t2 = new Test4("이자바", 15);
		
		t1.write(); // [결과] 감자바 : 10
		t2.write(); // [결과] 이자바: 15
	}

}
