package ex1204;

import java.util.Scanner;

/* ��¥ : 2018.12.04
 * ���� : ���� 4) ����Ÿ��� �ü��� �Է� �޾� ����ð��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * 		   
 * ��Ÿ : �ð������� ����ߴµ� �а� �ʴ� ��� ����ؾ����� �� �𸣰ڽ��ϴ�.
 * */
public class OperatorTest4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a, b, c, d;
		double e;

		System.out.println("����Ÿ��� �Է����ּ���.");
		a = sc.nextInt();
		System.out.println("�ü��� �Է����ּ���.");
		b = sc.nextInt();
		
		//����Ÿ� : 467km / �ü� : 110km/h /
		// ����Ÿ� / �ü� = �� -> �� * 3600 (�ʷ� ��ȯ) -> �ð�, ��, �ʸ� ���ϱ�
		c = a / b;
		d = a / b;
		e = (a / b - c);
		
		System.out.println("����Ÿ� : " + a + "km" + " �ü� : " + b + "km/h");
		System.out.printf("%d�� %d�� %.2f��\n", c, d, e);
		System.out.println(d);
		
		sc.close();
	}

}
