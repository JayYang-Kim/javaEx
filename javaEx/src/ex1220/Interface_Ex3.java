package ex1220;

/* ��¥ : 2018.12.20
 * ���� : Interface
 * ��Ÿ : �������̽��� ���� ����� �����ϴ�.
 * */

// �������̽� ����
interface Aex3 {
	public void print();
}

interface Bex3 {
	public void write();
}

interface Ex3 extends Aex3, Bex3 {
	public void sub();
}

// �������̽� ����
class ExImpl3 implements Ex3 {

	@Override
	public void print() {
		System.out.println("print");
	}

	@Override
	public void write() {
		System.out.println("write");
	}

	@Override
	public void sub() {
		System.out.println("sub");
	}
	
}

public class Interface_Ex3 {

	public static void main(String[] args) {
		Ex3 ob = new ExImpl3(); // [��ĳ����]
		
		ob.sub();
		ob.print();
		ob.write();
	}

}
