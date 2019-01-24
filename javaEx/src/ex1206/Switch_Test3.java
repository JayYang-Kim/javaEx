package ex1206;

import java.util.Scanner;

/* ��¥ : 2018.12.06
 * ���� : switch ~ case�� ����
 * ��Ÿ : �⵵�� ���� �Է� �޾� �Է� ���� ���� ������ ��¥�� ���ϴ� ���α׷��� �ۼ� �Ͻÿ�.
 * */
public class Switch_Test3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int y, m, d = 1;
		
		System.out.println("�⵵�� �Է����ּ���.");
		y = sc.nextInt();
		System.out.println("���� �Է����ּ���.");
		m = sc.nextInt();
		
		switch (m) {
		case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 12 : d = 31; break;
		case 2 : 
			if(y % 4 == 0 && y % 100 != 0 || y % 400 == 0) {
				d = 29;
			} else {
				d = 28;
			}
			break;
		case 4 : case 6 : case 9 : case 11 : d = 30; break;
		}
		
		if (d == 1) {
			System.out.println("�Է¿���");
		} else {
			System.out.printf("%d�� %d���� %d�ϱ��� �ֽ��ϴ�.", y, m, d);
		}
		
		sc.close();
	}

}
