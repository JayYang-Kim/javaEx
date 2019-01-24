package yangStudy.study190103;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BankApp {
	
	private static void menu() {
		System.out.println("====================================================================================================");
		System.out.println("[1.���»���] [2.�α���] [3.����]");
		System.out.println("====================================================================================================");
	}
	
	private static void menuAdmin() {
		System.out.println("====================================================================================================");
		System.out.println("[1.�Ա�] [2.���] [3.�۱�] [4.���� ��ȸ] [5.���� ����] [6.�α׾ƿ�] [7.����]");
		System.out.println("====================================================================================================");
	}
	
	private static void menuExit() {
		System.out.println("====================================================================================================");
		System.out.println("�ý����� ����Ǿ����ϴ�.");
		System.out.println("====================================================================================================");
	}
	
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Bank bs = new BankService(); 
		
		int select;
		
		// ���� ����
		while (true) {
			// �۾� ���� ���� (��α���)
			if (bs.loginCheck() == null) {
				try {
					do {
						menu();
						select = Integer.parseInt(br.readLine());
					} while(select < 1 || select > 3); // 1 ~ 6 ���̰��� �ƴ� ��� ���Է� ó��
					
					// ���� ó��
					if (select == 3) {
						menuExit();
						break; // ���� ���� ����� (while���� ���)
					}
					
					switch (select) {
					case 1 : bs.newAccount(); break;
					case 2 : bs.login(); break;
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			// �۾� ���� ���� (�α���)
			} else {
				System.out.println();
				System.out.println("====================================================================================================");
				System.out.println(bs.loginCheck().getName() + "�� ȯ���մϴ�.");
				
				// �۾� ���� ���� (�α���)
				try {
					do {
						menuAdmin();
						select = Integer.parseInt(br.readLine());
					} while(select < 1 || select > 7); // 1 ~ 6 ���̰��� �ƴ� ��� ���Է� ó��
					
					// ���� ó��
					if (select == 7) {
						menuExit();
						break; // ���� ���� ����� (while���� ���)
					}
					
					switch (select) {
					case 1 : bs.deposit(); break;
					case 2 : bs.withdraw(); break;
					case 3 : bs.remit(); break;
					case 4 : bs.selectAccount(); break;
					case 5 : bs.delete(); break;
					case 6 : bs.logout(); break;
					}	
				} catch (IOException e) {
					e.printStackTrace();
				}
			} // else
		} // while
	} // main()

} // class BankApp
