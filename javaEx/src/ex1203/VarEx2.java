package ex1203;

/* ��¥ : 2018.12.03
 * ���� : ���� �׽�Ʈ2
 * ��Ÿ : 
 * */
public class VarEx2 {

	public static void main(String[] args) {
		int a, b, c, d, e;
		a = 0b101;	// 2���� = 5
		b = 0101;	// 8���� = 65
		//b = 019;	// [������ ����] 8������ 9�� ����.
		c = 101;		// 10����
		d = 0x101;	// 16����
		e = 1_0_1;	// 101
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		
		int x = 20;		// 4byte
		short y = 20, z;	// 2byte
		//z = x;	// [������ ����] ū�ڷ����� ���� �ڷ����� ������ �� ����.
		z = (short)x;	// ������ ��ȯ int -> short (ū�ڷ����� ���� �ڷ������� ���� ��ȯ)
		
		System.out.println("x : " + x + " y : " + y + " z : " + z);
	}

}
