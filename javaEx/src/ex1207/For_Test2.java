package ex1207;

import java.util.Scanner;

/* ��¥ : 2018.12.07
 * ���� : For�� ����
 * ��Ÿ : 1 ~ 9 ������ ������ �Է� �޾� �Է� ���� ���� �������� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * */
public class For_Test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num, a;
		
		// 1�̸��̰ų� 9�� �ʰ��ϸ� ���Է� �ޱ�
		do {
			System.out.println("1 ~ 9�� ������ �Է����ּ���.");
			num = sc.nextInt();
		} while (num < 1 || num > 9);
		
		for(a = 1; a <= 9; a++) {
			System.out.println(num + " * " + a + " : " + (num * a));
		}
		
		sc.close();
	}

}
