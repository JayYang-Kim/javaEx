package ex1227;

/* ��¥ : 2018.12.27
 * ���� : Lambda
 * ��Ÿ : �͸� Ŭ����
 * 		�Ű������� �ְ�, ���� Ÿ���� void�� ���
 * */

@FunctionalInterface // Lambda�� ����ϱ� ���� �������̽����� ����
interface Demo12 {
	public void print(int n);
}

public class Lambda_Ex3 { // Lambda_Ex$1.class
	public static void main(String[] args) {	
		//Demo12 d = (int a) -> {int n = a + 10; System.out.println(n);};
		//Demo12 d = (a) -> {int n = a + 10; System.out.println(n);};
		//Demo12 d = a -> {int n = a + 10; System.out.println(n);};
		Demo12 d = a -> System.out.println(a + 10);
		
		d.print(10);
	}
}
