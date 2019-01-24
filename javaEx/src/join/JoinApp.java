package join;

import java.util.Scanner;

public class JoinApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Join join = new JoinImpl();
		
		int ch;
		
		while (true) {
			// 1 ~ 7 ���̰� �ƴ� ���, ���Է� ó��
			do {
				System.out.println("[1.ȸ������] [2.�α���] [3.�α׾ƿ�] [4.ȸ������ ����] [5.ȸ��Ż��] [6.��ü ȸ�� ����Ʈ] [7.����]");
				ch = sc.nextInt();
			} while(ch < 1 || ch > 7);
			
			// ���� ó��
			if (ch == 7) {
				System.out.println("���α׷��� ����Ǿ����ϴ�.");
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
