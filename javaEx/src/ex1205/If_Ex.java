package ex1205;

import java.util.Scanner;

/* ��¥ : 2018.12.05
 * ���� : ���ǹ� (if)
 * ��Ÿ : 
 * */
public class If_Ex {

	public static void main(String[] args) {
		// ���밪 ���ϱ�
		/*int a = -10;
		if (a < 0) {
			a = -a;
		}
		System.out.println("���밪 : " + a);*/
		
		// Ȧ��, ¦�� ���ϱ�
		/*int a = 37;
		if (a%2 == 1)
		//if((a&1) == 1) // ��Ʈ ������ ��� (== �켱������ ���Ƽ� ��ȣ �Է��Ͽ� �켱���� ����)
			System.out.println(a + " : Ȧ��");*/
		
		Scanner sc = new Scanner(System.in);
		
		int a, b, c, t;
		
		System.out.println("������ ���� �Է����ּ���.");
		
		// ������ �� ex) 45 22 65 -> 22 45 65
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		if (a > b) { // t = 45, a = 22, b = 45
			t = a; a = b; b = t;
		}
		
		// �ּҰ� ���ϱ�
		if (a > c) { // a = 22
			t = a; a = c; c = t;
		}
		
		if (b > c) {
			t = b; b = c; c = t;
		}
		
		System.out.println(a + " , " + b + " , " + c);
	}

}
