package ex1207;

import java.util.Scanner;

/* ��¥ : 2018.12.07
 * ���� : while / do ~ while�� ����
 * ��Ÿ : 
 * */
public class While_Test6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int com, user, cnt;
		
		// ���� ����
		com = (int)(Math.random() * 100) + 1;
		
		cnt = 0;
		
		/*while(true) {
			// ����� �� �Է�
			System.out.println("���� �Է����ּ���");
			user = sc.nextInt();
			cnt++;
			
			if(com > user) {
				System.out.println("�Է��� ������ ū���Դϴ�.");
			} else if (com < user) {
				System.out.println("�Է��� ������ �������Դϴ�.");
			} else if (com == user) {
				System.out.println(cnt + "�� ���� �����߽��ϴ�.");
				break;
			}
		}*/
		
		while (true) {
			System.out.println("���� �Է����ּ���.");
			user = sc.nextInt();
			cnt++;
			
			if(user == com) {
				System.out.println(cnt + "�� ���� �����߽��ϴ�.");
				break;
			} else if (user > com) {
				System.out.println("�Է��� ������ �������Դϴ�.");
			} else if (user < com) {
				System.out.println("�Է��� ������ ū���Դϴ�.");
			}
		}
		
		sc.close();
	}

}