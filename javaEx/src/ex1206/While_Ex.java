package ex1206;

/* ��¥ : 2018.12.06
 * ���� : while �׽�Ʈ
 * ��Ÿ : 
 * */
public class While_Ex {

	public static void main(String[] args) {
		int a, b;
		int c = 0;
		a = b = 0;

		// 1 ~ 10������ ��
		/*
		 * while (a < 10) { a++; b += a; System.out.println(a + " , " + b); }
		 * 
		 * System.out.println(a + " , " + b);
		 */

		/*
		 * while (c < 3) { c++; System.out.println(c); }
		 * 
		 * System.out.println("�� : " + c);
		 */

		// 1 ~ 10���� ¦����
		/*
		 * while (a < 10) { a += 2; b += a; } System.out.println(a + " : " + b);
		 */

		// 1 ~ 100���� Ȧ����
		/*a = 1; b = 0;
		while (a < 100) {
			b += a;
			a += 2;
		}
		System.out.println(a + " : " + b);*/

		// 1 ~ 10���� Ȧ���� (Debug Test)
		a = 1; b = 0;
		while (a < 10) {
			b += a;
			a += 2;
		}
		System.out.println(a + " : " + b);
	}

}
