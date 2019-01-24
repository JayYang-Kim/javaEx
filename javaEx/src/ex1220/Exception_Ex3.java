package ex1220;

import java.util.InputMismatchException;
import java.util.Scanner;

/* ��¥ : 2018.12.20
 * ���� : ����(Exception) ó��
 * ��Ÿ : unchecked exception
 * */

public class Exception_Ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b, c;
		
		try {
			System.out.println("�μ��� �Է����ּ���.");
			
			a = sc.nextInt();
			b = sc.nextInt();
			
			c = a + b;
			
			System.out.println("��� : " + c);
		} catch(InputMismatchException e) { // unchecked ����
			System.out.println("������ �Է� �����մϴ�.");
			//e.printStackTrace();
		} finally {
			System.out.println("���ܹ߻� ���ο� ���þ��� ����");
			sc.close();
		}
		
		System.out.println("����");
	}

}
