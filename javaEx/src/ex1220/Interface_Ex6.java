package ex1220;

/* ��¥ : 2018.12.20
 * ���� : Interface
 * ��Ÿ : default, static
 * */

// �������̽� ����
interface Ex6 {
	public void print();
	public default void write() { // default �޼ҵ� (jdk8.0)
		System.out.println("write");
	}
	public static void method() { // static �޼ҵ� (jdk8.0)
		System.out.println("static");
	}
}

//�������̽� ����
class ExImpl6 implements Ex6 {
	// default �޼ҵ��� write()�� ������ �����ϴ�.
	
	@Override
	public void print() {
		System.out.println("print");
	}
	
}

public class Interface_Ex6 {
	
	public static void main(String[] args) {
		Ex6.method(); // static �޼ҵ�� Ŭ������.�޼ҵ�()�� �Է��Ͽ� ��ü���� ���� ȣ�Ⱑ��
		//Ex6.write(); // [������ ����] default�޼ҵ�� ��ü ������ �ʿ���
		
		ExImpl6 oo = new ExImpl6();
		oo.write();
		oo.print();
	}

}
