package ex1204;

import java.util.Scanner;

/* ��¥ : 2018.12.04
 * ���� : ���� 1) �ʸ� �Է� �޾� ��, ��, �ʷ� ��ȯ�ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * 		   
 * ��Ÿ : 
 * */
public class OperatorTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b, c, d;
		
		System.out.println("�ʸ� �Է����ּ���.");
		a = sc.nextInt(); // �� �Է�
		
		b = a / 3600; // �ð� ���ϱ�
		c = (a % 3600) / 60; // �� ���ϱ�
		d = (a % 3600) % 60; // �� ���ϱ�
		
		/* Ǯ�� */
		/*b = a/3600;
		c = (a/60)%60;
		d =a%60;*/
		
		/*System.out.print(a + "�ʴ� ");
		System.out.print(b + "�ð� ");
		System.out.print(c + "�� ");
		System.out.print(d + "��");*/
		
		System.out.printf("%d�ʴ� %d�ð� %d�� %d��", a, b, c, d);
		
		sc.close();
	}
}
