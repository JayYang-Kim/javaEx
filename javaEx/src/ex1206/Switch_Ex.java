package ex1206;

import java.util.Scanner;

/* ��¥ : 2018.12.06
 * ���� : switch ~ case�� �׽�Ʈ
 * ��Ÿ : 
 * */
public class Switch_Ex {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int a;
		
		System.out.println("���� �Է����ּ���");
		a = sc.nextInt();
		
		// byte, short, char, int, String(java7.0), enum�� ��밡��
		/*switch (a) {
		case 3 : System.out.print("*");
		case 2 : System.out.print("*");
		case 1 : System.out.print("*");
		}*/
		
		/*switch (a) {
		case 3 : System.out.println("***"); break;
		case 2 : System.out.println("**"); break;
		case 1 : System.out.println("*"); break;
		}*/
		
		/*switch (a%3) {
		case 0 : System.out.println("3�� ����Դϴ�."); break;
		case 1 : 
		case 2 : System.out.println("3�� ����� �ƴմϴ�."); break;
		}*/
		
		switch (a) {
		case 3 : System.out.println("***"); break;
		case 2 : System.out.println("**"); break;
		case 1 : System.out.println("*"); break;
		default : System.out.println("�Է� ����"); break;
		}
		
		sc.close();
	}

}
