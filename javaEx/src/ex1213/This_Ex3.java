package ex1213;

/* ��¥ : 2018.12.12
 * ���� : this �׽�Ʈ
 * ��Ÿ : 
 * */

class Test6 {
	private int a, b;
	
	public Test6() {
		//Test6 (1, 2); // [������ ����] �����ڴ� new ������ �θ� �� �ִ�.
		
		// �ٸ� ������ ȣ��. ��ü�� �� �����ϴ°��� �ƴ϶� ���� �ٸ� �������� �ڵ带 ����
		// this([�μ�]);�� �������� �� ��ܿ��� �ѹ��� ȣ�� ����
		this(1, 2);
		
		System.out.println("���� ���� ������");
	}
	
	public Test6(int a, int b) {
		this.a = a;
		this.b = b;
		
		System.out.println("���� �ִ� ������");
	}
	
	public void write() {
		System.out.println(this.a + " : " + this.b);
		//System.out.println(a + " : " + b); // ��밡��
	}
}

public class This_Ex3 {

	public static void main(String[] args) {
		Test6 t = new Test6();
		t.write();
	}

}
