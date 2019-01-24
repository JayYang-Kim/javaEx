package ex1213;

/* ��¥ : 2018.12.12
 * ���� : ��� ȣ�� (Recursive call)
 * ��Ÿ : 
 * */

public class Method_Ex3 {
	// ���ȣ��� �� ���ϴ� ���
	public static int sum(int n) {
		return n > 1 ? n + sum(n - 1) : n;
	}
	
	// for �� ���ϴ� ��� (�ӵ��� for�� ����)
	/*public static int sum(int n) {
		int s = 0;
		for (int i = 1; i <= n; i++) {
			s += i;
		}
		
		return s;
	}*/
	
	// x�� y�� ��� (��, y�� 0�̻��̶�� �����Ͽ�
	public static int pow(int x, int y) {
		return y >= 1 ? x * pow(x, y - 1) : 1;
	}
	
	// �� ���� �ִ�����
	public static int gcd(int a, int b) {
		return b == 0 ? a : gcd(b, a % b);
	}
	
	public static void main(String[] args) {
		// �� ���ϴ� ���
		int s;
		s = sum(10);
		
		System.out.println("�� : " + s);
		
		// x�� y�� ���
		s = pow(2, 10);
		System.out.println("x�� y�� : " + s);
		
		// �� ���� �ִ�����
		s = gcd(12, 16);
		System.out.println("�� ���� �ִ����� : " + s);
	}

}
