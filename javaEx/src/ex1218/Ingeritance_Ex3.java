package ex1218;

/* ��¥ : 2018.12.18
 * ���� : ��� (Inheritance)
 * ��Ÿ : Ŭ���� ��Ӱ� ������
 * */

class Test4 {
	int x;
	
	public Test4(int x) {
		//super();
		this.x = x;
	}
	
	public void print() {
		System.out.println(x);
	}
}

class Sample4 extends Test4 {
	// super Ŭ������ �����ڿ� ���ڰ� ���� ���, sub Ŭ�������� �ݵ�� �����ڸ� �����ؾ���
	public Sample4() {
		//super();
		//Test4(10) // [������ ����] �����ڴ� new ������ �ۼ��� �� ����
		this(10); // �������� �ֻ����� �����ؾ���
		//super(10); // [������ ����] this([�μ�]); �Ǵ� super([�μ�]);
	}
	
	public Sample4(int x) {
		super(x); // �������� �ֻ����� �����ؾ���
	}
}

public class Ingeritance_Ex3 {

	public static void main(String[] args) {
		
	}

}
