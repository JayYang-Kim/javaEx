package ex1205;

import java.util.Scanner;

/* ��¥ : 2018.12.05
 * ���� : ���� ������ �׽�Ʈ2
 * ��Ÿ : + 32 (�ҹ���) / - 32 (�빮��) 
 * */
public class Oper_Test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char a, b;
		
		System.out.println("���ڸ� �Է����ּ���.");
		a = sc.next().charAt(0);
		
		// ����� �� : 3���� (�빮��, �ҹ���, ����)
		b = a >= 'A' && a <= 'Z' ? (char)(a + 32) : (a >= 'a' && a <= 'z' ? (char)(a - 32) : a) ;
		
		System.out.println(b);
		
		sc.close();
	}

}