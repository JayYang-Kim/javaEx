package ex1204;

import java.util.Scanner;

/* ��¥ : 2018.12.04
 * ���� : ���� 2) �ݾ��� �Է� �޾�, �Է� ���� �ݾ��� 50,000���ǿ��� 1���Ǳ����� ȭ��ż��� ����ϴ� ���α׷��� �����ڸ� �̿��Ͽ� �ۼ��Ͻÿ�.
 * 		   
 * ��Ÿ : 
 * */
public class OperatorTest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a;

		System.out.println("�ݾ��� �Է����ּ���.");
		a = sc.nextInt(); // �ݾ� �Է�

		/*System.out.printf("�������� : %d\n", a / 50000);
		System.out.printf("������ : %d\n", (a % 50000) / 10000);
		System.out.printf("��õ���� : %d\n", (a % 50000) % 10000 / 5000);
		System.out.printf("õ���� : %d\n", (a % 50000) % 10000 % 5000 / 1000);
		System.out.printf("������� : %d\n", (a % 50000) % 10000 % 5000 % 1000 / 500);
		System.out.printf("����� : %d\n", (a % 50000) % 10000 % 5000 % 1000 % 500 / 100);
		System.out.printf("���ʿ��� : %d\n", (a % 50000) % 10000 % 5000 % 1000 % 500 % 100 / 50);
		System.out.printf("�ʿ��� : %d\n", (a % 50000) % 10000 % 5000 % 1000 % 500 % 100 % 50 / 10);
		System.out.printf("������ : %d\n", (a % 50000) % 10000 % 5000 % 1000 % 500 % 100 % 50 % 10 / 5);
		System.out.printf("�Ͽ��� : %d", (a % 50000) % 10000 % 5000 % 1000 % 500 % 100 % 50 % 10 % 5 / 1);*/
		
		System.out.printf("�������� : %d\n", a / 50000);
		System.out.printf("������ : %d\n", (a % 50000) / 10000);
		System.out.printf("��õ���� : %d\n", (a % 10000) / 5000);
		System.out.printf("õ���� : %d\n", (a % 5000) / 1000);
		System.out.printf("������� : %d\n", (a % 1000) / 500);
		System.out.printf("����� : %d\n", (a % 500) / 100);
		System.out.printf("���ʿ��� : %d\n", (a % 100) / 50);
		System.out.printf("�ʿ��� : %d\n", (a % 50) / 10);
		System.out.printf("������ : %d\n", (a % 10) / 5);
		System.out.printf("�Ͽ��� : %d\n", (a % 5));
		
		sc.close();
	}

}
