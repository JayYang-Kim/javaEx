package ex1213;

/* ��¥ : 2018.12.13
 * ���� : Ŭ������ ��ü ���� - ���� �� �ʵ�
 * ��Ÿ : �ʵ��� ���� ������
 *      1) private : Ŭ������ ���ο����� ���ٰ����ϸ� �ܺο��� ���� �Ұ�
 *      2) ����(����Ʈ) : ������ ��Ű���� �ִ� Ŭ���������� ���� ����
 *      3) protected : ������ ��Ű���� �ִ� Ŭ���� �� ����Ŭ�������� ������ ����
 *      4) public : ������� ��𿡼��� ������ ����
 * */

// Ŭ����
class Task2 {
	// �ʵ�
	int x = 10; // ������ ��Ű�������� ���� ����
	private int y = 20; // Ŭ���� �ܺο����� ���� �Ұ�
	
	public static int z = 30; // Ŭ���� ���� 
	
	public void sub1() { // �ν��Ͻ� �޼ҵ�
		int a = 10;
		
		sub2();
		System.out.println(x + " : " + y + " : " + z); // �ν��Ͻ� �޼ҵ忡�� Ŭ���� ���� ��� ����
	}
	
	// private �޼ҵ� (Ŭ���� ���ο����� ��밡��)
	private void sub2() { // �ν��Ͻ� �޼ҵ�
		System.out.println("private �޼ҵ�");
		//System.out.println(a); // [������ ����] ���������� ������ �޼ҵ忡���� ��� ����
	}
	
	public static void sub3() { // Ŭ���� �޼ҵ� : �ν��Ͻ� ���� ���� �Ұ���
		//System.out.println(x); // [������ ����] Ŭ���� �޼ҵ忡 �ν��Ͻ� ���� ���� �Ұ�
		System.out.println("static �޼ҵ� : " + z); // Ŭ���� ������ ��� ����
		
		Task2 o = new Task2(); // Task2 Ŭ���� ��ü ���� �� �޸� �Ҵ�
		System.out.println(o.x);
	}
}

// Ŭ����
public class Task_Ex2 {
	// �ʵ�
	int a = 10; // �ν��Ͻ� ����
	
	private static int b = 11;
	
	// �޼ҵ�
	public void write() {
		System.out.println("a : " + a);
	}
	
	// �ν��Ͻ� ������ Ŭ���� �޼ҵ忡 ���Ұ� 
	public static void main(String[] args) {
		// System.out.println(a); // [������ ����] Ŭ���� �޼ҵ忡 �ν��Ͻ� ������ ���� �� ����.
		// write(); [������ ����]
		System.out.println(b); // [���] 11
		
		Task_Ex2 oo = new Task_Ex2(); // ��ü ���� (�޸� �Ҵ�)
		System.out.println(oo.a); // [���] 10
		oo.write(); // [���] a : 10
		
		// Ŭ���� ������ �ٷ� ��� ���� �ε� �ϸ鼭 �޸� �Ҵ��� �ޱ� ����
		System.out.println(Task2.z); // [���] 30
		//System.out.println(Task2.x); // [������ ����]  
		
		Task2.sub3(); // Ŭ���� �޼ҵ� ȣ��
		
		Task2 ee = new Task2(); // ��ü ���� �� �޸� �Ҵ�
		ee.sub1();
		//ee.sub2(); // [������ ����] private �޼ҵ�� Ŭ���� �ܺο��� ���� �Ұ�
	}

}