package ex1220;

/* ��¥ : 2018.12.20
 * ���� : �͸��� Ŭ����
 * ��Ÿ : 
 * */

// �������̽� ����
interface Ex7 {
	public void print();
}

class Test7 {
	public void method() {
		// �͸��� Ŭ����(���� ����) : Ŭ������ �ʿ������� �̸��� ���� Ŭ����
		Ex7 ob = new Ex7() { // Ŭ������ : Test7$1.class
			
			@Override
			public void print() {
				System.out.println("���");
			}
			
		}; // �͸��� Ŭ������ {};�� �������Ѵ�.
		
		ob.print();
	}
}

public class Interface_Ex7 {
	
	public static void main(String[] args) {
		Test7 t = new Test7();
		t.method();
	}

}
