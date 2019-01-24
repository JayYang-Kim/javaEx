package ex1213;

/* ��¥ : 2018.12.13
 * ���� : Ŭ������ ��ü ���� - ��������
 * ��Ÿ : 
 * */

// Ŭ����
class Task4 {
	int a;
	int b = 10;
	
	public void print() {
		System.out.println(a + " : " + b); // [���] 0 : 10
	}
}

// Ŭ����
public class Task_Ex4 {
	 
	public static void main(String[] args) {
		Task4 t1;
		Task4 t2 = null;
		
		//t1.print(); // [������ ����] t1��ü�� ���𸸵ǰ� �ʱ�ȭ�� ���� ���� ����
		
		//t2.print(); // [��Ÿ�� ����] null�� �ʱ�ȭ�� �����̸�, null�� �ν��Ͻ�(��ü)�� ���� ���� �ǹ�
		
		Task4 t3 = new Task4();
		t3.print();
		
		Task4 []t4 = new Task4[5]; // Task4 a1, a2, a3, a4, a5 (����)
		
		//t4[0].a = 5; // [��Ÿ�� ����] �ν��Ͻ�(��ü) ���� ������ ��ü�� �������� ���� ���¿��� �ν��Ͻ� ������ ����
		
		// []t4 �ν��Ͻ� ��ü ���� (�޸� �Ҵ�)
		for (int i = 0; i < t4.length; i++) {
			// �迭�� ����ŭ ��ü ���� �� �޸� �Ҵ� ó��
			t4[i] = new Task4();
		}
		
		t4[0].a = 5;
		t4[0].b = 10;
		
		System.out.println(t4[0].a); // [���] 5
		System.out.println(t4[0].b); // [���] 5
	}
}