package ex1204;

import java.util.Scanner;

/* ��¥ : 2018.12.04
 * ���� : Scanner �׽�Ʈ (nextLine)
 * ��Ÿ :
 * */
public class ScannerEx2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		int age;
		String tel;
		
		System.out.print("�̸� ?");
		name = sc.nextLine(); // ���� �Է� ����
		
		System.out.print("���� ?");
		age = sc.nextInt();
		sc.nextLine(); // enter �Է��� ������ ó�� (�� ó���� ���� ��� ��ȭ��ȣ �Է��ʿ��� enter�� �ԷµǾ� ��ȭ��ȣ�� ���� �� ����)
		
		System.out.print("��ȭ��ȣ ?");
		tel = sc.nextLine(); // ���� �Է� ����
		
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age);
		System.out.println("��ȭ��ȣ : " + tel);
		
		sc.close();
	}

}