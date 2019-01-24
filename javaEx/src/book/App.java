package book;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Library lib = new Library();
		Scanner sc = new Scanner(System.in);
		int ch;

		try {
			System.out.println("** 우리 도서관 **");
			
			while (true) {
				System.out.println("\n[메인 메뉴]");

				if (lib.getLoginVO() == null) {
					do {
						System.out.print("1.로그인 2.회원가입 3.종료 => ");
						ch = sc.nextInt();
					} while (ch < 1 || ch > 3);
					switch (ch) {
					case 1:lib.login();	break;
					case 2:
						lib.insertMember(); break;
					case 3: System.exit(0);
					}
				} else if (lib.getLoginVO().getId().equals("admin")) {
					System.out.println(lib.getLoginVO().getName() + "님...");

					do {
						System.out.print("1.도서 관리 2.회원관리 3.로그아웃 4.종료 => ");
						ch = sc.nextInt();
					} while (ch < 1 || ch > 4);
					switch (ch) {
					case 1:lib.bookManage(); break;
					case 2:lib.memberManage(); break;
					case 3:lib.logout(); break;
					case 4:System.exit(0);
					}

				} else {
					System.out.println(lib.getLoginVO().getName() + "님...");

					do {
						System.out.print("1.도서대여 2.도서검색 3.로그아웃 4.정보수정 5.탈퇴 6.종료 => ");
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
