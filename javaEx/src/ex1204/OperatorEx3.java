package ex1204;

import java.util.Scanner;

/* ��¥ : 2018.12.04
 * ���� : ���� 1) ���ο� ���� ���̸� �Է� �޾� ���簢���� ���̿� �ѷ����
 * 		   ���� ?
 *         ���� ?
 *         ���� : �� * ��
 *         �ѷ� : (��+��) * 2
 * ��Ÿ : 
 * */
public class OperatorEx3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		
		System.out.println("���ο� ���� ���̸� �Է����ּ���.");
		a = sc.nextInt();
		b = sc.nextInt();
		
		System.out.printf("���� : %d\n", a * b);
		System.out.printf("�ѷ� : %d", (a + b) * 2);
		
		sc.close();
	}

}
