package score2;

import java.util.Scanner;

/* ��¥ : 2018.12.24
 * ���� : ScoreApp 
 * ��Ÿ : 
 * */

public class ScoreApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int ch;
		
		Score ss = new ScoreImpl();
		
		while (true) {
			do {
				System.out.println("1.�Է� 2.��� 3.�̸��˻� 4.�й��˻� 5.���� 6.���� 7.���(������) 8.����");
				ch = sc.nextInt();
			} while(ch < 1 || ch > 8);
			
			if (ch == 8) {
				break;
			}
			
			switch (ch) {
			case 1 : ss.input(); break;
			case 2 : ss.print(); break;
			case 3 : ss.searchName(); break;
			case 4 : ss.searchHak(); break;
			case 5 : ss.update(); break;
			case 6 : ss.delete(); break;
			case 7 : ss.sortTot(); break;
			}
		}
		
		sc.close();
	}

}
