package book1;

import java.io.IOException;
import java.util.Scanner;

/*
 * 작성자 : 이민영
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
					System.out.print("1.회원가입 2.로그인 3.종료 => ");
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
					System.out.println("관리자님 환영합니다.");
					do {
						System.out.print("1.책 추가 2.책 삭제 3.책 리스트 4.회원리스트 5.종료 => ");
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
					System.out.println(gg.loginMember().getName() + "님 환영합니다.");
					do {
						System.out.print("1.로그아웃 2.대여 3.반납 4.대여리스트 5.책 검색 6.회원수정 7.회원탈퇴 => ");
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
