package ex1219;

/* ��¥ : 2018.12.19
 * ���� : Singleton Pattern
 * ��Ÿ : �ش� Ŭ������ �ν��Ͻ��� �ϳ��� ���������, ��𼭵��� �� �ν��ͽ��� ������ �� �ֵ��� �� ����
 *      �ڹٿ����� �����ڸ� private�� �����ϰ�, �ش� Ŭ������ �ν��Ͻ��� �����ϱ� ���� public �޼ҵ带 �����ϴ� ������� �̱��� ������ ������ �� �ִ�.
 * */

final class Ex3 {
	
}

// [������ ����] final Ŭ������ ���� Ŭ������ ���� �� ����
// ��ǥ���� final Ŭ���� : String
/*class Demo3 extends Ex3 {
	
}*/

class Demo3 {
	// final�̸鼭 static�� ������ �빮�ڷ� �Է�
	public final static double PI = 3.141592;
	public final static int A;
	
	// final static ������ static �ʱ�ȭ ������ �ʱ�ȭ ó��
	// static �ʱ�ȭ ��
	static {
		A = 10;
	}
	
	// �ݵ�� �ʱ�ȭ �ʿ� : �����ϸ鼭, �ʱ�ȭ��, �����ڿ��� ����
	// final ������ �ʱ�ȭ�� �� ���� ���� (�ѹ��� �� �ؾ��Ѵ�.)
	public final int b = 10; // �ʱ�ȭ ��� 1)
	public final int c; // �ʱ�ȭ ��� 2)
	
	// ������
	public Demo3() {
		// A = 65; // [������ ����]
		c = 10; // �ʱ�ȭ ��� 2)
	}
	
	// �ʱ�ȭ ��
	{
		//c = 20; // �ʱ�ȭ ��� 3)
	}
	
	public void print() {
		//c = 20; // ���� �Ұ�
		final int x;
		x = 10;
		//x = 20; [������ ����]
		
		System.out.println(x);
	}
	
	// final �޼ҵ�
	public final void write() { // ����Ŭ�������� ������ �Ұ�
		
	}
}

class Sample3 extends Demo3 {
	// [������ ����] final �޼ҵ�� ������ �Ұ�
	/*public void write() {
		
	}*/
}

public class Final_Ex {

	public static void main(String[] args) {
		//Demo3.PI = 1.14; // [������ ����] final ������ �� ���� �Ұ�
	}

}
