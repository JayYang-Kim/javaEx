package ex1213;

/* ��¥ : 2018.12.12
 * ���� : ������ (Constructor) 
 * ��Ÿ : �����ڴ� �Ϲ� �޼ҵ�ó�� ȣ���� �Ұ����ϴ�.
 *      ��ü�� �����Ҷ� new ������ ���� �����ڸ� ȣ���Ѵ�.
 * */

class Test1 {
	// �ʵ�
	private int n; // ��ü ���� �� �޸� �Ҵ������ 0���� �ʱ�ȭ��
	
	// ������
	public Test1() { // ������ / ����Ÿ���� �������� �ʴ´�. (Class�� �̸��� �����ؾ���)
		// ������ ��ü / ��ü�� �����ɶ��� ȣ�� (�ʱ�ȭ �۾�)
		System.out.println("������");
		n = 10;
	}
	
	public void write() {
		System.out.println(n);
	}
}

public class Constructor_Ex {

	public static void main(String[] args) {
		Test1 t = new Test1(); // �����ڴ� new ������ ����ϸ�, ��ü�� �����Ҷ� ����Ѵ�.
		                       // new = ��ü ����(��ü�� ���� �޸� ������ heep ������ �Ҵ�)
		                       // Test1() = ������ ��ü�� �����Ͽ� �ʱ�ȭ �۾�
		//Test1(); // [������ ����] �����ڴ� new �������� ��� ����
		
		t.write();
	}

}
