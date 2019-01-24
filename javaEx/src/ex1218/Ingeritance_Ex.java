package ex1218;

/* ��¥ : 2018.12.18
 * ���� : ��� (Inheritance)
 * ��Ÿ : 
 * */

class Test2 {
	// �ʵ�
	private int a = 10; // Sample2���� ��� �Ұ���
	int b = 20;
	public int c = 30;
	
	// �޼ҵ�
	public void write() {
		System.out.println(a + " : " + b + " : " + c);
	}
	
	public static void sub() {
		System.out.println("static �޼ҵ�");
	}
}

// Test2�� Sample2�� Super Class
// Sample2�� Test2�� Sub Class
class Sample2 extends Test2 {
	int c = 40;
	int d = 50;
	
	public void print() {
		//System.out.println(a); // [������ ����] Super Class�� private ���� �Ұ�
		System.out.println(b); // [���] 20 / Super Class�� b�� ���
		System.out.println(this.b); // [���] 20 
		System.out.println(c); // [���] 40 / �ʵ� �̸��� ������ ��� �ڱ� �ڽ��� �켱 ������ ����.
		System.out.println(super.c); // [���] 30 / ����Ŭ������ �ʵ忡 ����
		
		write();
	}
}

public class Ingeritance_Ex {

	public static void main(String[] args) {
		Sample2 ob = new Sample2();
		
		System.out.println(ob.b);
		ob.write();
		ob.print();
		
		//Test2.sub();
		//Sample2.sub();
		ob.sub(); 
		//Test2.sub();
	}

}
