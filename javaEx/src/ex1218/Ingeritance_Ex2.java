package ex1218;

/* ��¥ : 2018.12.18
 * ���� : ��� (Inheritance)
 * ��Ÿ : Ŭ���� ��Ӱ� ������
 * */

class Test3 {
	// �ʵ�
	int a = 10;
	int b = 10;
	
	// ������
	// �����ڸ� ������ ���� ��쿡�� public Test3() {} ó�� �����Ϸ��� ����Ʈ �����ڸ� �������
	public Test3() {
		System.out.println("super Ŭ������ ������");
	}
	
	// �żҵ�
	public void write() {
		System.out.println(a + " : " + b);
	}
}

class Sample3 extends Test3 {
	int b = 100;
	int c = 200;
	
	public Sample3() {
		// super(); // super();�� ������ �����Ϸ��� �ڵ� �߰� (������ ����)
		System.out.println("sub class ������");
	}
	
	public void print() {
		System.out.println(a + " : " + super.b + " : " + b + " : " + c);
	}
}

public class Ingeritance_Ex2 {

	public static void main(String[] args) {
		Sample3 ob = new Sample3();
	}

}
