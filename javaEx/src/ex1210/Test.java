package ex1210;

import java.util.Scanner;

/* ��¥ : 2018.12.10
 * ���� : Test
 * ��Ÿ : 1 ~ 100���� ������ 3, 5�� ����� �Ǵ� ���� �հ� ����� ���ϴ� ���α׷�
 *      [���]
 *      �� : 2418
 *      ��� : 51
 * */
public class Test {

	public static void main(String[] args) {
		/*int sum, c;
		sum = 0;
		c = 0; // 3, 5�� ��� ī��Ʈ
		
		for(int i = 1; i <= 100; i++) {
			// 3, 5�� ��� üũ�Ͽ� ���ϱ�
			if(i % 3 == 0 || i % 5 == 0) {
				sum += i;
				c++;
			} else {
				
			}
		}
		
		System.out.println("�� : " + sum);
		System.out.println("��� : " + sum / c);*/
		
		// �� �ֻ����� ����� �Է��� ���Ǹ�ŭ ������ ������ ����� ���� Ȯ�� ���ϴ� ���α׷� 
		// ��, �Է��� ���ڰ� 0�̰ų� ������ ��� ���Է�
		// ����� double������ ������ּ���.
		// [���] #������ �� �ֻ����� ������ Ȯ�� : x.xxxxxx
		Scanner sc = new Scanner(System.in);
		
		int a, b, cnt;
		int c;
		cnt = 0;
		
		double result;
		
		do {
			System.out.println("���ڸ� �Է����ּ���.");
			c = sc.nextInt();
		} while (c <= 0);
		
		for(int i = 0; i <= c; i++) {
			a = (int)(Math.random() * 6) + 1;
			b = (int)(Math.random() * 6) + 1;
			
			if(a == b) {
				cnt++;
			}
		}
		
		System.out.println("cnt : " + cnt);
		System.out.println("c : " + c);
		
		result = (double)cnt / c * 100; 
		
		System.out.println("result : " + result);
		
		System.out.printf("%d������ �� �ֻ����� ������ Ȯ�� : %f", c, result);
		
		sc.close();
	}

}