package ex1205;

import java.util.Scanner;

/* ��¥ : 2018.12.05
 * ���� : ���� ������ (���� ������) or (���� ������)
 * ��Ÿ : 
 * */
public class Oper_Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// ������ �Է� �޾� ���밪 ���ϱ�
		/*int a, b;
		
		System.out.print("������ �Է����ּ���.");
		a = sc.nextInt();
		
		b = a > 0 ? a : -a;
		System.out.println(a + "�� ���밪 : " + b);*/
		
		// ������ �Է� �޾� ���, ����, ������ �Ǻ�
		int c;
		String s;
		System.out.println("������ �Է����ּ���.");
		c = sc.nextInt();
		
		s = c > 0 ? "���" : (c == 0 ? "��" : "����");
		
		System.out.println(c + " : " + s);
		
		sc.close();
	}

}
