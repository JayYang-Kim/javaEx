package ex1213;

/* ��¥ : 2018.12.12
 * ���� : ������ (Constructor) 
 * ��Ÿ : �����ڰ� Ŭ������ ���� ��� �����Ϸ��� ���ڰ� ���� ����Ʈ �����ڸ� ����� �ش�.
 *      �����ڰ� ������ ����Ʈ �����ڸ� ������ �ʴ´�.
 * */

class Test2 {
	// �ʵ�
	private int n;
	
	// ������
	public Test2(int a) {
		System.out.println("���ڰ� �ִ� ������");
		n = a;
	}
	
	public void write() {
		System.out.println(n);
	}
}

public class Constructor_Ex2 {

	public static void main(String[] args) {
		//Test2 t = new Test2(); // [������ ����] ���ڰ� ���� �����ڰ� �����Ƿ� ����
		Test2 t = new Test2(10);
		
		t.write();
	}

}
