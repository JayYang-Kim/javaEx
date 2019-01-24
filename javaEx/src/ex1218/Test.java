package ex1218;

/* 날짜 : 2018.12.18
 * 내용 : 하위 클래스 (Sub class) 
 * 기타 :  
 * */

class A {
	private int x = 10;
	protected int y = 20;
	public int z = 30;
	
	public void disp() {
		System.out.println(x + " : " + y + " : " + z);
	}
}

class B extends A {
	int a = 100;
	public void write() {
		System.out.print("a : " + a + ", ");
		System.out.print("y : " + y + ", ");
		System.out.print("z : " + z); 
		System.out.println();
		//System.out.println("x : " + x); // [컴파일 오류] class x 변수가 private접근제어로 되어있어서 다른 클래스에서 사용 불가
	}
	
	public void sub() {
		disp();
	}
}

public class Test {

	public static void main(String[] args) {
		B ob = new B(); // 객체 생성
		ob.write(); // a : 100, y : 20, z : 30
		ob.disp(); // [결과] 10 : 20 : 30
		System.out.println(ob.z); // [결과] 30
	}

}
