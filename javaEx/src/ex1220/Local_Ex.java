package ex1220;

/* ��¥ : 2018.12.20
 * ���� : Inner class (���� Ŭ����)
 * ��Ÿ : Local class 
 * */

class Ex10 {
	static int a = 10;
	int b = 20;
	
	public void write() {
		int c = 30, e = 100;
		final int d = 40;
		
		class Test {
			public void print() {
				System.out.println(a + " : " + b + " : " + d);
				System.out.println(c); // jdk7.0�� ����, 8.0�� ����
			}
		}
		
		//e = 50;
		//c = 100; // [����] final�� �����
		
		Test t = new Test();
		t.print();
	}
}

public class Local_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
