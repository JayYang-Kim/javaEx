package join;

import java.util.Scanner;

public class JoinApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Join join = new JoinImpl();
		
		int ch;
		
		while (true) {
			// 1 ~ 7 사이가 아닐 경우, 재입력 처리
			do {
				System.out.println("[1.회원가입] [2.로그인] [3.로그아웃] [4.회원정보 수정] [5.회원탈퇴] [6.전체 회원 리스트] [7.종료]");
				ch = sc.nextInt();
			} while(ch < 1 || ch > 7);
			
			// 종료 처리
			if (ch == 7) {
				System.out.println("프로그램이 종료되었습니다.");
				break;
			}
			
			switch (ch) {
			case 1 : join.join(); break;
			case 2 : join.logIn(); break;
			case 3 : join.logOut(); break;
			case 4 : join.update(); break;
			case 5 : join.delete(); break;
			case 6 : join.allList(); break;
			}
		}
		
		System.out.println();
	}

}
