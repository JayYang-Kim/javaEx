package ex1206;

import java.util.Scanner;

/* ��¥ : 2018.12.06
 * ���� : while �׽�Ʈ
 * ��Ÿ : 
 * */
public class While_Ex3 {

	public static void main(String[] args) {
		// 10! (���丮��)�� ���� ����� ���
		/*int a, b;
		a = 0;
		b = 1;
		while (a < 10) {
			a++;
			b *= a;
			// ������ * ����
			if (a == 10) {
				System.out.print(a + " = ");
			} else {
				System.out.print(a + " * ");
			}
		}
		
		System.out.print(b);*/
		
		// ������ �Է� �޾� 1���� �Է� ���� �������� ���� ���ϴ� ���α׷�
		Scanner sc = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.println("���� �Է����ּ���.");
		c = sc.nextInt();
		
		// �Է� ���� �� ���� ��
		/*a = 0;
		b = 0;
		while (a < c) {
			a++;
			b+=a;
		}
		System.out.println(b);*/
		
		// �Է� ���� �� ���� Ȧ����
		a = 1;
		b = 0;
		
		while (a <= c) {
			b += a;
			System.out.println(a);
			a += 2;
		}
		
		System.out.println(b);
		
		// ������ �Է¹޾� �Է� ���� �ܿ� ���� ������ ���
		/*a = 0;
		while(a < 9) {
			a++;
			b = c * a;
			System.out.printf("%d * %d = %d\n", c, a, b);
		}*/
		
		sc.close();
	}

}
