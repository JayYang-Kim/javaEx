package ex1210;

import java.util.Scanner;

/* ��¥ : 2018.12.10
 * ���� : For�� �׽�Ʈ
 * ��Ÿ : 10���� ������ �Է� �޾� �Է� ���� ���� �� ���� ū ��, ���� ���� ����ϴ� ���α׷�
 * */
public class For_Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int a, max;
		max = 0;
		//max = Integer.MIN_VALUE; // 
		
		System.out.println("10���� ������ �Է����ּ���.");
		
		// �ִ밪
		/*for (int i = 1; i <= 10; i++) {
			a = sc.nextInt();
			
			if(i == 1) {
				max = a;
			} else if (max < a) {
				max = a;
			}
		}
		
		System.out.println("�ִ밪 : " + max);*/
		
		int min;
		min = 0;
		
		// �ּҰ�
		for (int i = 1; i <= 10; i++) {
			a = sc.nextInt();
			
			if(i == 1) {
				min = a;
			} else if (min > a) {
				min = a;
			}
		}
		
		System.out.println("�ּҰ� : " + min);
		
		sc.close();
	}

}
