package ex1211;

import java.util.Scanner;

/* ��¥ : 2018.12.11
 * ���� : sort ����
 * ��Ÿ : 
 * */
public class Sort_Ex2 {

	public static void main(String[] args) {
		// 1) ���� ����ϴ� ���α׷�
		Scanner sc = new Scanner(System.in);
		
		// int inwon = 5;
		// String []name = new String[inwon];
		String []name = new String[5];
		int []score = new int [5];
		int []rank = new int [5];
		
		// 5�� ���� �̸�, ���� �Է� �ޱ�
		for (int i = 0; i < name.length; i++) {
			System.out.println((i + 1) + "��° �̸��� �Է��� �ּ���.");
			name[i] = sc.next();
			
			// ������ 0���� �۰ų� 100���� Ŭ��� ���Է�
			do {
				System.out.println("������ �Է����ּ���.");
				score[i] = sc.nextInt();
			} while(score[i] < 0 || score[i] > 100);
		}
		
		// ���� ��� (���� ��� �� �ʱⰪ�� 1�� ����)
		for (int i = 0; i < rank.length; i ++) {
			rank[i] = 1;
		}
		
		// Selection sort���
		for (int i = 0; i < score.length; i++) {
			for(int j = i + 1; j < score.length; j++) {
				if(score[i] > score[j]) {
					rank[j]++;
				} else if (score[i] < score[j]) {
					rank[i]++;
				}
			}
		}
		
		// �̸�, ���� �̸��� �迭����ŭ ���
		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i] + "\t" + score[i] + "\t" + rank[i]);
		}
		
		sc.close();
	}

}
