package ex1207;

import java.util.Scanner;

/* ��¥ : 2018.12.07
 * ���� : For�� ����
 * ��Ÿ : 
 * */
public class For_Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num, a, sum;
		sum = 0;
		
		// 1�̸��̰ų�, 10000�� �ʰ��ϴ� ���� ���Է� ó��
		do {
			System.out.println("������ �Է����ּ���.");
			num = sc.nextInt();
		} while (num < 1 || num > 1000);
		
		// 1���� �Է¹��� ������ �������� ��
		for(a = 1; a <= num; a++) {
			sum += a;
		}
		
		if(sum == 1) {
			System.out.println("1 : " + sum);
		} else {
			System.out.println("1 ~  " + num + "���� �� : " + sum);
		}
		
		sc.close();
	}

}
