package yangStudy;

import java.util.Scanner;

public class BankApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BankService bs = new BankService();
		
		int select;
		
		// ���� ����
		while (true) {
			if (bs.loginCheck() == null) {
				// �۾� ���� ���� (��α���)
				do {
					System.out.println("====================================================================================================");
					System.out.println("[1.���»���] [2.�α���] [3.����]");
					System.out.println("====================================================================================================");
					select = sc.nextInt();
				} while(select < 1 || select > 3); // 1 ~ 6 ���̰��� �ƴ� ��� ���Է� ó��
				
				// ���� ó��
				if (select == 3) {
					System.out.println("====================================================================================================");
					System.out.println("�ý����� ����Ǿ����ϴ�.");
					System.out.println("====================================================================================================");
					break; // ���� ���� ����� (while���� ���)
				}
				
				switch (select) {
				case 1 : bs.newAccount(); break;
				case 2 : bs.login(); break;
				}
			} else {
				System.out.println();
				System.out.println("====================================================================================================");
				System.out.println(bs.loginCheck().getName() + "�� ȯ���մϴ�.");
				System.out.println("====================================================================================================");
				System.out.println();
				
				// �۾� ���� ���� (�α���)
				do {
					System.out.println("====================================================================================================");
					System.out.println("[1.�Ա�] [2.���] [3.�۱�] [4.���� ��ȸ] [5.���� ����] [6.�α׾ƿ�] [7.����]");
					System.out.println("====================================================================================================");
					select = sc.nextInt();
				} while(select < 1 || select > 7); // 1 ~ 6 ���̰��� �ƴ� ��� ���Է� ó��
				
				// ���� ó��
				if (select == 7) {
					System.out.println("====================================================================================================");
					System.out.println("�ý����� ����Ǿ����ϴ�.");
					System.out.println("====================================================================================================");
					break; // ���� ���� ����� (while���� ���)
				}
				
				switch (select) {
				case 1 : bs.deposit(); break;
				case 2 : bs.withdraw(); break;
				case 3 : bs.remit(); break;
				case 4 : bs.checkBalance(); break;
				case 5 : bs.delete(); break;
				case 6 : bs.logout(); break;
				}	
			}
			
		}
		
		sc.close();
	}

}
