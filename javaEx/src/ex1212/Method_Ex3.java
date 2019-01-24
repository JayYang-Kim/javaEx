package ex1212;

/* ��¥ : 2018.12.12
 * ���� : �޼ҵ� (Method)
 * ��Ÿ : 
 * */

class Ex3 {
	// �ν��Ͻ� ����
	int x = 10; // ������ ��Ű�������� ���� ����
	private int y = 20; // Ŭ���� �ܺο����� ���� �Ұ�
	
	// Ŭ���� ����
	public static int z = 30; 
	
	// �ν��Ͻ� �޼ҵ�
	public void sub1() {
		sub2();
		System.out.println(x + " : " + y + " : " + z);
	}
	
	// private �޼ҵ� (Ŭ���� ���ο����� ��밡��)
	private void sub2() {
		System.out.println("private �޼ҵ�");
	}
	
	// Ŭ���� �޼ҵ�
	// �ν��Ͻ� ���� ���� �Ұ���
	public static void sub3() {
		//System.out.println(x); // ������ ����
		System.out.println("static �޼ҵ� : " + z);
		
		Ex3 o = new Ex3(); // ��ü ���� �� �޸� �Ҵ�
		System.out.println(o.x);
	}
}

public class Method_Ex3 {
	int a = 10; // �ν��Ͻ� ����
	public void write() {
		System.out.println("a : " + a);
	}
	
	// �ν��Ͻ� ������ Ŭ���� �޼ҵ忡 ���Ұ� 
	// main���� static�� ����� �ȴٸ� Ŭ���� �޼ҵ尡�ִ� main�� ã�´�.
	public static void main(String[] args) {
		// System.out.println(a); // [������ ����] Ŭ���� �޼ҵ忡 �ν��Ͻ� ������ ���� �� ����.
		// write(); [������ ����]
		
		Method_Ex3 oo = new Method_Ex3();
		System.out.println(oo.a);
		oo.write();
		
		// Ŭ���� ������ �ٷ� ��� ���� �ε� �ϸ鼭 �޸� �Ҵ��� �ޱ� ����
		System.out.println(Ex3.z);
		
		Ex3.sub3(); // Ŭ���� �޼ҵ� ȣ��
		
		Ex3 ee = new Ex3(); // ��ü ���� �� �޸� �Ҵ�
		ee.sub1();
		//ee.sub2(); // private�� Ŭ���� �ܺο��� ���� �Ұ�
		
	}

}
