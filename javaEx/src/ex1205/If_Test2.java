package ex1205;

import java.util.Scanner;

/* ��¥ : 2018.12.05
 * ���� : ���ǹ� ���� (if)
 * ��Ÿ : �� ������ �Է� �޾� �Է� ���� ���� ū ������ �������� �� ���̸� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * */
public class If_Test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.println("ù��° ������ �Է��� �ּ���.");
		a = sc.nextInt();
		System.out.println("�ι�° ������ �Է��� �ּ���.");
		b = sc.nextInt();
		
		// a, b ���� ��
		if(a >= b) {
			c = a - b;
		} else {
			c = b - a;
		}
		
		System.out.println("�μ��� ���� : " + c);
	}

}
