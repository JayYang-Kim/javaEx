package ex1205;

/* ��¥ : 2018.12.05
 * ���� : ��������
 * ��Ÿ : and�� ù��° ����� false�� ��� �ڿ��ִ� ������ ���� �ʴ´�.
 *         or�� ù��° ����� true�� ��� �ڿ��ִ� ������ ���� �ʴ´�.
 * */
public class Test {

	public static void main(String[] args) {
		// and
		int a;
		boolean b1, b2;
		a = 10;
		b1 = false;
		b2 = a > 20 && (b1=true); // and������ ù��° ����� false�� ��� �ڿ��ִ� ������ ���� �ʴ´�.
		System.out.println(b1 + " , " + b2);
		
		// or
		a = 10;
		b1 = false;
		b2 = a < 20 || (b1=true); // or������ ù��° ����� ture�� ��� �ڿ��ִ� ������ �����ʴ´�.
		System.out.println(b1 + " , " + b2);
	}

}
