package ex1221;

/* ��¥ : 2018.12.21
 * ���� : ���� (Exception) ó��
 * ��Ÿ : catch�� ���� ���� ó�� (jdk7.0���� ����)
 * */

public class Exception_Ex3 {

	public static void main(String[] args) {
		int a, b , c;
		String s1 = "100";
		String s2 = "0";
		
		try {
			a = Integer.parseInt(s1);
			b = Integer.parseInt(s2);
			c = a + b;
			
			System.out.println("��� : " + c);
		} catch (NumberFormatException | ArithmeticException e) {
			System.out.println("���� ������ �ƴϰų�, 0���� ���������ϴ�.");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		System.out.println("����");
	}

}
