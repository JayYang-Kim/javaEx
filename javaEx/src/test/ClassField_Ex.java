package test;

/* ��¥ : 2018.12.12
 * ���� : Class > �ʵ� (Field)
 * ��Ÿ : 
 * */

class Test {
	// �ν��Ͻ� ����
	int a; 
	int b = 10;
	
	// Ŭ���� ����
	static int c = 100;
	
	// �ν��Ͻ� �޼ҵ�
	public void write() {
		int x;
		x = 5;
		System.out.println(a + " : " + b + " : " + c + " :" + x);
	}
	
	public void print() {
		System.out.println(a + " : " + b + " : " + c);
		//System.out.println(x); // [������ ����] ���� ������ ������ �޼ҵ� �������� ��� ����
	}
	
	// Ŭ���� �޼ҵ�
	public static void sub() {
		System.out.println(c);
		//System.out.println(a + " : " + b); [������ ����] Ŭ���� �޼ҵ�� �ν��Ͻ� ������ ����� �� ����.
	}
}

public class ClassField_Ex {

}
