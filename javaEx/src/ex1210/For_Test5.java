package ex1210;

import java.util.Scanner;

/* ��¥ : 2018.12.10
 * ���� : For�� �׽�Ʈ
 * ��Ÿ : 5���� ������ �Է� �޾� �Է� ���� ���� �� 7�� ���� ����� ���� ����ϴ� ���α׷� (7�Է� �� ���Է�)
 * */
public class For_Test5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n, diff, min = 999, result = 0;
		
		System.out.println("5���� ������ �Է����ּ���. (��, 7�� ���Է�)");
		
		for (int i = 1; i <= 5; i++) {
			n = sc.nextInt();
			
			// �Է��� ������ 7�� ���, ���Է� �ޱ�
			if(n == 7) {
				i--;
				continue;
			}
			
			// �Է¹��� ���� 7���̰� ���ϱ� (���)
			if(n > 7) {
				diff = n - 7;
			} else {
				diff = 7 - n;
			}
			
			if(i == 1) {
				min = diff;
				result = n;
			} else if (min > diff) {
				min = diff;
				result = n;
			}
		}
		
		System.out.println("7�� ���� ����� �� : " + result);
		
		sc.close();
	}

}
