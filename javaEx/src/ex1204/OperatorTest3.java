package ex1204;

import java.util.Scanner;

/* ��¥ : 2018.12.04
 * ���� : ���� 3) �����µ��� �Է� �޾� ȭ���µ��� ��ȯ�ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * 		   
 * ��Ÿ : 
 * */
public class OperatorTest3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a;
		double b;
		
		System.out.println("�����µ��� �Է����ּ���.");
		a = sc.nextInt(); // �����µ� �Է�
		
		b = a * 1.8 + 32; // ȭ���µ� ��� (�����µ� * 1.8 + 3.2)
		
		System.out.printf("%.1f", b);
		
		sc.close();
	}

}
