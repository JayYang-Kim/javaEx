package ex1205;

/* ��¥ : 2018.12.05
 * ���� : ��Ʈ ���� �̵�(shift) ������ / ĳ���ÿ� ���� �� ��ȯ
 * ��Ÿ : 
 * */
public class Oper_Ex4 {

	public static void main(String[] args) {
		// ����� ���� shift ������
		int a = 32, b;
		b = a >> 3; // (32/2^3)

		System.out.println(b);

		// ����� ���� shift ������
		int c = 32, d;
		d = a << 3; // (32*2^3)

		System.out.println(d);
		
		// ���� ���� shift ������
		int e = 32, f;
		f = a >>> 3; // ������ ����� ��ȯ

		System.out.println(d);
		
		// ĳ���ÿ� ���� �� ��ȯ
		// ��� �ڷ����� boolean �ڷ���, ������ ���� �� ��ȯ �Ұ�
		int g = 1, h = 2;
		double i;
		i = (double)(g / h); // 0.5
		
		System.out.println(i);
	}

}
