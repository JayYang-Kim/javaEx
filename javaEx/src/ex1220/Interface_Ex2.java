package ex1220;

/* ��¥ : 2018.12.20
 * ���� : Interface
 * ��Ÿ : �������̽��� ���� ����� �����ϴ�.
 * */

// �������̽� ����
interface Ex2 {
	public void print();
}

interface Test2 {
	public void write();
}

// �������̽� ����
// �������̽��� ���� ����� �����ϴ�.
class ExImpl2 implements Ex2, Test2 {

	@Override
	public void write() {
		System.out.println("write");	
	}

	@Override
	public void print() {
		System.out.println("print");
	}
	
}

public class Interface_Ex2 {

	public static void main(String[] args) {
		ExImpl2 ob = new ExImpl2();
		
		Ex2 ee = ob; // [��ĳ����]
		
		ee.print(); // Ex2�� �޼ҵ常 ȣ�� ����
		
		((ExImpl2)ee).write(); // [�ٿ�ĳ����]

	}

}
