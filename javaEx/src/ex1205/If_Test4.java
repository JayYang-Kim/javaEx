package ex1205;

import java.util.Scanner;

/* ��¥ : 2018.12.05
 * ���� : ���ǹ� ���� (if)
 * ��Ÿ : �Ϸ� ���� �ð��� �Է� �޾� �޿��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * */
public class If_Test4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b;
	
		System.out.println("�ٹ��ð��� �Է����ּ���.");
		a = sc.nextInt();
		
		if (a > 8) {
			b = 8 * 10000 + (int)((a-8) * 10000 * 1.5);
			System.out.printf("�޿� : %,d��", b);
		} else {
			b = a * 10000;
			System.out.printf("�޿� : %,d��", b);
		}
		
		sc.close();
	}

}
