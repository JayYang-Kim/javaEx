package ex1205;

import java.util.Scanner;

/* ��¥ : 2018.12.05
 * ���� : ���ǹ� ���� (if)
 * ��Ÿ : �μ� �� �����ڸ� �Է� �޾� �Է� ���� �����ڿ� ���� ������ �����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * */
public class If_Test5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		char c;
		
		System.out.println("ù��° ������ �Է����ּ���.");
		a = sc.nextInt();
		System.out.println("�ι�° ������ �Է����ּ���.");
		b = sc.nextInt();
		System.out.println("+, -, *, /�� �ϳ��� �Է����ּ���.");
		c = sc.next().charAt(0);
		
		if (c == '+' ) {
			System.out.printf("%d + %d = %d", a, b, a+b);
		} else if (c == '-') {
			System.out.printf("%d - %d = %d", a, b, a-b);
		} else if (c == '*') {
			System.out.printf("%d * %d = %d", a, b, a*b);
		} else if (c == '/') {
			System.out.printf("%d / %d = %d", a, b, a/b);
		} else {
			System.out.println("�Է� ����");
		}
		
		sc.close();
	}

}
