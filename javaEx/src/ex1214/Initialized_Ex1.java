package ex1214;

/* ��¥ : 2018.12.14
 * ���� : �ʱ�ȭ
 * ��Ÿ : 
 * */

class Ex1 {
	private int a;
	private int b = 10;
	//a = 10; [������ ����] ���๮�� �� �� ����.
	public static int x = 5;
	public static int y;

	// �ʱ�ȭ �� : �����ں��� ���� ����. ��ü�� �����ɶ����� ����
	{
		System.out.println("�ʱ�ȭ ��");
	}
	
	// staitc �ʱ�ȭ �� : Ŭ������ �ε��ɶ� �� ���� ����
	static {
		System.out.println("static �ʱ�ȭ ��");
	}
	
	// ������
	public Ex1() {
		System.out.println("������");
	}
	
	// �޼ҵ�
	public void print() { // �ν��Ͻ� �޼ҵ�
		System.out.println(a + " : " + b);
	}
	
	public static void write() { // Ŭ���� �޼ҵ�
		System.out.println(x + " : " + y);
	}
}

public class Initialized_Ex1 {

	public static void main(String[] args) {
		//Ex1 e; // static �ʱ�ȭ ���� ������� ����
		Ex1.write(); // static �ʱ�ȭ �� ����
		
		Ex1 e1 = new Ex1(); // 1) static �ʱ�ȭ ��
		                    // 2) �ʱ�ȭ ��
		                    // 3) ������ ��ü
		
		Ex1 e2 = new Ex1(); // 1) �ʱ�ȭ ��
		                    // 2) ������ ��ü
		
		//Ex1 e1 = new Ex1(); // ��ü ���� (�޸� �Ҵ�)
		//Ex1 e2 = new Ex1(); // ��ü ���� (�޸� �Ҵ�)
	}

}
