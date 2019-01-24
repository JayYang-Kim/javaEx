package ex1213;

import java.util.Scanner;

/* ��¥ : 2018.12.12
 * ���� : Class, Method ���� 
 * ��Ÿ : ����ǥ�� ����ϴ� ���α׷� (�ִ� 50��)
 *      ������ : �̸�, ����, ����, ����, ����, ���, ���� => 50, �ο���
 *      ��� : �Է�, ���, ����, ����
 *      
 *      �帧�� : 1.�Է� 2.��ü��� 3.����
 * */

class Person {
	// �ʵ� ����
	String name; // private String name;
	int []score = new int[3];
	int tot, ave, rank; // ����, ���, ����
}

class Score {
	// �ʵ� ����
	private Scanner sc = new Scanner(System.in);
	
	private int inwon; // �ο� ���� ���� ����
	private Person []list = new Person[50]; // ��ü ���� / Person a1, a2, a3 ... a50 (����)
	
	// �Է� (Method)
	public void input() {
		// �ο����� 50�̻��̸� input �޼ҵ� ����
		if (inwon >= 50) {
			System.out.println("�ο��� �Է� �ʰ��Դϴ�.");
			return; // input �޼ҵ� ����
		}
		
		System.out.println("�����͸� �Է��ϼ���.");
		
		String []tt = {"����?", "����?", "����?"};
		
		list[inwon] = new Person(); // �޸� �Ҵ�
		
		System.out.println("�̸��� �Է����ּ���.");
		
		// �̸� �Է�
		list[inwon].name = sc.next();
		
		// 0 ~ list[inwon].score.[����]��ŭ �ݺ� / 0 ~ 2 (3�� �ݺ�)
		for (int i = 0; i < list[inwon].score.length; i++) {
			System.out.println(tt[i]); // [���] ����? ����? ����?
			// ���� �Է�
			list[inwon].score[i] = sc.nextInt();
			
			// ���� = �Է��� ������ �ٷ� ����
			list[inwon].tot += list[inwon].score[i];
		}
		
		// ��� ���ϱ� 
		list[inwon].ave = list[inwon].tot / 3;
		
		// �ο��� ����
		inwon++;
	}
	
	// ��� (Method)
	public void write() {
		System.out.println("������ ���");
		
		double p, t;
		
		rank();
		
		for (int i = 0; i < inwon; i ++) {
			System.out.print(list[i].name + "\t"); // �̸�
			
			for (int j = 0; j < list[i].score.length; j++) {
				System.out.print(list[i].score[j] + "\t"); // ����, ����, ���� ���� ���
			}
			
			System.out.print(list[i].tot + "\t"); // ���� ���
			System.out.print(list[i].ave + "\t"); // ��� ���
			System.out.print(list[i].rank);
			
			System.out.println();
			
			System.out.print("\t");
			
			System.out.println();
			
			t = 0;
			System.out.print("���� : \t");
			for (int j = 0; j < list[i].score.length; j++) {
				p = grade(list[i].score[j]);
				t += p;
				System.out.print(grade(list[i].score[j]) + "\t");
			}
			
			System.out.print(t + "\t"); // �հ��� ����
			System.out.print((t/3) + "\n"); // ����� ���� 
		}
	}
	
	// ���� ���ϱ� (Method)
	public double grade(int s) {
		double n;
		
		if(s >= 95) {
			n = 4.5;
		} else if (s >= 90) {
			n = 4.0;
		} else if (s >= 85) {
			n = 3.5;
		} else if (s >= 80) {
			n = 3.0;
		} else if (s >= 75) {
			n = 2.5;
		} else if (s >= 70) {
			n = 2.0;
		} else if (s >= 65) {
			n = 1.5;
		} else if (s >= 60) {
			n = 1.0;
		} else {
			n = 0.0;
		}
		
		return n;
	}
	
	// ���� ���ϱ�
	public void rank() {
		for (int i = 0; i < inwon; i++) {
			list[i].rank = 1;
		}
		
		for (int i = 0; i < inwon - 1; i++) {
			for (int j = i + 1; j < inwon; j++) {
				if(list[i].tot > list[j].tot) {
					list[j].rank++;
				} else if (list[i].tot < list[j].tot) {
					list[i].rank++;
				}
			}
		}
	}
	
}

public class Method_Ex8 {
	
	public static void main(String[] args) {
		// �Է�, ���, ���Ḧ �Է��� Scanner
		Scanner sc = new Scanner(System.in);
		
		// �Է�, ���, ���� ���� ������ ���� ����
		int n;
		
		// Score �޼ҵ� ��ü ���� (�޸� �Ҵ�)
		Score ss = new Score();
		
		// ���ѷ���
		while(true) {
			// 1 ~ 3�� ���ڰ� �ƴ� ��� ���Է� ó��
			do {
				System.out.println("1.�Է� 2.��� 3.���� =>");
				n = sc.nextInt();
			} while(n < 1 || n > 3);
			
			// �Է��� ���� ���� ó��
			switch(n) {
			case 1 : ss.input();break; // input Method ����
			case 2 : ss.write();break; // write Method ����
			default : sc.close(); return; //�Է� ���� �� main �޼ҵ� ������
			}
		}
	}

}