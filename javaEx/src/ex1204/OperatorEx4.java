package ex1204;

import java.util.Scanner;

/* ��¥ : 2018.12.04
 * ���� : ���� 2) �������� �Է� �޾� ���� ���̿� �ѷ� ���
 *         ������ ?
 *         ���� : �� * �� * 3.14
 *         �ѷ� : �� * 2 * 3.14
 *         c : 67
 * ��Ÿ : 
 * */
public class OperatorEx4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int r;
		double a, b;
		
		System.out.println("�������� �Է����ּ���.");
		r = sc.nextInt();
		
		a = r*r*3.14;
		b = r*2*3.14;
		System.out.printf("���� : %.2f\n", a);
		System.out.printf("�ѷ� : %.2f\n", b);
		/*System.out.printf("���� : %f\n", c * c * 3.14);
		System.out.printf("�ѷ� : %f", c * 2 * 3.14);*/
		
		sc.close();
	}

}
