package ex1221;

import java.util.Scanner;

/* ��¥ : 2018.12.21
 * ���� : ���� (Exception) ó��
 * ��Ÿ : try-with-resources
 * */

public class Exception_Ex5 {

	public static void main(String[] args) {
		int a;
		
		try (Scanner sc = new Scanner(System.in)){ // jdk7.0���ʹ� �ڵ����� close()���ش�.
			System.out.println("���̸� �Է����ּ���.");
			a = sc.nextInt();
			
			System.out.println(a > 19 ? "����" : "�̼�����");
		} catch (Exception e) {
			System.out.println(e.toString());
		} 
	}

}
