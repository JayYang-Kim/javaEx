package ex1204;

import java.util.Scanner;

/* ��¥ : 2018.12.04
 * ���� : Scanner �׽�Ʈ
 * ��Ÿ : scanner class import�ϱ� 
 * */
public class ScannerEx {

	public static void main(String[] args) {
		// System.in : ǥ���Է�
		// System.out : ǥ�����

		Scanner sc = new Scanner(System.in); // scanner ��ü ����

		String name;
		int age;
		char gender;
		double height;

		System.out.print("�̸� ? ");
		name = sc.next(); // (���ڿ� �Է�) ������ �Է� �Ұ�, ���� �Ǵ� ������ ���� ����

		System.out.print("���� ? ");
		age = sc.nextInt(); // (���� �Է�)

		System.out.print("���� ?");
		gender = sc.next().charAt(0); // ���� �Է�, charAt(0) �Է±��ڿ��� ù ��° ���ڸ� ������

		System.out.print("Ű ?");
		height = sc.nextDouble();

		System.out.printf("�̸� : %s \t ���� : %d \n", name, age);
		System.out.printf("���� : %c \t Ű : %f \n", gender, height);

		sc.close(); // scanner ����
	}

}