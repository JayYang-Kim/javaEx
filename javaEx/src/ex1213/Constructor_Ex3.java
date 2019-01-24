package ex1213;

/* ��¥ : 2018.12.12
 * ���� : ������ (Constructor) 
 * ��Ÿ : �����ڴ� �ߺ� ���ǰ� �����ϴ�. 
 *      �̸��� �����ϸ� �Ű������� �ٸ� ��� ����
 * */

class Test3 {
	private int n;
	
	// �����ڴ� �ߺ� ���ǰ� �����ϴ�.
	public Test3() {
		System.out.println("���ڰ� ���� ������");
		n = 10;
	}
	
	public Test3(int a) {
		System.out.println("���ڰ� �ִ� ������");
		n = a;
	}
	
	public void write() {
		System.out.println(n);
	}
}

public class Constructor_Ex3 {

	public static void main(String[] args) {
		Test3 t1 = new Test3(); // ���ڰ� ���� ������ ȣ��
		Test3 t2 = new Test3(10); // ���ڰ� �ִ� ������ ȣ��
		
		t1.write(); // [���] 10
		t2.write(); // [���] 10
	}

}
