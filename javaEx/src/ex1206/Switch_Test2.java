package ex1206;

import java.util.Scanner;

/* ��¥ : 2018.12.06
 * ���� : switch ~ case�� ����
 * ��Ÿ : �μ� �� �����ڸ� �Է� �޾� �Է� ���� �����ڿ� ���� ������ �����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * */
public class Switch_Test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		char c;
		
		System.out.println("ù��° ���� �Է����ּ���.");
		a = sc.nextInt();
		System.out.println("�ι�° ���� �Է����ּ���.");
		b = sc.nextInt();
		System.out.println("�����ڸ� �Է����ּ���.");
		c = sc.next().charAt(0);
		
		switch (c) {
		case '+' : System.out.println(a + " + " + b + " = " + (a + b)); break;
		case '-' : System.out.println(a + " - " + b + " = " + (a - b)); break;
		case '*' : System.out.println(a + " * " + b + " = " + (a * b)); break;
		case '/' : System.out.println(a + " / " + b + " = " + (a / b)); break;
		default : System.out.println("�Է� ����");
		}
		
		sc.close();
	}

}
