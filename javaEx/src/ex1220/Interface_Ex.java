package ex1220;

/* ��¥ : 2018.12.20
 * ���� : Interface
 * ��Ÿ : �������̽��� �����Ҷ� ���������� : public�� ���𰡴�
 *      1.�������̽� ���� 2.����
 * */

// Interface Ű���� : �߻� Ŭ������ ����
// �߻� Ŭ������ : ���� �ۼ��Ѵ�.
interface Ex1 {
	int sum(int n); // [����] �����Ϸ��� ��ħ -> public abstract int sum(int n);
	//public int sum(int n);
	public void print(String s);
}

// Interface ����
// class�� �߻� Ŭ������ �ƴ� ���, �������̽��� ��� �޼ҵ�� ������ ó���� �ؾ��Ѵ�.
class ExImpl1 implements Ex1 {
	
	// @Override (������̼�) : �����Ǹ� ���Է��ߴ��� üũ���ִ� ���� 
	@Override // jdk5.0 �̸��� ��� ������ �߻��� �� ����
	public int sum(int n) {
		// ��������
		int s = 0; 
		
		// 1 ~ n ������ ��
		for (int i = 1; i <= n; i++) {
			s += i;
		}
		
		return s;
	}

	@Override
	public void print(String s) {
		System.out.println(s);
	}
	
	public void write() {
		System.out.println("write");
	}
	
}

public class Interface_Ex {

	public static void main(String[] args) {
		ExImpl1 ob = new ExImpl1(); // ��ü ����
		
		ob.print("�׽�Ʈ �Դϴ�.");
		
		Ex1 ee = new ExImpl1(); // [��ĳ����]
		
		ee.print("�׽�Ʈ�Դϴ�.");
		//ee.write(); // [������ ����] ���� �� ȣ���ϸ�, �����Ϸ��� write()�޼ҵ尡 Ex1 Ŭ������ �ִ��� Ȯ���Ѵ�.
		
		((ExImpl1)ee).write(); // [�ٿ�ĳ����] - ����ó��
		
		ExImpl1 ee2 = (ExImpl1)ee; // [�ٿ�ĳ����] - ����ó��
		ee2.write();
	}

}
