package ex1207;

/* ��¥ : 2018.12.07
 * ���� : For�� �׽�Ʈ
 * ��Ÿ : 
 * */
public class For_Ex {

	public static void main(String[] args) {
		// 1) 1 ~ 10���� ������ ����ϴ� ���α׷�
		/*
		 * int a;
		 * 
		 * for (a=1;a <= 10;a++) { System.out.println(a + " "); }
		 */

		/*
		 * for (int a=1; a <= 10; a++) { System.out.println(a + " "); }
		 */

		// System.out.println(a + " "); // for�� ������ ������ �ۿ��� ��� �Ұ���

		// 2) F ~ A���� ���ڸ� ����ϴ� ���α׷�
		/*
		 * for (char a = 'F'; a >= 'A'; a--) { System.out.println(a); }
		 */

		// 3) 1 ~ 10���� ���� Ȧ���� ����ϴ� ���α׷�
		/*
		 * for (int a = 1; a <= 10; a += 2) { System.out.println(a + " "); }
		 */

		// 4) 1 ~ 10���� ���� Ȧ���� ����ϴ� ���α׷�
		/*
		 * for (int a = 2; a <= 10; a += 2) { System.out.println(a + " "); }
		 */

		// 5) 1 ~ 10������ ��
		/*
		 * int s = 0; for (int a = 1; a <= 10; a++) { s += a; }
		 * 
		 * System.out.println(s + " ");
		 */

		// 5) 1 ~ 10������ �� Ȧ���� ��
		/*int s = 0;
		for (int a = 1; a <= 10; a += 2) {
			s += a;
		}

		System.out.println(s + " ");*/

		// 5) 1 ~ 10������ �� ¦���� ��
		/*int s = 0;
		for (int a = 2; a <= 10; a += 2) {
			s += a;
		}

		System.out.println(s + " ");*/
		
		// 6) 1 ~ 100���� ���� 3�� ����� �� �ٿ� 10���� ����ϰ� �������� 3�� ��� �� �� ��� ���
		/*int s = 0;
		int c = 0;
		for(int n = 3; n <= 100; n+=3) {
			s += n;
			c++;
			System.out.printf("%5d", n);
			
			if(c % 10 == 0) {
				System.out.println();
			}
		}
		
		System.out.println("\n�� : " + s);
		System.out.println("��� : " + s / c);*/
		
		// 7) 1 ~ 10������ ������ ���� ���
		/*int s = 0;
		int n = 0;
		for(;;) {
			n++;
			s+=n;
			if(n >= 10) {
				break;
			}
		}
		
		System.out.println("�� : " + s);*/
		
		// 8) 
		/*int s = 2000000000;
		int c= 0;
		
		// float�� �����ϴ°� �ƴ����� ������ �Ҽ��� ��ȯ�ϸ鼭 �߸��� ������ �߻��ϱ� ������ ���� Ʋ���� �� �ִ�.
		for (float a = s; a < s + 50; a++) {
			c++;
		}
		
		System.out.println(c);*/
	}

}
