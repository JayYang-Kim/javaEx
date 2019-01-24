package ex1218;

/* ��¥ : 2018.12.18
 * ���� : �޼ҵ� �������̵�(Method Overriding)
 * ��Ÿ : 
 * */

class Test6 {
	int x = 10;
	
	public void print() {
		System.out.println("x : " + x);
	}
}

class Sample6 extends Test6 {
	int y = 20;
	
	// �޼ҵ� �������̵�(������) : ���� Ŭ������ �޼ҵ带 ������
	@Override
	// ������̼� : ������ �� �� �����Ϸ����� �ڵ� ���� ������ üũ�ϵ��� ����
	public void print() { 
		System.out.println("y : " + y);
	}
	
	public void sub() {
		//print(); // �ڱ� �ڽ��� Ŭ������ �޼ҵ� ȣ��
		super.print(); // super Ŭ������ �޼ҵ� ȣ��
	}
}

public class Overriding_Ex {

	public static void main(String[] args) {
		Sample6 ob = new Sample6();
		ob.print();
	}

}
