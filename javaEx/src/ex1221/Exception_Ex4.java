package ex1221;

import java.util.Scanner;

/* ��¥ : 2018.12.21
 * ���� : ���� (Exception) ó��
 * ��Ÿ : 
 * */

public class Exception_Ex4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a;
		
		try {
			System.out.println("���̸� �Է����ּ���.");
			a = sc.nextInt();
			
			System.out.println(a > 19 ? "����" : "�̼�����");
		} catch (Exception e) {
			System.out.println(e.toString());
		} finally {
			if (sc != null) {
				sc.close();
			}
		}
	}

}
