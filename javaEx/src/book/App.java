package book;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Library lib = new Library();
		Scanner sc = new Scanner(System.in);
		int ch;

		try {
			System.out.println("** �츮 ������ **");
			
			while (true) {
				System.out.println("\n[���� �޴�]");

				if (lib.getLoginVO() == null) {
					do {
						System.out.print("1.�α��� 2.ȸ������ 3.���� => ");
						ch = sc.nextInt();
					} while (ch < 1 || ch > 3);
					switch (ch) {
					case 1:lib.login();	break;
					case 2:
						lib.insertMember(); break;
					case 3: System.exit(0);
					}
				} else if (lib.getLoginVO().getId().equals("admin")) {
					System.out.println(lib.getLoginVO().getName() + "��...");

					do {
						System.out.print("1.���� ���� 2.ȸ������ 3.�α׾ƿ� 4.���� => ");
						ch = sc.nextInt();
					} while (ch < 1 || ch > 4);
					switch (ch) {
					case 1:lib.bookManage(); break;
					case 2:lib.memberManage(); break;
					case 3:lib.logout(); break;
					case 4:System.exit(0);
					}

				} else {
					System.out.println(lib.getLoginVO().getName() + "��...");

					do {
						System.out.print("1.�����뿩 2.�����˻� 3.�α׾ƿ� 4.�������� 5.Ż�� 6.���� => ");
						ch = sc.nextInt();
					} while (ch < 1 || ch > 6);
					switch (ch) {
					case 1: lib.rentalManage(); break;
					case 2: lib.searchBook(); break;
					case 3: lib.logout(); break;
					case 4: lib.updateMember(); break;
					case 5: lib.deleteMember(); break;
					case 6: System.exit(0);
					}
				}
			}

		} finally {
			sc.close();
		}
	}
}
