package ex1204;

import java.util.Scanner;

/* ��¥ : 2018.12.04
 * ���� : �� ������ �Է¹޾� ���������� ����ϴ� ���α׷�
 * ��Ÿ : 
 * */
public class OperatorEx2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		
		System.out.println("�� ������ ?");
		a = sc.nextInt();
		b = sc.nextInt();
		
		/*c = a + b;
		d = a - b;
		e = a * b;
		f = a / b;*/
		
		System.out.printf("%d + %d : %d\n", a, b, a+b);
		System.out.printf("%d - %d : %d\n", a, b, a-b);
		System.out.printf("%d * %d : %d\n", a, b, a*b);
		System.out.printf("%d / %d : %d", a, b, a/b);
		System.out.printf("%d %% %d : %d", a, b, a%b);
		
		/*System.out.printf("%d + %d : %d\n", a, b, c);
		System.out.printf("%d - %d : %d\n", a, b, d);
		System.out.printf("%d * %d : %d\n", a, b, e);
		System.out.printf("%d / %d : %d", a, b, f);*/

		sc.close();
	}

}
