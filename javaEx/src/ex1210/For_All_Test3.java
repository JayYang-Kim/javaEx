package ex1210;

import java.util.Scanner;

/* ��¥ : 2018.12.10
 * ���� : For�� �׽�Ʈ
 * ��Ÿ : ���̾Ƹ�� ��� ���
 * */
public class For_All_Test3 {

	public static void main(String[] args) {
		// 1)
		/*for (int i = 1; i <= 5; i++) {
			// �����߰�
			for (int j = 1; j <= 5 - i; j++) {
				System.out.print(" ");
			}
			
			for (int j = 1; j <= i * 2 - 1; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		for (int i = 4; i >= 1; i--) {
			// �����߰�
			for (int j = 1; j <= 5 - i; j++) {
				System.out.print(" ");
			}
			
			for (int j = 1; j <= i * 2 - 1; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}*/
		
		// 2)
		Scanner sc = new Scanner(System.in);
		
		int size;
		int m;
		
		do {
			System.out.println("ũ�⸦ �Է����ּ���");
			size = sc.nextInt();
		} while(size < 1 || size > 10 || size % 2 == 0); // 1���� ���ų�, 10���� ũ�ų�, ¦���� ��� ���Է�
		
		m = size / 2;
		
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size-m; j++) {
				System.out.print(j >= m ? "*" : " ");
			}
			
			m = i < (size / 2) ? m - 1 : m + 1;
			
			System.out.println();
		}
		
		sc.close();
	}

}
