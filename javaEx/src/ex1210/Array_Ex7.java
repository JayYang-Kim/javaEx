package ex1210;

import java.util.Scanner;

/* ��¥ : 2018.12.10
 * ���� : Array(�迭) �׽�Ʈ
 * ��Ÿ : 5���� �̸��� ������ �Է� �޾� ������ ����Ͽ� ����ϰ�, �������� ���հ� ����� ����ϴ� ���α׷� 
 * */
public class Array_Ex7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String []name = new String[5];
		int []score = new int[5];
		
		int tot = 0;
		double ave;
		
		// 5���� �̸��� ���� �Է� �ޱ�
		for(int i = 0; i < name.length; i++) {
			System.out.println((i + 1) + "��° �̸��� �Է����ּ���.");
			name[i] = sc.next();
			System.out.println("������ �Է����ּ���.");
			score[i] = sc.nextInt();
			
			tot += score[i]; // ���� ���
		}
		
		ave = (double)tot / 5; // ���
		
		System.out.println("�̸�\t����\t����");
		
		for(int i = 0; i < name.length; i++) {
			// ���� (���� - ���)
			System.out.println(name[i] + "\t" + score[i] + "\t" + (score[i] - ave));
		}
		
		System.out.println("���� : " + tot);
		System.out.println("��� : " + ave);
		
		sc.close();
	}

}