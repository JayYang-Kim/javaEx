package ex1212;

/* ��¥ : 2018.12.12
 * ���� : �޼ҵ� (Method)
 * ��Ÿ : 
 * */

class Ex2 {
	// ����1) �� ���ڸ� �μ��� �Ѱ� �޾� ascii �ڵ带 �����ϴ� �޼ҵ�
	public int ascii(char a) {
		return a;
	}
	
	// ����2) ������ ascii �ڵ带 �μ��� �Ѱ� �޾� ascii �ڵ忡 ���� ���ڸ� �����ϴ� �޼ҵ�
	public char ascii2(int a) {
		return (char)a;
	}
	
	// ����3) �ѹ��ڸ� �Ѱ� �޾� �ҹ��������� �Ǻ��ϴ� �޼ҵ�
	public boolean isLower(char a) {
		return a >= 'a' && a <= 'z';
	}
	
	// ����4) x, y�� �ּҰ� ���ϱ�
	public int min(int x, int y) {
		return x < y ? x : y;
	}
}

public class Method_Ex2 {

	public static void main(String[] args) {
		Ex2 as = new Ex2();
		// ����1 - ���)
		
		int a;
		
		a = as.ascii('A');
		System.out.println(a);
		
		// ����2 - ���)
		char b;
		
		b = as.ascii2(65);
		System.out.println(b);
		
		// ����3 - ���)
		boolean c;

		c = as.isLower('a');
		System.out.println(c);
		
		// ����4 - ���)
		int min = 0, max = 1;
		int d;
		
		d = as.min(min, max);
		System.out.println(d);
	}

}
