package ex1218;

/* ��¥ : 2018.12.18
 * ���� : ��� (Inheritance)
 * ��Ÿ : Ŭ���� ��Ӱ� ������
 * 	    super Ŭ������ ��ü ���� �� �޸� �Ҵ� �� sub Ŭ������ ��ü ���� �� �޸𸮸� �Ҵ�
 * */

class Test5 {
	int x;
	
	// �ʱ�ȭ �� : ������ ���� ���� ����ȴ�.
	{
		System.out.println("super �ʱ�ȭ ��");
		x = 10;
	}
	
	// ������ : �ʱ�ȭ �۾�
	public Test5() {
		System.out.println("super ������");
	}
	
	public void print() {
		System.out.println(x);
		//System.out.println(y); // [������ ����]
	}
}

class Sample5 extends Test5 {
	int y;
	
	// �ʱ�ȭ �� : ������ ���� ���� ����ȴ�.
	{
		System.out.println("sub �ʱ�ȭ ��");
		y = 100;
	}
	
	// ������ : �ʱ�ȭ �۾�
	public Sample5() {
		System.out.println("sub Ŭ���� ������");
	}
	
	public void write() {
		System.out.println(x + " : " + y);
	}
}

public class Ingeritance_Ex4 {

	public static void main(String[] args) {
		Sample5 ob = new Sample5();
		ob.write();
	}

}
