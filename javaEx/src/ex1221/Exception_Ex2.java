package ex1221;

/* ��¥ : 2018.12.21
 * ���� : ���� (Exception) ó��
 * ��Ÿ : Finally ��
 * */

public class Exception_Ex2 {

	public static void main(String[] args) {
		int a = 10, b = 0, c;
		
		try {
			// ���α׷� ���������� ���ᰡ �Ǹ� "����"�� ��µ��� �ʴ´�.
			c = a / b;
			System.out.println("��� : " + c);
		} catch (ArithmeticException e) {
			System.out.println(e.toString());
		} finally {
			System.out.println("���ܰ� �߻��ص�, ���ܰ� ��� ����");
		}
		
		System.out.println("����");
	}

}
