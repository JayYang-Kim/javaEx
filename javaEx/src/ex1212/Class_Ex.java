package ex1212;

/* ��¥ : 2018.12.12
 * ���� : Class �׽�Ʈ
 * ��Ÿ : �߻�ȭ) ������ :����, ����
 *            ��� : ����, �ѷ�
 * */

public class Class_Ex {

	public static void main(String[] args) {
		// ��ü ����
		//Rect a; // a�� ������ ����
		Rect a = new Rect(); // ��ü ����
		
		a.width = 10;
		a.height = 10;
		
		System.out.println(a.area());
		
		a.width = 20;
		a.height = 20;
		
		System.out.println(a.area());
	}

}
