package ex1204;

/* ��¥ : 2018.12.04
 * ���� : ��� ������ �׽�Ʈ (���׿�����)
 * ��Ÿ : 
 * */
public class OperatorEx1 {

	public static void main(String[] args) {
		// ��������� (���׿�����)
		byte b1 = 5, b2 = 10, b3;
		// b3 = b1 + b2; // [������ ����]
		
		b3 = (byte)(b1+b2);
		
		System.out.println(b3);
		
		int a;
		a = 'A' + 'B'; // 65 + 66
		System.out.println(a);
		
		float f;
		f = 'A' + 'B' + 10;
		System.out.println(f); // 141.0
		
		//f = 0.5 + 0.5; // [������ ����]
		
		double d;
		d = 0.5 + 0.5;
		System.out.println(d);
		
		d = 1/2 + 1/2 + 1/2; // ���� ������ ���� -> ����
		System.out.println(d); // 0.0
		
		d = 80 % 'A'; // 'A' : 65
		System.out.println(d);
		
		d = 3/2.0 + 3/2; // ���� ������ �Ǽ� -> �Ǽ�
		System.out.println(d); // �� : 2.5
		
		d= 3.7 % 1.3;
		System.out.println(d); // �� : 1.1
	}

}
