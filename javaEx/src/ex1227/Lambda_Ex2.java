package ex1227;

/* ��¥ : 2018.12.27
 * ���� : Lambda
 * ��Ÿ : �͸� Ŭ����
 * 		�Ű������� ����, ����Ÿ���� void�� ���
 * */

// ���ٽ��� ���ؼ��� �������̽��� �޼ҵ尡 �ϳ��� �����ؾ� �Ѵ�.
interface Demo10 {
	public void print();
}

public class Lambda_Ex2 { // Lambda_Ex$
	public static void main(String[] args) {
		//Demo10 u = () -> {System.out.println("���ٽ�");};
		Demo10 u = () -> System.out.println("���ٽ�"); // ������ ��� {} ���� ����
		u.print();
	}
}
