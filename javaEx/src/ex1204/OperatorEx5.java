package ex1204;

import java.util.Scanner;

/* ��¥ : 2018.12.04
 * ���� : ���� 3) �ѹ��ڸ� �Է� �޾� �Է¹��� ������ ASCII �ڵ� ���
 *         ���� ? c 
 *         c : 67
 * ��Ÿ : 
 * */
public class OperatorEx5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char a;
		int b;
		
		System.out.println("�ѹ��ڸ� �Է����ּ���.");
		a = sc.next().charAt(0);
		
		b = a;
		
		System.out.printf("%c : - > %d\n", a, b);
		
		sc.close();
	}

}
