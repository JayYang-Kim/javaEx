package ex1220;

/* ��¥ : 2018.12.20
 * ���� : ����(Exception) ó��
 * ��Ÿ :  
 * */

public class Exception_Ex2 {

	public static void main(String[] args) {
		int a = 10, b = 0;
		int c;
		
		try {
			c = a / b;
			System.out.println("��� : " + c);
		} catch (ArithmeticException e) { // exception : �ֻ��� ���� Ŭ����
			//System.out.println("0���� ������ �߻��� �����Դϴ�.");
			//System.out.println(e.toString()); // Ŭ���̾�Ʈ ���� Ȯ�ο�
			//System.out.println(e);
			e.printStackTrace(); // ������ ���� Ȯ�ο�
		} finally {
			
		}
		
		System.out.println("����");
	}

}
