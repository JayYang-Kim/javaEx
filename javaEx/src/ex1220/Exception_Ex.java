package ex1220;

/* ��¥ : 2018.12.20
 * ���� : ����(Exception) ó��
 * ��Ÿ :  
 * */

public class Exception_Ex {

	public static void main(String[] args) {
		int a = 10, b = 0;
		int c;
		
		c = a / b; // java.lang.ArithmeticException ���� �߻� : unchecked ����
		           // ����ó���� ���� �ʾƼ� ���⼭ ���α׷��� ����
		System.out.println("��� : " + c);
		
		System.out.println("����");
	}

}
