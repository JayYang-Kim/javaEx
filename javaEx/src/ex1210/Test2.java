package ex1210;

import java.util.Scanner;

/* ��¥ : 2018.12.10
 * ���� : Test
 * ��Ÿ : �����ο��� ���� ����
 * */
public class Test2 {

	public static void main(String[] args) {
		// �Է��� ���� ��ŭ ���ϱ�� ���α׷� (����)
		/*
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * int a, sum;
		 * 
		 * System.out.println("������ �Է����ּ���."); a = sc.nextInt();
		 * 
		 * sum = 1; for(int i = 1; i <= a; i++) { sum *= a; }
		 * 
		 * System.out.println("��� : " + sum);
		 */

		// [¦�� ������] 2 ~ 9�ܱ��� ����ϴµ� ¦�� x ¦���� ��� (�̹���)
		/*for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if (i % 2 == 0 && j % 2 == 0) {
					System.out.print(i + " * " + j + " = " + i * j + ", ");
				}
			}
		}*/
		
		// 10�� ���ڸ� �Է¹޾Ƽ� �ִ밪�� �ּҰ��� ���ϼ���. (�̹ο�)
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int min = 0, max = 0;

		System.out.println("10���� ������ �Է����ּ���.");
		for (int i = 1; i <= 10; i++) {
			a = sc.nextInt(); // 
			
			// �ִ밪
			if(i == 1) {
				max = a;
			} else if (max < a) {
				max = a;
			}
			
			// �ּҰ�
			if(i == 1) {
				min = a;
			} else if (min > a) {
				min = a;
			}
			
		}
		
		System.out.println("�ִ밪 : " + max);
		System.out.println("�ּҰ� : " + min);
		
		sc.close();

		// �ֻ��� 100ȸ ������ ��� (�̵���)
		// �ֻ����� 2���� ������ ���� 3���� ������ �� ��� 6�� ���� Ȯ���� ��� ��찡 �� ������? ���̸� ���Ͽ���
		/*int a, b, c; // �ֻ��� 
		int count2, count3; // �ֻ��� ���� ��ġ�ϴ� ��� üũ
		count2 = count3 = 0;
		double result2, result3; // ��

		for (int i = 0; i <= 100; i++) {
			a = (int)(Math.random() * 6) + 1;
			b = (int)(Math.random() * 6) + 1;

			if (a == 6 && b == 6) {
				count2++; // �ֻ��� 2���� �������� ��ġ�ϴ� ��� üũ
			}
		}

		for (int i = 0; i <= 100; i++) {
			a = (int)(Math.random() * 6) + 1;
			b = (int)(Math.random() * 6) + 1;
			c = (int)(Math.random() * 6) + 1;

			if (a == 6 && b == 6 && c == 6) {
				count3++; // �ֻ��� 2���� �������� ��ġ�ϴ� ��� üũ
			}
		}
		
		result2 = (double)count2 / 100 * 100;
		result3 = (double)count3 / 100 * 100;
		
		System.out.printf("2�� �������� Ȯ�� : %f\n", result2);
		System.out.printf("3�� �������� Ȯ�� : %f", result3);*/
	}

}
