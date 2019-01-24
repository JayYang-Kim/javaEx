package yangStudy;

import java.util.Scanner;

/* ��¥ : 2018.12.19
 * ���� : �Է�, ���, �����˻�, ����, ����, ���Ḧ �����ϴ� ���α׷�
 * ��Ÿ :
 * ���� class : Score, ScoreService, ScoreVO   
 * */

public class ScoreApp {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ScoreService ss = new ScoreService();
		
		int choice; // Ű���� ������ �Է¹��� ����
		
		// ���ѷ���
		while (true) {
			do {
				System.out.println("������ �Է¹޴� ���α׷��Դϴ�.\n������ �Ͻðڽ��ϱ�?");
				System.out.println("[1.�Է�] [2.���] [3.�й��˻�] [4.����] [5.����] [6.����]");
				choice = sc.nextInt();
			} while(choice < 1 || choice > 6); // �Է� ���ڰ� 1 ~ 6 ���̰� �ƴҰ�� ���Է� ó��
			
			// ��� ����
			switch (choice) {
			case 1 : ss.input(); break;
			case 2 : ss.print(); break;
			case 3 : ss.searchHakbun(); break;
			case 4 : ss.update(); break;
			case 5 : ss.delete(); break;
			}
			
			// ���� ó��
			if(choice == 6) {
				System.out.println("���α׷��� ����Ǿ����ϴ�.");
				break;
			}
		}
		
		sc.close();
	}

}
