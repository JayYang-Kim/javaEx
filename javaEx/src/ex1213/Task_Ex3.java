package ex1213;

/* ��¥ : 2018.12.13
 * ���� : Ŭ������ ��ü ���� - ��������
 * ��Ÿ : 
 * */

// Ŭ����
class Task3 {
	// �ʵ�
	int a = 10; // �ν��Ͻ� ���� 
	int b = 20; // �ν��Ͻ� ����
	
	private static int c = 5; // Ŭ���� ���� / private Ŭ���� �ܺο��� ��� �Ұ�
	
	static int d = 2; // Ŭ���� ����
	
	// �޼ҵ�
	public void print() { // �ν��Ͻ� �޼ҵ�
		System.out.println(a + " : " + b + " : " + d); // [���] 10 : 20
	}
	
	static void print2() { // Ŭ���� �޼ҵ�
		//System.out.println(a + " : " + b); // �ν��Ͻ� ������ Ŭ���� �޼ҵ忡�� ��� �Ұ�
		System.out.println(d); // [���] 2
	}
}

// Ŭ����
public class Task_Ex3 {
	 
	public static void main(String[] args) {
		Task3 t3 = new Task3(); // ��ü ���� �� ���� (�޸� �Ҵ�)
		
		// �������� ����
		Task3 t4; // ��ü ���� 
		//System.out.println(t4.a); // [������ ����] ��ü�� �������� ����
		t4 = new Task3(); // ��ü ���� (�޸� �Ҵ�)
		System.out.println(t4.a);
		
		t3.print(); 
		
		//System.out.println(Task3.c); // [������ ����] private Ŭ���� ������ Ŭ���� �ܺο��� ��� �Ұ�
		System.out.println(Task3.d); // [���] 2 / Ŭ���� ������ Ŭ���� �޼ҵ�� �ν��Ͻ�(��ü) ���� ���� �ٷ� Ŭ���� �̸����� ������ ����
		System.out.println(); // [���] 2
		
		Task3.print2(); // Ŭ���� ������ Ŭ���� �޼ҵ�� �ν��Ͻ�(��ü) ���� ���� �ٷ� Ŭ���� �̸����� ������ ����
		
		t3.b = 30;
		t4 = t3; // t4�� t3�� ������ �ν��Ͻ�(��ü) ����
		
		System.out.println(t3.b + " : " + t4.b); // [���] 30 : 30
	}
}