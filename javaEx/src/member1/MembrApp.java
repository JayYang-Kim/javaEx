package member1;

import java.util.Scanner;

public class MembrApp {
	private static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		
		int ch;
		Member mm=new MemberImpl();
		
		while(true) {
			if(mm.loginMember()==null) {
				do {
					System.out.print("1.ȸ������ 2.�α��� 3.���� => ");
					ch = sc.nextInt();
				} while(ch<1||ch>3);
				
				if(ch==3) break;
				
				switch (ch) {
				case 1:mm.insert(); break;
				case 2:mm.login(); break;
				}
				
			} else {
				System.out.println(mm.loginMember().getName()+"��...");
				do {
					System.out.print("1.�α׾ƿ� 2.���� 3.ȸ��Ż�� 4.��ü����Ʈ => ");
					ch = sc.nextInt();
				} while(ch<1||ch>4);
				
				switch (ch) {
				case 1:mm.logout(); break;
				case 2:mm.update(); break;
				case 3:mm.delete(); break;
				case 4:mm.list(); break;
				}
			}
		}
		
		sc.close();
	}
}
