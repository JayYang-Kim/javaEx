package ex1213;

import java.util.Scanner;

/* ��¥ : 2018.12.12
 * ���� : Class, Method ���� 
 * ��Ÿ : ��ǻ�Ϳ� ����, ����, ���ϴ� ���α׷�
 * */

public class Method_Ex7 {
	// ���α׷� ����
	public static void menu() { // Ŭ���� �޼ҵ� ����
		System.out.println("===== ���� =====");
		System.out.println("1. ���� 2. ���� 3. �� 4. ����");
		System.out.println("===============");
		System.out.print("����[1~4] : ");
	}
	
	// ���ڸ� �Է� �� 1 == ����, 2 == ����, 3 == ���� ���
	public static String convertText(int n) { // Ŭ���� �޼ҵ� ����
		return n == 1 ? "����" : (n == 2 ? "����" : "��");
	}
	
	// ��ǻ�� ���� ����
	public static int com() { // Ŭ���� �޼ҵ� ����
		return (int)(Math.random() * 3) + 1;
	}
	
	static Scanner sc = new Scanner(System.in);
	// ���� ����
	public static int user() { // Ŭ���� �޼ҵ� ����
		
		int a;
		do {
			menu(); // ���α׷� ���� �޼ҵ� ���
			a = sc.nextInt(); // a������ ���� �ޱ�
		} while(a < 1 || a > 4); // 1���� �۰ų�, 4���� Ŭ��� ���Է� ó��
		
		return a;
	}
	
	public static void main(String[] args) {
		int u, c;
		
		while(true) {
			// ���� �Է�
			u = user();
			
			// ������ ���Ḧ ��û
			if (u == 4) {
				break;
			}
			
			// ��ǻ�� �Է�
			c = com();
			
			// ������ ��ǻ�� �Է°� ���
			System.out.println();
			System.out.println("���� : " + u + " , " + convertText(u));
			System.out.println("��ǻ�� : " + c + " , " + convertText(c));
			
			// ����
			if (u == c) {
				System.out.println("�����ϴ�.");
				System.out.println();
			} else if ((u == 1 && c == 3) || (u == 2 && c == 1) || (u == 3 && c ==2)) {
				System.out.println("������ �¸��߽��ϴ�.");
				System.out.println();
			} else {
				System.out.println("��ǻ�Ͱ� �¸��߽��ϴ�.");
				System.out.println();
			}
		}
	}

}
