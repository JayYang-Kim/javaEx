package ex1213;

/* ��¥ : 2018.12.13
 * ���� : Ŭ������ ��ü ���� - �޼ҵ�
 * ��Ÿ : 
 * */

// Ŭ����
class Task6 {
	int a = 10; // �ν��Ͻ� ����
	static int b = 20; // Ŭ���� ����
	
	// �޼ҵ� 
	// �޼ҵ� ���� Ÿ���� int��
	public int max(int a, int b) { // �Ű�����(��������)
		// ��������
		int result;
		
		if(a > b) {
			result = a;
		} else {
			result = b;
		}
		
		// �޼ҵ� ���ϰ� / �޼ҵ带 ȣ���Ѱ����� ��ȯ
		return result;
	}
	
	public void gugudan(int n) {
		int s;
		System.out.println(n + "�� : ");
		
		for (int i = 1; i <= 9; i++) {
			s = n * i;
			
			System.out.printf("%d * %d = %d \t", n, i, n * i);
		}
		
		// retrun; ���� ����
	}
	
	// �ν��Ͻ� �޼ҵ�
	public void print() {
		System.out.println(a + " : " + b); // �ν��Ͻ�, Ŭ���� ���� ��� ����
	}
	
	// �ν��Ͻ� �޼ҵ�
	public void write() {
		print(); // �ν��Ͻ� �޼ҵ� ��� ����
		sub1(); // Ŭ���� �޼ҵ� ��� ����
	}
	
	public static void sub1() {
		// print(); // [������ ����] �ν��Ͻ� �޼ҵ�� �ٷ� ȣ�� �Ұ�
		//System.out.println(a); // [������ ����] �ν��Ͻ� ������ �ٷ� ���� �Ұ�
		Task6 t = new Task6(); // ��ü ����
		t.print(); // �ν��Ͻ� �޼ҵ� ȣ�� (��ü ���� �� ȣ�� ����)
		
		System.out.println(t.a); // [���] 10
		System.out.println(b); // [���] 20 / Ŭ���� ������ �ٷ� ��� ����
	}
	
	public static void sub2() {
		Task6 t = new Task6(); // ��ü ����
		System.out.println(t.a); // �ν��Ͻ� ������ ��ü�� ���� ȣ�� ����
		
		System.out.println(Task6.b); // Ŭ���� ������ ��ü �������� Ŭ���� �̸����� ������ ����
	}
}

// Ŭ����
public class Task_Ex6 {
	
	public static void main(String[] args) {
		Task6 t = new Task6();
		
		int n;
		int x = 10, y = 5;
		
		// n = �޼ҵ带 �����ϰ� ���� ����� ��ȯ����
		// ���� ����� �޴� �ڷ����� ���ų� �۾ƾ��Ѵ�. (n�� double�̳� long�� ��� ������ ����)
		n = t.max(x, y);
		
		System.out.println(x + " , " + y + "�� ū�� : " + n);
		
		int dan = 2;
		t.gugudan(dan);
	}
}