package book1;

import java.io.IOException;
import java.util.Scanner;

/*
 * �ۼ��� : �̹ο�
 */

public class BookApp {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ListVO list = new ListVO();
		
		int ch;
		
		AdminService aa = new AdminImpl(list);
		BookService bb = new BookImpl(list);
		UserService uu = new UserImpl(list);
		LoginService gg = new LoginImpl(list);
		
		
		gogo :
		while (true) {

			if (gg.loginMember() == null) {
				do {
					System.out.print("1.ȸ������ 2.�α��� 3.���� => ");
					ch = sc.nextInt();

				} while (ch < 1 || ch > 3);

				if (ch == 3)
					break;

				switch (ch) {
				case 1:
					uu.join();
					break;
				case 2:
					gg.logIn();
					break;
				}

			} else {
				if (gg.loginMember().getId().equals("admin")) {
					System.out.println("�����ڴ� ȯ���մϴ�.");
					do {
						System.out.print("1.å �߰� 2.å ���� 3.å ����Ʈ 4.ȸ������Ʈ 5.���� => ");
						ch = sc.nextInt();
					} while (ch < 1 || ch > 5);

					if (ch == 5)
						gg.logOut();

					switch (ch) {
					case 1:
						aa.bookAdd();
						break;
					case 2:
						aa.bookDelete();
						break;
					case 3:
						aa.bookPrint();
						break;
					case 4:
						aa.serachPrint();
						break;

					}
				} else {
					System.out.println(gg.loginMember().getName() + "�� ȯ���մϴ�.");
					do {
						System.out.print("1.�α׾ƿ� 2.�뿩 3.�ݳ� 4.�뿩����Ʈ 5.å �˻� 6.ȸ������ 7.ȸ��Ż�� => ");
						ch = sc.nextInt();
					} while (ch < 1 || ch > 7);

					switch (ch) {
					case 1:
						gg.logOut();
						break;
					case 2:
						bb.bookRent(gg.loginMember());
						break;
					case 3:
						bb.bookRetrun(gg.loginMember());
						break;
					case 4:
						bb.bookList(gg.loginMember());
						break;
					case 5:
						try {
							aa.searchBook();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						break;
					case 6:
						uu.update(gg.loginMember());
						break;
					case 7:
						uu.userDelete(gg.loginMember());
						gg.loginMemberNull();
						break;
					}

				}
			}

		}

	}

}
