package ex1203;

/* ��¥ : 2018.12.03
 * ���� : ���� �׽�Ʈ
 * ��Ÿ : 2200000000�� int ����̸� int ǥ�������� �Ѿ ������ ������ �߻�
 * */
public class VarEx {

	public static void main(String[] args) {
		/* byte */
		byte a; // a�� �ʱ�ȭ ���� ���� ����
		//System.out.println(a); // [������ ����] a�� �ʱ�ȭ�� ���� �ʾ� ���๮���� ���Ұ�
		a = 10;
		System.out.println("a : " + a); // ���ڿ� + �ٸ� �ڷ��� -> ���ڿ� (����)
		
		byte b = 20, c = 30; // ����� ���ÿ� �ʱ�ȭ
		System.out.println("b : " + b + " c : " + c);
		
		//byte d = 200; // [������ ����] byte ǥ������ : -128 ~ 127
		
		/* int */
		//int a; // [������ ����] ������ �������� ������ �ߺ��� �Ұ��� 
		int x = 10;
		//int y = 2200000000; // [������ ����] ǥ�������� �Ѿ
		System.out.println("x : " + x);
		
		/* long */
		//long y = 2200000000; // [������ ����] 2200000000�� int ����̸� int ǥ������ �ѱ� (overflow�߻�)
		long y = 2200000000L;
		long z = 1000000000;
		
		System.out.println("y : " + y + " z : " + z);
	}

}
