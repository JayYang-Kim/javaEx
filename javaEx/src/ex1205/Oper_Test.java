package ex1205;

import java.util.Scanner;

/* ��¥ : 2018.12.05
 * ���� : ���� ������ �׽�Ʈ
 * ��Ÿ : 
 * */
public class Oper_Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a;
		String b;
		
		System.out.println("�⵵�� �Է����ּ���.");
		a = sc.nextInt();
		
		b = (a % 4 == 0) && (a % 100 != 0) || (a % 400 == 0) ? "����" : "���"  ;
		
		System.out.println(a + "�� : " + b);
		
		sc.close();
	}

}
