package ex1213;

/* ��¥ : 2018.12.12
 * ���� : this �׽�Ʈ
 * ��Ÿ : 
 * */

class Test5 {
	private int a = 10;
	private static int b = 20;
	
	public void sub1() {
		// this.b�� ���������� Ŭ���� ������ ��ü ������ ��������Ƿ� this.b�� ǥ������ �ʴ´�.
		System.out.println(this.a + " : " + b);
		//System.out.println(a + " : " + b); // ��� ���� / sub1�޼ҵ忡 �Ű������� ���� ������ ��� ����
		
		write();
		//this.write(); // ����
	}
	
	private void write() {
		System.out.println("write");
	}
	
	// static �޼ҵ�� this Ű���带 ����� �� ����.
	// static �޼ҵ�� ��ü ������ ���þ���.
	// static �޼ҵ�� �ν��Ͻ� ���� ȣ�� �Ұ�
	public static void sub2() {
		//System.out.println(this.a); // ������ ����
		
		System.out.println(b);
	}
}

public class This_Ex2 {

	public static void main(String[] args) {
		
	}

}