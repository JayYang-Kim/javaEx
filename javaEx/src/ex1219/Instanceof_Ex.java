package ex1219;

/* ��¥ : 2018.12.19
 * ���� : instanceof ������
 * ��Ÿ : �־��� ��ü�� � Ŭ���� �Ǵ� �� Ŭ������ ����ϴ� ���� Ŭ������ �ν��Ͻ� ������ �˻�
 *      ���� ����� boolean�� �����Ѵ�.
 * */

class Ex1 {
	int a = 10;
	public void print() {
		System.out.println(a);
	}
}

class Demo1 extends Ex1 {
	int a = 0;
	int b = 20;
	int c = 30;
	
	public void print() {
		System.out.println(a + " : " + b + " : " + c + super.a);
	}
	
	public void write() {
		System.out.println(b + " : " + c);
	}
}

public class Instanceof_Ex {

	public static void main(String[] args) {
		Ex1 a1 = new Demo1(); // [��ĳ����]
		Ex1 a2 = new Ex1();
		
		a1.print(); // Demo1 �޼ҵ� ȣ��
		System.out.println(a1.a); // Ex1�� a ���
		
		//a1.write(); // [������ ����]
		Demo1 b1 = (Demo1)a1; // [�ٿ�ĳ����]
		b1.write();
		
		//Demo1 b2 = (Demo1)a2; //[��Ÿ�� ����] �ٿ�ĳ������ ��ĳ�����Ѱ͸� ���
		
		// instanceof � ��ü���� Ȯ��
		System.out.println(a1 instanceof Demo1); // [���] true
		System.out.println(a2 instanceof Demo1); // [���] false
		
		if (a1 instanceof Demo1) {
			Demo1 c1 = (Demo1)a1; // �ٿ�ĳ����
			System.out.println("�ٿ�ĳ���� 1");
			c1.write();
		}
		
		if (a2 instanceof Demo1) {
			Demo1 c1 = (Demo1)a2; // �ٿ�ĳ����
			System.out.println("�ٿ�ĳ���� 2");
			c1.write();
		}
	}

}