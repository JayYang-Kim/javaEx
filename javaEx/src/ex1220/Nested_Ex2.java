package ex1220;

/* ��¥ : 2018.12.20
 * ���� : Inner class (���� Ŭ����)
 * ��Ÿ : Member class 
 * */

// �ܺ� Ŭ����
// ���������ڴ� default�� public�� ��밡��
class Ex9 {
	static int a = 10; // Ŭ���� ����
	int b = 20; // �ν��Ͻ� ����
	
	//Test ob = new Test();
	
	// ���� Ŭ���� (member class)
	// �ܺο��� static ��ø Ŭ����ó�� �ܵ����� ��ü ������ �Ұ���
	// �ܺ�Ŭ������ ��ü�� ���� �����ϰ� ������ ��ü�� �̿��Ͽ� ��ü ������ ����
	// ���������� ��� ��� ����
	public class Test {
		int c = 30;
		
		public void write() {
			System.out.println(a + " : " + b + " : " + "c");
		}
	}
	
	public void method() {
		Test ob = new Test();
		System.out.println(ob.c);
	}
}

public class Nested_Ex2 {

	public static void main(String[] args) {
		//Test ob = new Test(); // [������ ����] ���� Ŭ������ �ܺο��� ���������� ��ü ���� �Ұ�
		//Ex9.Test ee = new Ex9.Test(); // [������ ����] �ܵ� ��ü ���� �Ұ���
		
		// ���� ��ü ����
		Ex9 e = new Ex9();
		Ex9.Test t = e.new Test();
		t.write();
	}

}
