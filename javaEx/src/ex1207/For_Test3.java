package ex1207;

import java.util.Scanner;

/* ��¥ : 2018.12.07
 * ���� : For�� ����
 * ��Ÿ : 10���� ������ �Է� �޾� �Է¹��� ���� �� ¦�� ������ Ȧ�� ������ ����ϴ� ���α׷�
 * */
public class For_Test3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.println("10���� ������ �Է����ּ���.");
		
		int c1, c2;
		c1 = c2 = 0;
		for(int a = 1; a <= 10; a++) {
			num = sc.nextInt();
			
			if(num % 2 == 0) {
				c1++;
			} else {
				c2++;
			}
		}
		
		System.out.println("Ȧ���� ���� : " + c2);
		System.out.println("¦���� ���� : " + c1);
		
		sc.close();
	}

}
