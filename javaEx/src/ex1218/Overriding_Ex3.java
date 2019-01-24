package ex1218;

/* 날짜 : 2018.12.18
 * 내용 : 메소드 오버라이딩(Method Overriding)
 * 기타 :  
 * */

class Test8 {
	String name;
	int score;
	
	public Test8() {
		
	}
	
	public Test8(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	public void print() {
		System.out.println(name + " : " + score);
	}
}

public class Overriding_Ex3 {

	public static void main(String[] args) {
		Test8 t1 = new Test8("java", 80);
		Test8 t2 = new Test8("java", 80);
		
		System.out.println(t1 == t2); // [결과] false (주소 비교)
		System.out.println(t1.equals(t2)); // [결과] false (주소 비교)
		
		System.out.println(t1); // [결과] 클래스명@해쉬코드
		System.out.println(t1.toString()); // [결과] 클래스명@해쉬코드
	}
}
